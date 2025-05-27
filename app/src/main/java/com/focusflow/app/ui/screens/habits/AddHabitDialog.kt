package com.focusflow.app.ui.screens.habits

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.focusflow.app.data.database.entities.HabitFrequency

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddHabitDialog(
    onDismiss: () -> Unit,
    onAddHabit: (String, String, HabitFrequency, Int, String, String) -> Unit
) {
    var title by remember { mutableStateOf("") }
    var description by remember { mutableStateOf("") }
    var selectedFrequency by remember { mutableStateOf(HabitFrequency.DAILY) }
    var targetCount by remember { mutableStateOf(1) }
    var selectedColor by remember { mutableStateOf("#4CAF50") }
    var selectedIcon by remember { mutableStateOf("🎯") }
    
    val colors = listOf(
        "#4CAF50", // Green
        "#2196F3", // Blue
        "#FF9800", // Orange
        "#F44336", // Red
        "#9C27B0", // Purple
        "#607D8B", // Blue Grey
        "#795548", // Brown
        "#E91E63"  // Pink
    )
    
    val icons = listOf(
        "🎯", "💪", "📚", "🏃", "💧", "🧘", "🎵", "🎨",
        "🍎", "💤", "📱", "🚫", "✍️", "🌱", "🔥", "⭐"
    )
    
    Dialog(onDismissRequest = onDismiss) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
        ) {
            Column(
                modifier = Modifier.padding(24.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Text(
                    text = "Create New Habit",
                    style = MaterialTheme.typography.headlineSmall
                )
                
                // Title field
                OutlinedTextField(
                    value = title,
                    onValueChange = { title = it },
                    label = { Text("Habit Name") },
                    modifier = Modifier.fillMaxWidth(),
                    singleLine = true
                )
                
                // Description field
                OutlinedTextField(
                    value = description,
                    onValueChange = { description = it },
                    label = { Text("Description (Optional)") },
                    modifier = Modifier.fillMaxWidth(),
                    maxLines = 2
                )
                
                // Frequency selection
                Text(
                    text = "Frequency",
                    style = MaterialTheme.typography.labelLarge
                )
                
                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    HabitFrequency.values().forEach { frequency ->
                        FilterChip(
                            selected = selectedFrequency == frequency,
                            onClick = { selectedFrequency = frequency },
                            label = { Text(frequency.name.lowercase().replaceFirstChar { it.uppercase() }) }
                        )
                    }
                }
                
                // Target count
                Text(
                    text = "Target per ${selectedFrequency.name.lowercase()}",
                    style = MaterialTheme.typography.labelLarge
                )
                
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Button(
                        onClick = { if (targetCount > 1) targetCount-- },
                        modifier = Modifier.size(40.dp),
                        contentPadding = PaddingValues(0.dp)
                    ) {
                        Text("-")
                    }
                    
                    Text(
                        text = targetCount.toString(),
                        style = MaterialTheme.typography.titleMedium,
                        modifier = Modifier.width(40.dp),
                        textAlign = TextAlign.Center
                    )
                    
                    Button(
                        onClick = { targetCount++ },
                        modifier = Modifier.size(40.dp),
                        contentPadding = PaddingValues(0.dp)
                    ) {
                        Text("+")
                    }
                }
                
                // Icon selection
                Text(
                    text = "Icon",
                    style = MaterialTheme.typography.labelLarge
                )
                
                LazyRow(
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    items(icons) { icon ->
                        Box(
                            modifier = Modifier
                                .size(40.dp)
                                .clip(CircleShape)
                                .background(
                                    if (selectedIcon == icon) 
                                        MaterialTheme.colorScheme.primaryContainer
                                    else 
                                        MaterialTheme.colorScheme.surface
                                )
                                .border(
                                    width = if (selectedIcon == icon) 2.dp else 1.dp,
                                    color = if (selectedIcon == icon) 
                                        MaterialTheme.colorScheme.primary
                                    else 
                                        MaterialTheme.colorScheme.outline,
                                    shape = CircleShape
                                )
                                .clickable { selectedIcon = icon },
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = icon,
                                fontSize = 20.sp
                            )
                        }
                    }
                }
                
                // Color selection
                Text(
                    text = "Color",
                    style = MaterialTheme.typography.labelLarge
                )
                
                LazyRow(
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    items(colors) { color ->
                        Box(
                            modifier = Modifier
                                .size(40.dp)
                                .clip(CircleShape)
                                .background(Color(android.graphics.Color.parseColor(color)))
                                .border(
                                    width = if (selectedColor == color) 3.dp else 0.dp,
                                    color = MaterialTheme.colorScheme.primary,
                                    shape = CircleShape
                                )
                                .clickable { selectedColor = color }
                        )
                    }
                }
                
                // Action buttons
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    TextButton(onClick = onDismiss) {
                        Text("Cancel")
                    }
                    
                    Spacer(modifier = Modifier.width(8.dp))
                    
                    Button(
                        onClick = {
                            if (title.isNotBlank()) {
                                onAddHabit(title, description, selectedFrequency, targetCount, selectedColor, selectedIcon)
                            }
                        },
                        enabled = title.isNotBlank()
                    ) {
                        Text("Create")
                    }
                }
            }
        }
    }
}
