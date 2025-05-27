package com.focusflow.app.domain.model

import com.focusflow.app.data.database.entities.Priority
import java.util.Date

data class Task(
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
    val updatedAt: Date = Date(),
    val completedAt: Date? = null,
    val estimatedDuration: Int = 0, // in minutes
    val actualDuration: Int = 0, // in minutes
    val tags: List<String> = emptyList(),
    val subtasks: List<Subtask> = emptyList(),
    val attachments: List<TaskAttachment> = emptyList(),
    val isRecurring: Boolean = false,
    val recurrencePattern: RecurrencePattern? = null,
    val location: String? = null,
    val assignee: String? = null,
    val progress: Float = 0f, // 0.0 to 1.0
    val notes: String = "",
    val color: String? = null,
    val timeSpent: Long = 0L, // in milliseconds
    val isArchived: Boolean = false
)

data class Subtask(
    val id: Long = 0,
    val taskId: Long,
    val title: String,
    val isCompleted: Boolean = false,
    val createdAt: Date = Date(),
    val order: Int = 0
)

data class TaskAttachment(
    val id: Long = 0,
    val taskId: Long,
    val fileName: String,
    val filePath: String,
    val fileType: String,
    val fileSize: Long,
    val createdAt: Date = Date()
)

data class RecurrencePattern(
    val type: RecurrenceType,
    val interval: Int = 1, // every X days/weeks/months
    val daysOfWeek: List<Int> = emptyList(), // 1-7 for weekly
    val dayOfMonth: Int? = null, // for monthly
    val endDate: Date? = null,
    val maxOccurrences: Int? = null
)

enum class RecurrenceType {
    DAILY, WEEKLY, MONTHLY, YEARLY
}

enum class TaskStatus {
    TODO, IN_PROGRESS, COMPLETED, CANCELLED, ON_HOLD
}
