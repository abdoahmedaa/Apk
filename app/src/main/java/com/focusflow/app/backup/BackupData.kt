package com.focusflow.app.backup

import com.focusflow.app.domain.model.Task
import com.focusflow.app.domain.model.TodoList
import com.focusflow.app.domain.model.Habit
import java.util.Date

data class BackupData(
    val tasks: List<Task>,
    val todoLists: List<TodoList>,
    val habits: List<Habit>,
    val exportDate: Date,
    val version: String
)
