package com.focusflow.app.data

import com.focusflow.app.data.database.entities.*
import com.focusflow.app.utils.DateUtils
import java.util.*

object SampleData {
    
    fun getSampleTasks(): List<TaskEntity> {
        val today = Date()
        val tomorrow = DateUtils.addDays(today, 1)
        val nextWeek = DateUtils.addDays(today, 7)
        
        return listOf(
            TaskEntity(
                id = 1,
                title = "Complete project proposal",
                description = "Finish the quarterly project proposal for the new mobile app",
                dueDate = tomorrow,
                priority = Priority.HIGH,
                category = "Work",
                isCompleted = false,
                hasReminder = true,
                reminderTime = DateUtils.addDays(today, 1)
            ),
            TaskEntity(
                id = 2,
                title = "Buy groceries",
                description = "Milk, bread, eggs, vegetables",
                dueDate = today,
                priority = Priority.MEDIUM,
                category = "Personal",
                isCompleted = false
            ),
            TaskEntity(
                id = 3,
                title = "Call dentist",
                description = "Schedule annual checkup appointment",
                dueDate = nextWeek,
                priority = Priority.LOW,
                category = "Health",
                isCompleted = false
            ),
            TaskEntity(
                id = 4,
                title = "Review code changes",
                description = "Review pull requests from team members",
                dueDate = today,
                priority = Priority.URGENT,
                category = "Work",
                isCompleted = true
            ),
            TaskEntity(
                id = 5,
                title = "Plan weekend trip",
                description = "Research destinations and book accommodation",
                dueDate = DateUtils.addDays(today, 3),
                priority = Priority.LOW,
                category = "Travel",
                isCompleted = false
            )
        )
    }
    
    fun getSampleTodoLists(): List<TodoListEntity> {
        return listOf(
            TodoListEntity(
                id = 1,
                title = "Shopping List",
                description = "Weekly grocery shopping",
                color = "#4CAF50"
            ),
            TodoListEntity(
                id = 2,
                title = "Home Improvement",
                description = "Tasks for renovating the living room",
                color = "#FF9800"
            ),
            TodoListEntity(
                id = 3,
                title = "Learning Goals",
                description = "Skills to learn this quarter",
                color = "#2196F3"
            )
        )
    }
    
    fun getSampleTodoItems(): List<TodoItemEntity> {
        return listOf(
            // Shopping List items
            TodoItemEntity(id = 1, todoListId = 1, title = "Milk", isCompleted = false, position = 0),
            TodoItemEntity(id = 2, todoListId = 1, title = "Bread", isCompleted = true, position = 1),
            TodoItemEntity(id = 3, todoListId = 1, title = "Eggs", isCompleted = false, position = 2),
            TodoItemEntity(id = 4, todoListId = 1, title = "Vegetables", isCompleted = false, position = 3),
            
            // Home Improvement items
            TodoItemEntity(id = 5, todoListId = 2, title = "Paint walls", isCompleted = false, position = 0),
            TodoItemEntity(id = 6, todoListId = 2, title = "Buy new furniture", isCompleted = false, position = 1),
            TodoItemEntity(id = 7, todoListId = 2, title = "Install lighting", isCompleted = true, position = 2),
            
            // Learning Goals items
            TodoItemEntity(id = 8, todoListId = 3, title = "Learn Kotlin", isCompleted = true, position = 0),
            TodoItemEntity(id = 9, todoListId = 3, title = "Master Jetpack Compose", isCompleted = false, position = 1),
            TodoItemEntity(id = 10, todoListId = 3, title = "Study system design", isCompleted = false, position = 2)
        )
    }
    
    fun getSampleHabits(): List<HabitEntity> {
        return listOf(
            HabitEntity(
                id = 1,
                title = "Drink Water",
                description = "Drink 8 glasses of water daily",
                frequency = HabitFrequency.DAILY,
                targetCount = 8,
                color = "#2196F3",
                icon = "💧",
                hasReminder = true,
                reminderTime = "09:00"
            ),
            HabitEntity(
                id = 2,
                title = "Exercise",
                description = "30 minutes of physical activity",
                frequency = HabitFrequency.DAILY,
                targetCount = 1,
                color = "#4CAF50",
                icon = "💪",
                hasReminder = true,
                reminderTime = "07:00"
            ),
            HabitEntity(
                id = 3,
                title = "Read Books",
                description = "Read for at least 30 minutes",
                frequency = HabitFrequency.DAILY,
                targetCount = 1,
                color = "#FF9800",
                icon = "📚",
                hasReminder = false
            ),
            HabitEntity(
                id = 4,
                title = "Meditation",
                description = "Practice mindfulness meditation",
                frequency = HabitFrequency.DAILY,
                targetCount = 1,
                color = "#9C27B0",
                icon = "🧘",
                hasReminder = true,
                reminderTime = "20:00"
            ),
            HabitEntity(
                id = 5,
                title = "Learn New Language",
                description = "Practice Spanish on language app",
                frequency = HabitFrequency.DAILY,
                targetCount = 1,
                color = "#E91E63",
                icon = "🗣️",
                hasReminder = false
            )
        )
    }
    
    fun getSampleHabitLogs(): List<HabitLogEntity> {
        val today = Date()
        val yesterday = DateUtils.addDays(today, -1)
        val twoDaysAgo = DateUtils.addDays(today, -2)
        
        return listOf(
            // Water habit logs
            HabitLogEntity(id = 1, habitId = 1, date = today, count = 6),
            HabitLogEntity(id = 2, habitId = 1, date = yesterday, count = 8),
            HabitLogEntity(id = 3, habitId = 1, date = twoDaysAgo, count = 7),
            
            // Exercise habit logs
            HabitLogEntity(id = 4, habitId = 2, date = yesterday, count = 1),
            HabitLogEntity(id = 5, habitId = 2, date = twoDaysAgo, count = 1),
            
            // Reading habit logs
            HabitLogEntity(id = 6, habitId = 3, date = today, count = 1),
            HabitLogEntity(id = 7, habitId = 3, date = yesterday, count = 1),
            
            // Meditation habit logs
            HabitLogEntity(id = 8, habitId = 4, date = yesterday, count = 1),
            
            // Language learning logs
            HabitLogEntity(id = 9, habitId = 5, date = today, count = 1),
            HabitLogEntity(id = 10, habitId = 5, date = twoDaysAgo, count = 1)
        )
    }
}
