package com.focusflow.app.data.database;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\n"}, d2 = {"Lcom/focusflow/app/data/database/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "habitDao", "Lcom/focusflow/app/data/database/dao/HabitDao;", "taskDao", "Lcom/focusflow/app/data/database/dao/TaskDao;", "todoDao", "Lcom/focusflow/app/data/database/dao/TodoDao;", "Companion", "app_debug"})
@androidx.room.Database(entities = {com.focusflow.app.data.database.entities.TaskEntity.class, com.focusflow.app.data.database.entities.TodoListEntity.class, com.focusflow.app.data.database.entities.TodoItemEntity.class, com.focusflow.app.data.database.entities.HabitEntity.class, com.focusflow.app.data.database.entities.HabitLogEntity.class}, version = 1, exportSchema = false)
@androidx.room.TypeConverters(value = {com.focusflow.app.data.database.converters.Converters.class})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DATABASE_NAME = "focusflow_database";
    @org.jetbrains.annotations.NotNull()
    public static final com.focusflow.app.data.database.AppDatabase.Companion Companion = null;
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.focusflow.app.data.database.dao.TaskDao taskDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.focusflow.app.data.database.dao.TodoDao todoDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.focusflow.app.data.database.dao.HabitDao habitDao();
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/focusflow/app/data/database/AppDatabase$Companion;", "", "()V", "DATABASE_NAME", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}