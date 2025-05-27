package com.focusflow.app.data.database.dao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u00a7@\u00a2\u0006\u0002\u0010\u000eJ\u001e\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u00a7@\u00a2\u0006\u0002\u0010\u0013J\u0014\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00160\u0015H\'J\u0014\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00160\u0015H\'J\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ \u0010\u0019\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u00a7@\u00a2\u0006\u0002\u0010\u0013J\u001c\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00160\u00152\u0006\u0010\u0010\u001a\u00020\tH\'J,\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00160\u00152\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0012H\'J\u0014\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00160\u0015H\'J\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u0016H\u00a7@\u00a2\u0006\u0002\u0010!J\u0018\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010\u0010\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u0016\u0010$\u001a\u00020#2\u0006\u0010\u0010\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u0016\u0010%\u001a\u00020#2\u0006\u0010\u0010\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u0016\u0010&\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\'\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u00a7@\u00a2\u0006\u0002\u0010\u000eJ\u0016\u0010(\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010)\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u00a7@\u00a2\u0006\u0002\u0010\u000e\u00a8\u0006*"}, d2 = {"Lcom/focusflow/app/data/database/dao/HabitDao;", "", "deleteHabit", "", "habit", "Lcom/focusflow/app/data/database/entities/HabitEntity;", "(Lcom/focusflow/app/data/database/entities/HabitEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteHabitById", "id", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteHabitLog", "habitLog", "Lcom/focusflow/app/data/database/entities/HabitLogEntity;", "(Lcom/focusflow/app/data/database/entities/HabitLogEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteHabitLogByDate", "habitId", "date", "Ljava/util/Date;", "(JLjava/util/Date;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getActiveHabits", "Lkotlinx/coroutines/flow/Flow;", "", "getAllHabits", "getHabitById", "getHabitLogByDate", "getHabitLogs", "getHabitLogsByDateRange", "startDate", "endDate", "getHabitsWithLogs", "Lcom/focusflow/app/data/database/dao/HabitWithLogs;", "getHabitsWithReminders", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLongestStreak", "", "getTotalCompletions", "getTotalDaysCompleted", "insertHabit", "insertHabitLog", "updateHabit", "updateHabitLog", "app_debug"})
@androidx.room.Dao()
public abstract interface HabitDao {
    
    @androidx.room.Query(value = "SELECT * FROM habits WHERE isActive = 1 ORDER BY createdAt DESC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.focusflow.app.data.database.entities.HabitEntity>> getActiveHabits();
    
    @androidx.room.Query(value = "SELECT * FROM habits ORDER BY createdAt DESC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.focusflow.app.data.database.entities.HabitEntity>> getAllHabits();
    
    @androidx.room.Query(value = "SELECT * FROM habits WHERE id = :id")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getHabitById(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.focusflow.app.data.database.entities.HabitEntity> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM habits WHERE hasReminder = 1 AND isActive = 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getHabitsWithReminders(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.focusflow.app.data.database.entities.HabitEntity>> $completion);
    
    @androidx.room.Insert()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertHabit(@org.jetbrains.annotations.NotNull()
    com.focusflow.app.data.database.entities.HabitEntity habit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @androidx.room.Update()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateHabit(@org.jetbrains.annotations.NotNull()
    com.focusflow.app.data.database.entities.HabitEntity habit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteHabit(@org.jetbrains.annotations.NotNull()
    com.focusflow.app.data.database.entities.HabitEntity habit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM habits WHERE id = :id")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteHabitById(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM habit_logs WHERE habitId = :habitId ORDER BY date DESC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.focusflow.app.data.database.entities.HabitLogEntity>> getHabitLogs(long habitId);
    
    @androidx.room.Query(value = "SELECT * FROM habit_logs WHERE habitId = :habitId AND date BETWEEN :startDate AND :endDate ORDER BY date ASC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.focusflow.app.data.database.entities.HabitLogEntity>> getHabitLogsByDateRange(long habitId, @org.jetbrains.annotations.NotNull()
    java.util.Date startDate, @org.jetbrains.annotations.NotNull()
    java.util.Date endDate);
    
    @androidx.room.Query(value = "SELECT * FROM habit_logs WHERE habitId = :habitId AND date = :date")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getHabitLogByDate(long habitId, @org.jetbrains.annotations.NotNull()
    java.util.Date date, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.focusflow.app.data.database.entities.HabitLogEntity> $completion);
    
    @androidx.room.Insert()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertHabitLog(@org.jetbrains.annotations.NotNull()
    com.focusflow.app.data.database.entities.HabitLogEntity habitLog, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @androidx.room.Update()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateHabitLog(@org.jetbrains.annotations.NotNull()
    com.focusflow.app.data.database.entities.HabitLogEntity habitLog, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteHabitLog(@org.jetbrains.annotations.NotNull()
    com.focusflow.app.data.database.entities.HabitLogEntity habitLog, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM habit_logs WHERE habitId = :habitId AND date = :date")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteHabitLogByDate(long habitId, @org.jetbrains.annotations.NotNull()
    java.util.Date date, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM habit_logs WHERE habitId = :habitId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTotalCompletions(long habitId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "SELECT COUNT(DISTINCT date) FROM habit_logs WHERE habitId = :habitId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTotalDaysCompleted(long habitId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "SELECT MAX(streak) FROM (SELECT COUNT(*) as streak FROM habit_logs WHERE habitId = :habitId GROUP BY date ORDER BY date)")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getLongestStreak(long habitId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Transaction()
    @androidx.room.Query(value = "SELECT * FROM habits WHERE isActive = 1 ORDER BY createdAt DESC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.focusflow.app.data.database.dao.HabitWithLogs>> getHabitsWithLogs();
}