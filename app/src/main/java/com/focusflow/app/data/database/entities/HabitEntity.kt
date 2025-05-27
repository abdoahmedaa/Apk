package com.focusflow.app.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "habits")
data class HabitEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val title: String,
    val description: String = "",
    val frequency: HabitFrequency = HabitFrequency.DAILY,
    val targetCount: Int = 1, // How many times per frequency period
    val color: String = "#4CAF50", // Default green color
    val icon: String = "🎯", // Emoji icon
    val isActive: Boolean = true,
    val hasReminder: Boolean = false,
    val reminderTime: String? = null, // Format: "HH:mm"
    val createdAt: Date = Date(),
    val updatedAt: Date = Date()
)

enum class HabitFrequency {
    DAILY, WEEKLY, MONTHLY, CUSTOM
}
