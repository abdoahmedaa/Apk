package com.focusflow.app.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "tasks")
data class TaskEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val title: String,
    val description: String = "",
    val dueDate: Date? = null,
    val priority: Priority = Priority.MEDIUM,
    val category: String = "",
    val isCompleted: Boolean = false,
    val hasReminder: Boolean = false,
    val reminderTime: Date? = null,
    val createdAt: Date = Date(),
    val updatedAt: Date = Date()
)

enum class Priority {
    LOW, MEDIUM, HIGH, URGENT
}
