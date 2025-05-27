package com.focusflow.app.domain.model

import com.focusflow.app.data.database.entities.HabitFrequency
import java.util.Date

data class Habit(
    val id: Long = 0,
    val title: String,
    val description: String = "",
    val frequency: HabitFrequency = HabitFrequency.DAILY,
    val targetCount: Int = 1,
    val color: String = "#4CAF50",
    val icon: String = "🎯",
    val isActive: Boolean = true,
    val hasReminder: Boolean = false,
    val reminderTime: String? = null,
    val logs: List<HabitLog> = emptyList(),
    val createdAt: Date = Date(),
    val updatedAt: Date = Date()
) {
    val currentStreak: Int
        get() = calculateCurrentStreak()

    val longestStreak: Int
        get() = calculateLongestStreak()

    val totalCompletions: Int
        get() = logs.sumOf { it.count }

    private fun calculateCurrentStreak(): Int {
        if (logs.isEmpty()) return 0

        val sortedLogs = logs.sortedByDescending { it.date }
        var streak = 0
        val today = Date()

        for (log in sortedLogs) {
            val daysDiff = ((today.time - log.date.time) / (1000 * 60 * 60 * 24)).toInt()
            if (daysDiff == streak) {
                streak++
            } else {
                break
            }
        }
        return streak
    }

    private fun calculateLongestStreak(): Int {
        if (logs.isEmpty()) return 0

        val sortedLogs = logs.sortedBy { it.date }
        var maxStreak = 0
        var currentStreak = 0
        var lastDate: Date? = null

        for (log in sortedLogs) {
            if (lastDate == null) {
                currentStreak = 1
            } else {
                val daysDiff = ((log.date.time - lastDate.time) / (1000 * 60 * 60 * 24)).toInt()
                if (daysDiff == 1) {
                    currentStreak++
                } else {
                    maxStreak = maxOf(maxStreak, currentStreak)
                    currentStreak = 1
                }
            }
            lastDate = log.date
        }
        return maxOf(maxStreak, currentStreak)
    }
}

data class HabitLog(
    val id: Long = 0,
    val habitId: Long,
    val date: Date,
    val count: Int = 1,
    val notes: String = "",
    val createdAt: Date = Date(),
    val value: Float = 0f, // for numeric tracking
    val mood: Int = 0, // 1-5 scale
    val location: String? = null,
    val weather: String? = null
)

data class HabitReward(
    val id: Long = 0,
    val habitId: Long,
    val title: String,
    val description: String = "",
    val requiredStreak: Int,
    val isUnlocked: Boolean = false,
    val unlockedAt: Date? = null,
    val icon: String? = null,
    val color: String? = null
)

enum class HabitDifficulty {
    EASY, MEDIUM, HARD, EXPERT
}

enum class HabitTrackingType {
    BOOLEAN, // Yes/No
    NUMERIC, // Count or measurement
    DURATION, // Time-based
    SCALE // 1-5 rating
}

data class HabitStatistics(
    val habitId: Long,
    val totalDays: Int,
    val completedDays: Int,
    val currentStreak: Int,
    val longestStreak: Int,
    val averagePerWeek: Float,
    val completionRate: Float,
    val bestMonth: String,
    val totalValue: Float = 0f,
    val averageValue: Float = 0f,
    val lastSevenDays: List<Boolean> = emptyList(),
    val monthlyProgress: Map<String, Float> = emptyMap()
)
