package com.focusflow.app.ui.components.enhanced

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectHorizontalDragGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch
import kotlin.math.roundToInt

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SwipeableCard(
    modifier: Modifier = Modifier,
    onSwipeLeft: (() -> Unit)? = null,
    onSwipeRight: (() -> Unit)? = null,
    leftSwipeIcon: ImageVector = Icons.Default.Delete,
    rightSwipeIcon: ImageVector = Icons.Default.Check,
    leftSwipeColor: Color = MaterialTheme.colorScheme.error,
    rightSwipeColor: Color = Color(0xFF4CAF50),
    leftSwipeText: String = "Delete",
    rightSwipeText: String = "Complete",
    swipeThreshold: Float = 0.3f,
    content: @Composable () -> Unit
) {
    val density = LocalDensity.current
    val haptic = LocalHapticFeedback.current
    val scope = rememberCoroutineScope()

    val offsetX = remember { Animatable(0f) }
    val cardWidth = remember { mutableStateOf(0f) }

    var hasTriggeredHaptic by remember { mutableStateOf(false) }

    Box(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
    ) {
        // Background actions
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(IntrinsicSize.Min)
        ) {
            // Left swipe action (usually delete)
            if (onSwipeLeft != null) {
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .background(leftSwipeColor),
                    contentAlignment = Alignment.Center
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Icon(
                            imageVector = leftSwipeIcon,
                            contentDescription = leftSwipeText,
                            tint = Color.White,
                            modifier = Modifier.size(24.dp)
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = leftSwipeText,
                            style = MaterialTheme.typography.labelSmall,
                            color = Color.White
                        )
                    }
                }
            }

            // Right swipe action (usually complete)
            if (onSwipeRight != null) {
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .background(rightSwipeColor),
                    contentAlignment = Alignment.Center
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Icon(
                            imageVector = rightSwipeIcon,
                            contentDescription = rightSwipeText,
                            tint = Color.White,
                            modifier = Modifier.size(24.dp)
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = rightSwipeText,
                            style = MaterialTheme.typography.labelSmall,
                            color = Color.White
                        )
                    }
                }
            }
        }

        // Main card content
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .offset { IntOffset(offsetX.value.roundToInt(), 0) }
                .pointerInput(Unit) {
                    detectHorizontalDragGestures(
                        onDragEnd = {
                            scope.launch {
                                val threshold = cardWidth.value * swipeThreshold
                                when {
                                    offsetX.value > threshold && onSwipeRight != null -> {
                                        // Swipe right - complete action
                                        offsetX.animateTo(
                                            cardWidth.value,
                                            animationSpec = tween(300)
                                        )
                                        onSwipeRight()
                                    }
                                    offsetX.value < -threshold && onSwipeLeft != null -> {
                                        // Swipe left - delete action
                                        offsetX.animateTo(
                                            -cardWidth.value,
                                            animationSpec = tween(300)
                                        )
                                        onSwipeLeft()
                                    }
                                    else -> {
                                        // Snap back
                                        offsetX.animateTo(0f, animationSpec = tween(300))
                                    }
                                }
                                hasTriggeredHaptic = false
                            }
                        }
                    ) { _, dragAmount ->
                        scope.launch {
                            val newOffset = (offsetX.value + dragAmount).coerceIn(
                                -cardWidth.value,
                                cardWidth.value
                            )
                            offsetX.snapTo(newOffset)

                            // Trigger haptic feedback at threshold
                            val threshold = cardWidth.value * swipeThreshold
                            if (!hasTriggeredHaptic &&
                                (kotlin.math.abs(newOffset) > threshold)) {
                                haptic.performHapticFeedback(HapticFeedbackType.LongPress)
                                hasTriggeredHaptic = true
                            } else if (hasTriggeredHaptic &&
                                      kotlin.math.abs(newOffset) < threshold) {
                                hasTriggeredHaptic = false
                            }
                        }
                    }
                }
                .onGloballyPositioned { coordinates ->
                    cardWidth.value = coordinates.size.width.toFloat()
                },
            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surface
            )
        ) {
            content()
        }
    }
}

// Enhanced task card with swipe gestures
@Composable
fun SwipeableTaskCard(
    title: String,
    description: String? = null,
    isCompleted: Boolean = false,
    priority: String? = null,
    dueDate: String? = null,
    onComplete: () -> Unit,
    onDelete: () -> Unit,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    SwipeableCard(
        modifier = modifier,
        onSwipeRight = onComplete,
        onSwipeLeft = onDelete,
        rightSwipeText = if (isCompleted) "Undo" else "Complete",
        rightSwipeIcon = if (isCompleted) Icons.Default.Check else Icons.Default.Check
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.Top
            ) {
                Column(
                    modifier = Modifier.weight(1f)
                ) {
                    Text(
                        text = title,
                        style = MaterialTheme.typography.titleMedium,
                        color = if (isCompleted) {
                            MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f)
                        } else {
                            MaterialTheme.colorScheme.onSurface
                        }
                    )

                    description?.let {
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = it,
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }

                priority?.let {
                    PriorityChip(priority = it)
                }
            }

            dueDate?.let {
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Due: $it",
                    style = MaterialTheme.typography.labelSmall,
                    color = MaterialTheme.colorScheme.primary
                )
            }
        }
    }
}

@Composable
private fun PriorityChip(priority: String) {
    val color = when (priority.lowercase()) {
        "high" -> Color(0xFFFF5722)
        "medium" -> Color(0xFFFF9800)
        "low" -> Color(0xFF4CAF50)
        else -> MaterialTheme.colorScheme.outline
    }

    Surface(
        shape = RoundedCornerShape(12.dp),
        color = color.copy(alpha = 0.1f),
        border = androidx.compose.foundation.BorderStroke(1.dp, color)
    ) {
        Text(
            text = priority,
            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            style = MaterialTheme.typography.labelSmall,
            color = color
        )
    }
}
