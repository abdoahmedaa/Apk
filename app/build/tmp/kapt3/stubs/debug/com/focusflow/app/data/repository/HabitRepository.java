package com.focusflow.app.data.repository;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0086@\u00a2\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@\u00a2\u0006\u0002\u0010\u0011J\u001e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0086@\u00a2\u0006\u0002\u0010\u0016J\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00190\u0018J\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00190\u0018J\u0018\u0010\u001b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\fH\u0086@\u00a2\u0006\u0002\u0010\rJ \u0010\u001c\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0086@\u00a2\u0006\u0002\u0010\u0016J\u001a\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00190\u00182\u0006\u0010\u0013\u001a\u00020\fJ*\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00190\u00182\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u0015J\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u0019H\u0086@\u00a2\u0006\u0002\u0010\"J\u0016\u0010#\u001a\u00020$2\u0006\u0010\u0013\u001a\u00020\fH\u0086@\u00a2\u0006\u0002\u0010\rJ\u0016\u0010%\u001a\u00020$2\u0006\u0010\u0013\u001a\u00020\fH\u0086@\u00a2\u0006\u0002\u0010\rJ\u0016\u0010&\u001a\u00020$2\u0006\u0010\u0013\u001a\u00020\fH\u0086@\u00a2\u0006\u0002\u0010\rJ\u0016\u0010\'\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\tJ\u0016\u0010(\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@\u00a2\u0006\u0002\u0010\u0011J\u0016\u0010)\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\tJ\u0016\u0010*\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@\u00a2\u0006\u0002\u0010\u0011J\f\u0010+\u001a\u00020\b*\u00020,H\u0002J\f\u0010+\u001a\u00020\b*\u00020-H\u0002J\f\u0010+\u001a\u00020\u0010*\u00020.H\u0002J\f\u0010/\u001a\u00020-*\u00020\bH\u0002J\f\u0010/\u001a\u00020.*\u00020\u0010H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00060"}, d2 = {"Lcom/focusflow/app/data/repository/HabitRepository;", "", "habitDao", "Lcom/focusflow/app/data/database/dao/HabitDao;", "(Lcom/focusflow/app/data/database/dao/HabitDao;)V", "deleteHabit", "", "habit", "Lcom/focusflow/app/domain/model/Habit;", "(Lcom/focusflow/app/domain/model/Habit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteHabitById", "id", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteHabitLog", "habitLog", "Lcom/focusflow/app/domain/model/HabitLog;", "(Lcom/focusflow/app/domain/model/HabitLog;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteHabitLogByDate", "habitId", "date", "Ljava/util/Date;", "(JLjava/util/Date;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getActiveHabits", "Lkotlinx/coroutines/flow/Flow;", "", "getAllHabits", "getHabitById", "getHabitLogByDate", "getHabitLogs", "getHabitLogsByDateRange", "startDate", "endDate", "getHabitsWithReminders", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLongestStreak", "", "getTotalCompletions", "getTotalDaysCompleted", "insertHabit", "insertHabitLog", "updateHabit", "updateHabitLog", "toDomainModel", "Lcom/focusflow/app/data/database/dao/HabitWithLogs;", "Lcom/focusflow/app/data/database/entities/HabitEntity;", "Lcom/focusflow/app/data/database/entities/HabitLogEntity;", "toEntity", "app_debug"})
public final class HabitRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.focusflow.app.data.database.dao.HabitDao habitDao = null;
    
    @javax.inject.Inject()
    public HabitRepository(@org.jetbrains.annotations.NotNull()
    com.focusflow.app.data.database.dao.HabitDao habitDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.focusflow.app.domain.model.Habit>> getActiveHabits() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.focusflow.app.domain.model.Habit>> getAllHabits() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getHabitById(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.focusflow.app.domain.model.Habit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getHabitsWithReminders(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.focusflow.app.domain.model.Habit>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.focusflow.app.domain.model.HabitLog>> getHabitLogs(long habitId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.focusflow.app.domain.model.HabitLog>> getHabitLogsByDateRange(long habitId, @org.jetbrains.annotations.NotNull()
    java.util.Date startDate, @org.jetbrains.annotations.NotNull()
    java.util.Date endDate) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getHabitLogByDate(long habitId, @org.jetbrains.annotations.NotNull()
    java.util.Date date, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.focusflow.app.domain.model.HabitLog> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertHabit(@org.jetbrains.annotations.NotNull()
    com.focusflow.app.domain.model.Habit habit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateHabit(@org.jetbrains.annotations.NotNull()
    com.focusflow.app.domain.model.Habit habit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteHabit(@org.jetbrains.annotations.NotNull()
    com.focusflow.app.domain.model.Habit habit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteHabitById(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertHabitLog(@org.jetbrains.annotations.NotNull()
    com.focusflow.app.domain.model.HabitLog habitLog, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateHabitLog(@org.jetbrains.annotations.NotNull()
    com.focusflow.app.domain.model.HabitLog habitLog, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteHabitLog(@org.jetbrains.annotations.NotNull()
    com.focusflow.app.domain.model.HabitLog habitLog, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteHabitLogByDate(long habitId, @org.jetbrains.annotations.NotNull()
    java.util.Date date, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTotalCompletions(long habitId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTotalDaysCompleted(long habitId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getLongestStreak(long habitId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    private final com.focusflow.app.domain.model.Habit toDomainModel(com.focusflow.app.data.database.dao.HabitWithLogs $this$toDomainModel) {
        return null;
    }
    
    private final com.focusflow.app.domain.model.Habit toDomainModel(com.focusflow.app.data.database.entities.HabitEntity $this$toDomainModel) {
        return null;
    }
    
    private final com.focusflow.app.domain.model.HabitLog toDomainModel(com.focusflow.app.data.database.entities.HabitLogEntity $this$toDomainModel) {
        return null;
    }
    
    private final com.focusflow.app.data.database.entities.HabitEntity toEntity(com.focusflow.app.domain.model.Habit $this$toEntity) {
        return null;
    }
    
    private final com.focusflow.app.data.database.entities.HabitLogEntity toEntity(com.focusflow.app.domain.model.HabitLog $this$toEntity) {
        return null;
    }
}