package com.focusflow.app.ui.screens.dashboard

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.slideInVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.focusflow.app.ui.components.TaskCard
import com.focusflow.app.ui.components.HabitCard
import com.focusflow.app.ui.components.animations.bouncyClick
import com.focusflow.app.ui.components.animations.StaggeredAnimatedList
import com.focusflow.app.ui.components.enhanced.SwipeableTaskCard
import com.focusflow.app.ui.theme.*
import com.google.accompanist.swiperefresh.SwipeRefresh
import com.google.accompanist.swiperefresh.rememberSwipeRefreshState
import java.text.SimpleDateFormat
import java.util.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(
    viewModel: DashboardViewModel = hiltViewModel()
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()
    val haptic = LocalHapticFeedback.current
    val swipeRefreshState = rememberSwipeRefreshState(uiState.isLoading)

    SwipeRefresh(
        state = swipeRefreshState,
        onRefresh = { viewModel.refreshData() },
        modifier = Modifier.fillMaxSize()
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
        item {
            // Header with greeting
            DashboardHeader()
        }

        item {
            // Enhanced analytics section
            AnimatedVisibility(
                visible = true,
                enter = slideInVertically(
                    initialOffsetY = { it },
                    animationSpec = tween(300)
                ) + fadeIn(animationSpec = tween(300))
            ) {
                EnhancedAnalyticsSection(
                    totalTasks = uiState.totalTasks,
                    completedTasks = uiState.completedTasks,
                    totalHabits = uiState.totalHabits,
                    completedHabitsToday = uiState.completedHabitsToday,
                    productivityScore = uiState.productivityScore,
                    weeklyProgress = uiState.weeklyProgress,
                    onAnalyticsClick = { /* Navigate to analytics */ }
                )
            }
        }

        item {
            // Today's tasks
            SectionHeader(
                title = "Today's Tasks",
                actionText = "View All",
                onActionClick = { /* Navigate to tasks */ }
            )
        }

        if (uiState.todaysTasks.isEmpty()) {
            item {
                EmptyStateCard(
                    icon = Icons.Default.CheckCircle,
                    title = "No tasks for today",
                    subtitle = "Great job! You're all caught up."
                )
            }
        } else {
            items(uiState.todaysTasks.take(3)) { task ->
                SwipeableTaskCard(
                    title = task.title,
                    description = task.description,
                    isCompleted = task.isCompleted,
                    priority = task.priority.name,
                    dueDate = task.dueDate?.let { SimpleDateFormat("MMM dd", Locale.getDefault()).format(it) },
                    onComplete = { viewModel.toggleTaskCompletion(task) },
                    onDelete = { viewModel.deleteTask(task) },
                    onClick = { /* Navigate to task details */ },
                    modifier = Modifier.bouncyClick { /* Navigate to task details */ }
                )
            }
        }

        item {
            // Today's habits
            SectionHeader(
                title = "Today's Habits",
                actionText = "View All",
                onActionClick = { /* Navigate to habits */ }
            )
        }

        if (uiState.todaysHabits.isEmpty()) {
            item {
                EmptyStateCard(
                    icon = Icons.Default.Star,
                    title = "No habits to track",
                    subtitle = "Add some habits to build better routines."
                )
            }
        } else {
            item {
                LazyRow(
                    horizontalArrangement = Arrangement.spacedBy(12.dp),
                    contentPadding = PaddingValues(horizontal = 4.dp)
                ) {
                    items(uiState.todaysHabits) { habit ->
                        HabitCard(
                            habit = habit,
                            onToggleCompletion = { viewModel.toggleHabitCompletion(habit) },
                            onDelete = { viewModel.deleteHabit(habit) },
                            onClick = { /* Navigate to habit details */ },
                            modifier = Modifier.width(280.dp)
                        )
                    }
                }
            }
        }

        item {
            // Overdue tasks
            if (uiState.overdueTasks.isNotEmpty()) {
                SectionHeader(
                    title = "Overdue Tasks",
                    actionText = "View All",
                    onActionClick = { /* Navigate to overdue tasks */ }
                )
            }
        }

        items(uiState.overdueTasks.take(2)) { task ->
            TaskCard(
                task = task,
                onToggleCompletion = { viewModel.toggleTaskCompletion(task) },
                onDelete = { viewModel.deleteTask(task) },
                onClick = { /* Navigate to task details */ }
            )
        }
    }
    }
}

@Composable
fun DashboardHeader() {
    val currentHour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY)
    val greeting = when (currentHour) {
        in 5..11 -> "Good Morning"
        in 12..16 -> "Good Afternoon"
        in 17..20 -> "Good Evening"
        else -> "Good Night"
    }

    val today = SimpleDateFormat("EEEE, MMMM dd", Locale.getDefault()).format(Date())

    Column {
        Text(
            text = greeting,
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = today,
            style = MaterialTheme.typography.bodyLarge,
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )
    }
}

@Composable
fun QuickStatsSection(
    totalTasks: Int,
    completedTasks: Int,
    totalHabits: Int,
    completedHabitsToday: Int
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        StatCard(
            modifier = Modifier.weight(1f),
            title = "Tasks",
            value = "$completedTasks/$totalTasks",
            subtitle = "Completed",
            color = Primary,
            icon = Icons.Default.CheckCircle
        )

        StatCard(
            modifier = Modifier.weight(1f),
            title = "Habits",
            value = "$completedHabitsToday/$totalHabits",
            subtitle = "Today",
            color = Secondary,
            icon = Icons.Default.Star
        )
    }
}

@Composable
fun StatCard(
    modifier: Modifier = Modifier,
    title: String,
    value: String,
    subtitle: String,
    color: Color,
    icon: androidx.compose.ui.graphics.vector.ImageVector
) {
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = color.copy(alpha = 0.1f)
        )
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = color,
                modifier = Modifier.size(24.dp)
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = value,
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
                color = color
            )

            Text(
                text = title,
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )

            Text(
                text = subtitle,
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }
    }
}

@Composable
fun SectionHeader(
    title: String,
    actionText: String? = null,
    onActionClick: (() -> Unit)? = null
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = title,
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.SemiBold
        )

        if (actionText != null && onActionClick != null) {
            TextButton(onClick = onActionClick) {
                Text(actionText)
            }
        }
    }
}

@Composable
fun EnhancedAnalyticsSection(
    totalTasks: Int,
    completedTasks: Int,
    totalHabits: Int,
    completedHabitsToday: Int,
    productivityScore: Float,
    weeklyProgress: Float,
    onAnalyticsClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .bouncyClick { onAnalyticsClick() },
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
    ) {
        Column(
            modifier = Modifier.padding(20.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Today's Overview",
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onPrimaryContainer
                )

                // Productivity score circle
                Box(
                    modifier = Modifier
                        .size(60.dp)
                        .clip(CircleShape)
                        .background(
                            Brush.radialGradient(
                                colors = listOf(
                                    MaterialTheme.colorScheme.primary,
                                    MaterialTheme.colorScheme.primary.copy(alpha = 0.7f)
                                )
                            )
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "${(productivityScore * 100).toInt()}%",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Stats grid
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                EnhancedStatCard(
                    modifier = Modifier.weight(1f),
                    title = "Tasks",
                    value = "$completedTasks/$totalTasks",
                    subtitle = "Completed",
                    progress = if (totalTasks > 0) completedTasks.toFloat() / totalTasks else 0f,
                    color = MaterialTheme.colorScheme.primary,
                    icon = Icons.Default.CheckCircle
                )

                EnhancedStatCard(
                    modifier = Modifier.weight(1f),
                    title = "Habits",
                    value = "$completedHabitsToday/$totalHabits",
                    subtitle = "Today",
                    progress = if (totalHabits > 0) completedHabitsToday.toFloat() / totalHabits else 0f,
                    color = MaterialTheme.colorScheme.secondary,
                    icon = Icons.Default.Star
                )
            }

            Spacer(modifier = Modifier.height(12.dp))

            // Weekly progress bar
            Column {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Weekly Progress",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onPrimaryContainer
                    )
                    Text(
                        text = "${(weeklyProgress * 100).toInt()}%",
                        style = MaterialTheme.typography.bodyMedium,
                        fontWeight = FontWeight.Medium,
                        color = MaterialTheme.colorScheme.onPrimaryContainer
                    )
                }

                Spacer(modifier = Modifier.height(8.dp))

                LinearProgressIndicator(
                    progress = weeklyProgress,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(8.dp)
                        .clip(RoundedCornerShape(4.dp)),
                    color = MaterialTheme.colorScheme.primary,
                    trackColor = MaterialTheme.colorScheme.primary.copy(alpha = 0.2f)
                )
            }
        }
    }
}

@Composable
fun EnhancedStatCard(
    modifier: Modifier = Modifier,
    title: String,
    value: String,
    subtitle: String,
    progress: Float,
    color: Color,
    icon: androidx.compose.ui.graphics.vector.ImageVector
) {
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = color.copy(alpha = 0.1f)
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = color,
                modifier = Modifier.size(24.dp)
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = value,
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
                color = color
            )

            Text(
                text = title,
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )

            Text(
                text = subtitle,
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )

            Spacer(modifier = Modifier.height(8.dp))

            LinearProgressIndicator(
                progress = progress,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(4.dp)
                    .clip(RoundedCornerShape(2.dp)),
                color = color,
                trackColor = color.copy(alpha = 0.2f)
            )
        }
    }
}

@Composable
fun EmptyStateCard(
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    title: String,
    subtitle: String
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                modifier = Modifier.size(48.dp),
                tint = MaterialTheme.colorScheme.onSurfaceVariant
            )

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = title,
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Medium
            )

            Text(
                text = subtitle,
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }
    }
}
