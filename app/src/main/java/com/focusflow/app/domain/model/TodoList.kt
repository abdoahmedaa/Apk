package com.focusflow.app.domain.model

import java.util.Date

data class TodoList(
    val id: Long = 0,
    val title: String,
    val description: String = "",
    val color: String = "#2196F3",
    val items: List<TodoItem> = emptyList(),
    val createdAt: Date = Date(),
    val updatedAt: Date = Date()
) {
    val completedItemsCount: Int
        get() = items.count { it.isCompleted }
    
    val totalItemsCount: Int
        get() = items.size
    
    val progressPercentage: Float
        get() = if (totalItemsCount == 0) 0f else (completedItemsCount.toFloat() / totalItemsCount.toFloat()) * 100f
}

data class TodoItem(
    val id: Long = 0,
    val todoListId: Long,
    val title: String,
    val isCompleted: Boolean = false,
    val position: Int = 0,
    val createdAt: Date = Date(),
    val updatedAt: Date = Date()
)
