package com.focusflow.app.backup

import android.content.Context
import com.focusflow.app.data.repository.TaskRepository
import com.focusflow.app.data.repository.TodoRepository
import com.focusflow.app.data.repository.HabitRepository
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import kotlinx.coroutines.flow.first
import java.io.File
import java.io.FileWriter
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class BackupManager @Inject constructor(
    private val taskRepository: TaskRepository,
    private val todoRepository: TodoRepository,
    private val habitRepository: HabitRepository,
    private val gson: Gson = GsonBuilder()
        .setDateFormat("yyyy-MM-dd HH:mm:ss")
        .setPrettyPrinting()
        .create()
) {
    
    suspend fun exportToJson(context: Context): String? {
        return try {
            val backupData = BackupData(
                tasks = taskRepository.getAllTasks().first(),
                todoLists = todoRepository.getAllTodoLists().first(),
                habits = habitRepository.getActiveHabits().first(),
                exportDate = Date(),
                version = "1.0"
            )
            
            val json = gson.toJson(backupData)
            val fileName = "focusflow_backup_${SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(Date())}.json"
            
            val file = File(context.getExternalFilesDir(null), fileName)
            FileWriter(file).use { writer ->
                writer.write(json)
            }
            
            file.absolutePath
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }
    
    suspend fun importFromJson(context: Context, filePath: String): Boolean {
        return try {
            val file = File(filePath)
            if (!file.exists()) return false
            
            val json = file.readText()
            val backupData = gson.fromJson(json, BackupData::class.java)
            
            // Import tasks
            backupData.tasks.forEach { task ->
                taskRepository.insertTask(task)
            }
            
            // Import todo lists
            backupData.todoLists.forEach { todoList ->
                todoRepository.insertTodoList(todoList)
            }
            
            // Import habits
            backupData.habits.forEach { habit ->
                habitRepository.insertHabit(habit)
            }
            
            true
        } catch (e: Exception) {
            e.printStackTrace()
            false
        }
    }
    
    fun getBackupFiles(context: Context): List<File> {
        val backupDir = context.getExternalFilesDir(null)
        return backupDir?.listFiles { file ->
            file.name.startsWith("focusflow_backup_") && file.name.endsWith(".json")
        }?.toList() ?: emptyList()
    }
}
