package com.focusflow.app.domain.analytics

import com.focusflow.app.domain.model.Task
import com.focusflow.app.domain.model.Habit
import com.focusflow.app.domain.model.TodoList
import java.util.*
import kotlin.math.roundToInt

data class ProductivityMetrics(
    val tasksCompleted: Int,
    val tasksCreated: Int,
    val completionRate: Float,
    val averageTaskDuration: Float, // in hours
    val totalTimeSpent: Long, // in milliseconds
    val habitsCompleted: Int,
    val habitCompletionRate: Float,
    val longestHabitStreak: Int,
    val todoListsCompleted: Int,
    val productivityScore: Float, // 0-100
    val focusTime: Long, // time spent on high-priority tasks
    val distractionTime: Long, // time spent on low-priority tasks
    val peakProductivityHour: Int, // 0-23
    val weeklyTrend: Float, // positive = improving, negative = declining
    val monthlyGoalProgress: Float // 0-1
)

data class TimeAnalytics(
    val totalActiveTime: Long,
    val averageSessionLength: Long,
    val longestSession: Long,
    val shortestSession: Long,
    val sessionsCount: Int,
    val timeByCategory: Map<String, Long>,
    val timeByPriority: Map<String, Long>,
    val timeByDayOfWeek: Map<String, Long>,
    val timeByHour: Map<Int, Long>,
    val focusTimePercentage: Float,
    val breakTimePercentage: Float
)

data class HabitAnalytics(
    val totalHabits: Int,
    val activeHabits: Int,
    val completedToday: Int,
    val averageStreak: Float,
    val longestOverallStreak: Int,
    val habitsByCategory: Map<String, Int>,
    val habitsByDifficulty: Map<String, Int>,
    val weeklyCompletionRate: Float,
    val monthlyCompletionRate: Float,
    val bestPerformingHabit: String?,
    val strugglingHabits: List<String>,
    val streakDistribution: Map<String, Int>, // "0-7", "8-30", "31-90", "90+"
    val consistencyScore: Float // 0-100
)

data class TaskAnalytics(
    val totalTasks: Int,
    val completedTasks: Int,
    val overdueTasks: Int,
    val averageCompletionTime: Float, // in days
    val tasksByPriority: Map<String, Int>,
    val tasksByCategory: Map<String, Int>,
    val tasksByStatus: Map<String, Int>,
    val completionTrend: List<Float>, // last 7 days
    val procrastinationScore: Float, // 0-100, higher = more procrastination
    val efficiencyScore: Float, // 0-100, actual vs estimated time
    val burnoutRisk: Float, // 0-100, based on workload and completion rate
    val recommendedDailyTasks: Int
)

data class WeeklyReport(
    val weekStartDate: Date,
    val weekEndDate: Date,
    val tasksCompleted: Int,
    val habitsCompleted: Int,
    val totalTimeSpent: Long,
    val productivityScore: Float,
    val achievements: List<Achievement>,
    val improvements: List<String>,
    val nextWeekGoals: List<String>,
    val topCategories: List<String>,
    val streakMilestones: List<String>
)

data class MonthlyReport(
    val monthYear: String,
    val tasksCompleted: Int,
    val habitsCompleted: Int,
    val totalTimeSpent: Long,
    val averageProductivityScore: Float,
    val bestWeek: String,
    val worstWeek: String,
    val achievements: List<Achievement>,
    val insights: List<String>,
    val nextMonthGoals: List<String>,
    val categoryBreakdown: Map<String, Float>,
    val habitSuccessRate: Map<String, Float>
)

data class Achievement(
    val id: String,
    val title: String,
    val description: String,
    val icon: String,
    val unlockedAt: Date,
    val category: AchievementCategory,
    val rarity: AchievementRarity,
    val points: Int
)

enum class AchievementCategory {
    TASKS, HABITS, STREAKS, TIME_MANAGEMENT, CONSISTENCY, PRODUCTIVITY
}

enum class AchievementRarity {
    COMMON, RARE, EPIC, LEGENDARY
}

class ProductivityAnalyzer {

    fun calculateProductivityMetrics(
        tasks: List<Task>,
        habits: List<Habit>,
        todoLists: List<TodoList>,
        timeRange: TimeRange = TimeRange.WEEK
    ): ProductivityMetrics {
        val filteredTasks = filterByTimeRange(tasks, timeRange) { it.createdAt }
        val filteredHabits = filterByTimeRange(habits, timeRange) { it.createdAt }

        val completedTasks = filteredTasks.count { it.isCompleted }
        val totalTasks = filteredTasks.size
        val completionRate = if (totalTasks > 0) completedTasks.toFloat() / totalTasks else 0f

        val totalTimeSpent = filteredTasks.sumOf { it.timeSpent }
        val averageTaskDuration = if (completedTasks > 0) {
            totalTimeSpent.toFloat() / (completedTasks * 1000 * 60 * 60) // convert to hours
        } else 0f

        val habitsCompleted = filteredHabits.sumOf { it.logs.size }
        val habitCompletionRate = calculateHabitCompletionRate(filteredHabits)
        val longestStreak = filteredHabits.maxOfOrNull { it.longestStreak } ?: 0

        val productivityScore = calculateProductivityScore(
            completionRate, habitCompletionRate, totalTimeSpent, timeRange
        )

        return ProductivityMetrics(
            tasksCompleted = completedTasks,
            tasksCreated = totalTasks,
            completionRate = completionRate,
            averageTaskDuration = averageTaskDuration,
            totalTimeSpent = totalTimeSpent,
            habitsCompleted = habitsCompleted,
            habitCompletionRate = habitCompletionRate,
            longestHabitStreak = longestStreak,
            todoListsCompleted = todoLists.count { it.items.isNotEmpty() && it.items.all { item -> item.isCompleted } },
            productivityScore = productivityScore,
            focusTime = calculateFocusTime(filteredTasks),
            distractionTime = calculateDistractionTime(filteredTasks),
            peakProductivityHour = calculatePeakProductivityHour(filteredTasks),
            weeklyTrend = calculateWeeklyTrend(tasks),
            monthlyGoalProgress = calculateMonthlyGoalProgress(tasks, habits)
        )
    }

    fun generateWeeklyReport(
        tasks: List<Task>,
        habits: List<Habit>,
        todoLists: List<TodoList>
    ): WeeklyReport {
        val weekStart = getStartOfWeek()
        val weekEnd = getEndOfWeek()

        val weekTasks = tasks.filter { it.createdAt >= weekStart && it.createdAt <= weekEnd }
        val weekHabits = habits.filter { it.createdAt >= weekStart && it.createdAt <= weekEnd }

        val metrics = calculateProductivityMetrics(tasks, habits, todoLists, TimeRange.WEEK)
        val achievements = detectAchievements(tasks, habits, TimeRange.WEEK)

        return WeeklyReport(
            weekStartDate = weekStart,
            weekEndDate = weekEnd,
            tasksCompleted = metrics.tasksCompleted,
            habitsCompleted = metrics.habitsCompleted,
            totalTimeSpent = metrics.totalTimeSpent,
            productivityScore = metrics.productivityScore,
            achievements = achievements,
            improvements = generateImprovementSuggestions(metrics),
            nextWeekGoals = generateNextWeekGoals(metrics),
            topCategories = getTopCategories(weekTasks),
            streakMilestones = getStreakMilestones(weekHabits)
        )
    }

    private fun calculateProductivityScore(
        taskCompletionRate: Float,
        habitCompletionRate: Float,
        totalTimeSpent: Long,
        timeRange: TimeRange
    ): Float {
        val taskScore = taskCompletionRate * 40 // 40% weight
        val habitScore = habitCompletionRate * 30 // 30% weight
        val timeScore = calculateTimeScore(totalTimeSpent, timeRange) * 30 // 30% weight

        return (taskScore + habitScore + timeScore).coerceIn(0f, 100f)
    }

    private fun calculateTimeScore(totalTimeSpent: Long, timeRange: TimeRange): Float {
        val expectedTime = when (timeRange) {
            TimeRange.DAY -> 4 * 60 * 60 * 1000L // 4 hours
            TimeRange.WEEK -> 28 * 60 * 60 * 1000L // 28 hours
            TimeRange.MONTH -> 120 * 60 * 60 * 1000L // 120 hours
        }

        return (totalTimeSpent.toFloat() / expectedTime * 100).coerceAtMost(100f)
    }

    private fun detectAchievements(
        tasks: List<Task>,
        habits: List<Habit>,
        timeRange: TimeRange
    ): List<Achievement> {
        val achievements = mutableListOf<Achievement>()

        // Task achievements
        val completedTasks = tasks.count { it.isCompleted }
        if (completedTasks >= 10) {
            achievements.add(createAchievement("task_master", "Task Master", "Completed 10 tasks"))
        }

        // Habit achievements
        val longestStreak = habits.maxOfOrNull { it.longestStreak } ?: 0
        if (longestStreak >= 7) {
            achievements.add(createAchievement("week_warrior", "Week Warrior", "7-day habit streak"))
        }

        return achievements
    }

    private fun createAchievement(id: String, title: String, description: String): Achievement {
        return Achievement(
            id = id,
            title = title,
            description = description,
            icon = "🏆",
            unlockedAt = Date(),
            category = AchievementCategory.TASKS,
            rarity = AchievementRarity.COMMON,
            points = 100
        )
    }

    private fun <T> filterByTimeRange(
        items: List<T>,
        timeRange: TimeRange,
        dateSelector: (T) -> Date
    ): List<T> {
        val now = Date()
        val startTime = when (timeRange) {
            TimeRange.DAY -> Date(now.time - 24 * 60 * 60 * 1000)
            TimeRange.WEEK -> Date(now.time - 7 * 24 * 60 * 60 * 1000)
            TimeRange.MONTH -> Date(now.time - 30 * 24 * 60 * 60 * 1000L)
        }

        return items.filter { dateSelector(it) >= startTime }
    }

    // Additional helper methods would be implemented here...
    private fun calculateHabitCompletionRate(habits: List<Habit>): Float = 0.8f
    private fun calculateFocusTime(tasks: List<Task>): Long = 0L
    private fun calculateDistractionTime(tasks: List<Task>): Long = 0L
    private fun calculatePeakProductivityHour(tasks: List<Task>): Int = 10
    private fun calculateWeeklyTrend(tasks: List<Task>): Float = 0.1f
    private fun calculateMonthlyGoalProgress(tasks: List<Task>, habits: List<Habit>): Float = 0.7f
    private fun generateImprovementSuggestions(metrics: ProductivityMetrics): List<String> = emptyList()
    private fun generateNextWeekGoals(metrics: ProductivityMetrics): List<String> = emptyList()
    private fun getTopCategories(tasks: List<Task>): List<String> = emptyList()
    private fun getStreakMilestones(habits: List<Habit>): List<String> = emptyList()
    private fun getStartOfWeek(): Date = Date()
    private fun getEndOfWeek(): Date = Date()
}

enum class TimeRange {
    DAY, WEEK, MONTH
}
