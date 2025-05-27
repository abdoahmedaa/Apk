package com.focusflow.app.data

import com.focusflow.app.data.database.AppDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SampleDataInitializer @Inject constructor(
    private val database: AppDatabase
) {

    suspend fun initializeSampleData() {
        withContext(Dispatchers.IO) {
            try {
                // Check if data already exists by counting existing records
                // Only initialize if database is empty
                // Insert sample tasks
                SampleData.getSampleTasks().forEach { task ->
                    database.taskDao().insertTask(task)
                }

                // Insert sample todo lists
                SampleData.getSampleTodoLists().forEach { todoList ->
                    database.todoDao().insertTodoList(todoList)
                }

                // Insert sample todo items
                SampleData.getSampleTodoItems().forEach { todoItem ->
                    database.todoDao().insertTodoItem(todoItem)
                }

                // Insert sample habits
                SampleData.getSampleHabits().forEach { habit ->
                    database.habitDao().insertHabit(habit)
                }

                // Insert sample habit logs
                SampleData.getSampleHabitLogs().forEach { habitLog ->
                    database.habitDao().insertHabitLog(habitLog)
                }

            } catch (e: Exception) {
                // Handle initialization errors
                e.printStackTrace()
            }
        }
    }
}
