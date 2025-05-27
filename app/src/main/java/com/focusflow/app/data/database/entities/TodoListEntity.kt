package com.focusflow.app.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "todo_lists")
data class TodoListEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val title: String,
    val description: String = "",
    val color: String = "#2196F3", // Default blue color
    val createdAt: Date = Date(),
    val updatedAt: Date = Date()
)
