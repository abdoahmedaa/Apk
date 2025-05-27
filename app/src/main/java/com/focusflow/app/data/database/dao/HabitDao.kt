package com.focusflow.app.data.database.dao

import androidx.room.*
import com.focusflow.app.data.database.entities.HabitEntity
import com.focusflow.app.data.database.entities.HabitLogEntity
import kotlinx.coroutines.flow.Flow
import java.util.Date

@Dao
interface HabitDao {
    
    // Habit operations
    @Query("SELECT * FROM habits WHERE isActive = 1 ORDER BY createdAt DESC")
    fun getActiveHabits(): Flow<List<HabitEntity>>
    
    @Query("SELECT * FROM habits ORDER BY createdAt DESC")
    fun getAllHabits(): Flow<List<HabitEntity>>
    
    @Query("SELECT * FROM habits WHERE id = :id")
    suspend fun getHabitById(id: Long): HabitEntity?
    
    @Query("SELECT * FROM habits WHERE hasReminder = 1 AND isActive = 1")
    suspend fun getHabitsWithReminders(): List<HabitEntity>
    
    @Insert
    suspend fun insertHabit(habit: HabitEntity): Long
    
    @Update
    suspend fun updateHabit(habit: HabitEntity)
    
    @Delete
    suspend fun deleteHabit(habit: HabitEntity)
    
    @Query("DELETE FROM habits WHERE id = :id")
    suspend fun deleteHabitById(id: Long)
    
    // Habit log operations
    @Query("SELECT * FROM habit_logs WHERE habitId = :habitId ORDER BY date DESC")
    fun getHabitLogs(habitId: Long): Flow<List<HabitLogEntity>>
    
    @Query("SELECT * FROM habit_logs WHERE habitId = :habitId AND date BETWEEN :startDate AND :endDate ORDER BY date ASC")
    fun getHabitLogsByDateRange(habitId: Long, startDate: Date, endDate: Date): Flow<List<HabitLogEntity>>
    
    @Query("SELECT * FROM habit_logs WHERE habitId = :habitId AND date = :date")
    suspend fun getHabitLogByDate(habitId: Long, date: Date): HabitLogEntity?
    
    @Insert
    suspend fun insertHabitLog(habitLog: HabitLogEntity): Long
    
    @Update
    suspend fun updateHabitLog(habitLog: HabitLogEntity)
    
    @Delete
    suspend fun deleteHabitLog(habitLog: HabitLogEntity)
    
    @Query("DELETE FROM habit_logs WHERE habitId = :habitId AND date = :date")
    suspend fun deleteHabitLogByDate(habitId: Long, date: Date)
    
    // Statistics
    @Query("SELECT COUNT(*) FROM habit_logs WHERE habitId = :habitId")
    suspend fun getTotalCompletions(habitId: Long): Int
    
    @Query("SELECT COUNT(DISTINCT date) FROM habit_logs WHERE habitId = :habitId")
    suspend fun getTotalDaysCompleted(habitId: Long): Int
    
    @Query("SELECT MAX(streak) FROM (SELECT COUNT(*) as streak FROM habit_logs WHERE habitId = :habitId GROUP BY date ORDER BY date)")
    suspend fun getLongestStreak(habitId: Long): Int?
    
    // Combined operations
    @Transaction
    @Query("SELECT * FROM habits WHERE isActive = 1 ORDER BY createdAt DESC")
    fun getHabitsWithLogs(): Flow<List<HabitWithLogs>>
}

data class HabitWithLogs(
    @Embedded val habit: HabitEntity,
    @Relation(
        parentColumn = "id",
        entityColumn = "habitId"
    )
    val logs: List<HabitLogEntity>
)
