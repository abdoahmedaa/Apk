package com.focusflow.app.data.repository

import com.focusflow.app.data.database.dao.HabitDao
import com.focusflow.app.data.database.entities.HabitEntity
import com.focusflow.app.data.database.entities.HabitLogEntity
import com.focusflow.app.domain.model.Habit
import com.focusflow.app.domain.model.HabitLog
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import java.util.Date
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class HabitRepository @Inject constructor(
    private val habitDao: HabitDao
) {
    
    fun getActiveHabits(): Flow<List<Habit>> {
        return habitDao.getHabitsWithLogs().map { habitsWithLogs ->
            habitsWithLogs.map { it.toDomainModel() }
        }
    }
    
    fun getAllHabits(): Flow<List<Habit>> {
        return habitDao.getAllHabits().map { entities ->
            entities.map { it.toDomainModel() }
        }
    }
    
    suspend fun getHabitById(id: Long): Habit? {
        return habitDao.getHabitById(id)?.toDomainModel()
    }
    
    suspend fun getHabitsWithReminders(): List<Habit> {
        return habitDao.getHabitsWithReminders().map { it.toDomainModel() }
    }
    
    fun getHabitLogs(habitId: Long): Flow<List<HabitLog>> {
        return habitDao.getHabitLogs(habitId).map { entities ->
            entities.map { it.toDomainModel() }
        }
    }
    
    fun getHabitLogsByDateRange(habitId: Long, startDate: Date, endDate: Date): Flow<List<HabitLog>> {
        return habitDao.getHabitLogsByDateRange(habitId, startDate, endDate).map { entities ->
            entities.map { it.toDomainModel() }
        }
    }
    
    suspend fun getHabitLogByDate(habitId: Long, date: Date): HabitLog? {
        return habitDao.getHabitLogByDate(habitId, date)?.toDomainModel()
    }
    
    suspend fun insertHabit(habit: Habit): Long {
        return habitDao.insertHabit(habit.toEntity())
    }
    
    suspend fun updateHabit(habit: Habit) {
        habitDao.updateHabit(habit.toEntity())
    }
    
    suspend fun deleteHabit(habit: Habit) {
        habitDao.deleteHabit(habit.toEntity())
    }
    
    suspend fun deleteHabitById(id: Long) {
        habitDao.deleteHabitById(id)
    }
    
    suspend fun insertHabitLog(habitLog: HabitLog): Long {
        return habitDao.insertHabitLog(habitLog.toEntity())
    }
    
    suspend fun updateHabitLog(habitLog: HabitLog) {
        habitDao.updateHabitLog(habitLog.toEntity())
    }
    
    suspend fun deleteHabitLog(habitLog: HabitLog) {
        habitDao.deleteHabitLog(habitLog.toEntity())
    }
    
    suspend fun deleteHabitLogByDate(habitId: Long, date: Date) {
        habitDao.deleteHabitLogByDate(habitId, date)
    }
    
    suspend fun getTotalCompletions(habitId: Long): Int {
        return habitDao.getTotalCompletions(habitId)
    }
    
    suspend fun getTotalDaysCompleted(habitId: Long): Int {
        return habitDao.getTotalDaysCompleted(habitId)
    }
    
    suspend fun getLongestStreak(habitId: Long): Int {
        return habitDao.getLongestStreak(habitId) ?: 0
    }
    
    // Extension functions for mapping
    private fun com.focusflow.app.data.database.dao.HabitWithLogs.toDomainModel(): Habit {
        return Habit(
            id = habit.id,
            title = habit.title,
            description = habit.description,
            frequency = habit.frequency,
            targetCount = habit.targetCount,
            color = habit.color,
            icon = habit.icon,
            isActive = habit.isActive,
            hasReminder = habit.hasReminder,
            reminderTime = habit.reminderTime,
            logs = logs.map { it.toDomainModel() },
            createdAt = habit.createdAt,
            updatedAt = habit.updatedAt
        )
    }
    
    private fun HabitEntity.toDomainModel(): Habit {
        return Habit(
            id = id,
            title = title,
            description = description,
            frequency = frequency,
            targetCount = targetCount,
            color = color,
            icon = icon,
            isActive = isActive,
            hasReminder = hasReminder,
            reminderTime = reminderTime,
            createdAt = createdAt,
            updatedAt = updatedAt
        )
    }
    
    private fun HabitLogEntity.toDomainModel(): HabitLog {
        return HabitLog(
            id = id,
            habitId = habitId,
            date = date,
            count = count,
            notes = notes,
            createdAt = createdAt
        )
    }
    
    private fun Habit.toEntity(): HabitEntity {
        return HabitEntity(
            id = id,
            title = title,
            description = description,
            frequency = frequency,
            targetCount = targetCount,
            color = color,
            icon = icon,
            isActive = isActive,
            hasReminder = hasReminder,
            reminderTime = reminderTime,
            createdAt = createdAt,
            updatedAt = updatedAt
        )
    }
    
    private fun HabitLog.toEntity(): HabitLogEntity {
        return HabitLogEntity(
            id = id,
            habitId = habitId,
            date = date,
            count = count,
            notes = notes,
            createdAt = createdAt
        )
    }
}
