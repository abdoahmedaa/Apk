package com.focusflow.app.data.database.dao

import androidx.room.*
import com.focusflow.app.data.database.entities.TaskEntity
import com.focusflow.app.data.database.entities.Priority
import kotlinx.coroutines.flow.Flow
import java.util.Date

@Dao
interface TaskDao {
    
    @Query("SELECT * FROM tasks ORDER BY dueDate ASC, priority DESC, createdAt DESC")
    fun getAllTasks(): Flow<List<TaskEntity>>
    
    @Query("SELECT * FROM tasks WHERE isCompleted = 0 ORDER BY dueDate ASC, priority DESC")
    fun getActiveTasks(): Flow<List<TaskEntity>>
    
    @Query("SELECT * FROM tasks WHERE isCompleted = 1 ORDER BY updatedAt DESC")
    fun getCompletedTasks(): Flow<List<TaskEntity>>
    
    @Query("SELECT * FROM tasks WHERE dueDate BETWEEN :startDate AND :endDate ORDER BY dueDate ASC")
    fun getTasksByDateRange(startDate: Date, endDate: Date): Flow<List<TaskEntity>>
    
    @Query("SELECT * FROM tasks WHERE category = :category ORDER BY dueDate ASC, priority DESC")
    fun getTasksByCategory(category: String): Flow<List<TaskEntity>>
    
    @Query("SELECT * FROM tasks WHERE priority = :priority ORDER BY dueDate ASC")
    fun getTasksByPriority(priority: Priority): Flow<List<TaskEntity>>
    
    @Query("SELECT * FROM tasks WHERE id = :id")
    suspend fun getTaskById(id: Long): TaskEntity?
    
    @Query("SELECT * FROM tasks WHERE hasReminder = 1 AND isCompleted = 0")
    suspend fun getTasksWithReminders(): List<TaskEntity>
    
    @Insert
    suspend fun insertTask(task: TaskEntity): Long
    
    @Update
    suspend fun updateTask(task: TaskEntity)
    
    @Delete
    suspend fun deleteTask(task: TaskEntity)
    
    @Query("DELETE FROM tasks WHERE id = :id")
    suspend fun deleteTaskById(id: Long)
    
    @Query("UPDATE tasks SET isCompleted = :isCompleted, updatedAt = :updatedAt WHERE id = :id")
    suspend fun updateTaskCompletion(id: Long, isCompleted: Boolean, updatedAt: Date)
    
    @Query("SELECT DISTINCT category FROM tasks WHERE category != '' ORDER BY category")
    fun getAllCategories(): Flow<List<String>>
}
