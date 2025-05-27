package com.focusflow.app.data.repository

import com.focusflow.app.data.database.dao.TaskDao
import com.focusflow.app.data.database.entities.TaskEntity
import com.focusflow.app.data.database.entities.Priority
import com.focusflow.app.domain.model.Task
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import java.util.Date
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TaskRepository @Inject constructor(
    private val taskDao: TaskDao
) {
    
    fun getAllTasks(): Flow<List<Task>> {
        return taskDao.getAllTasks().map { entities ->
            entities.map { it.toDomainModel() }
        }
    }
    
    fun getActiveTasks(): Flow<List<Task>> {
        return taskDao.getActiveTasks().map { entities ->
            entities.map { it.toDomainModel() }
        }
    }
    
    fun getCompletedTasks(): Flow<List<Task>> {
        return taskDao.getCompletedTasks().map { entities ->
            entities.map { it.toDomainModel() }
        }
    }
    
    fun getTasksByDateRange(startDate: Date, endDate: Date): Flow<List<Task>> {
        return taskDao.getTasksByDateRange(startDate, endDate).map { entities ->
            entities.map { it.toDomainModel() }
        }
    }
    
    fun getTasksByCategory(category: String): Flow<List<Task>> {
        return taskDao.getTasksByCategory(category).map { entities ->
            entities.map { it.toDomainModel() }
        }
    }
    
    fun getTasksByPriority(priority: Priority): Flow<List<Task>> {
        return taskDao.getTasksByPriority(priority).map { entities ->
            entities.map { it.toDomainModel() }
        }
    }
    
    suspend fun getTaskById(id: Long): Task? {
        return taskDao.getTaskById(id)?.toDomainModel()
    }
    
    suspend fun getTasksWithReminders(): List<Task> {
        return taskDao.getTasksWithReminders().map { it.toDomainModel() }
    }
    
    suspend fun insertTask(task: Task): Long {
        return taskDao.insertTask(task.toEntity())
    }
    
    suspend fun updateTask(task: Task) {
        taskDao.updateTask(task.toEntity())
    }
    
    suspend fun deleteTask(task: Task) {
        taskDao.deleteTask(task.toEntity())
    }
    
    suspend fun deleteTaskById(id: Long) {
        taskDao.deleteTaskById(id)
    }
    
    suspend fun updateTaskCompletion(id: Long, isCompleted: Boolean) {
        taskDao.updateTaskCompletion(id, isCompleted, Date())
    }
    
    fun getAllCategories(): Flow<List<String>> {
        return taskDao.getAllCategories()
    }
    
    // Extension functions for mapping
    private fun TaskEntity.toDomainModel(): Task {
        return Task(
            id = id,
            title = title,
            description = description,
            dueDate = dueDate,
            priority = priority,
            category = category,
            isCompleted = isCompleted,
            hasReminder = hasReminder,
            reminderTime = reminderTime,
            createdAt = createdAt,
            updatedAt = updatedAt
        )
    }
    
    private fun Task.toEntity(): TaskEntity {
        return TaskEntity(
            id = id,
            title = title,
            description = description,
            dueDate = dueDate,
            priority = priority,
            category = category,
            isCompleted = isCompleted,
            hasReminder = hasReminder,
            reminderTime = reminderTime,
            createdAt = createdAt,
            updatedAt = updatedAt
        )
    }
}
