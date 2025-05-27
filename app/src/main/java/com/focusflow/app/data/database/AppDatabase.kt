package com.focusflow.app.data.database

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import android.content.Context
import com.focusflow.app.data.database.converters.Converters
import com.focusflow.app.data.database.dao.TaskDao
import com.focusflow.app.data.database.dao.TodoDao
import com.focusflow.app.data.database.dao.HabitDao
import com.focusflow.app.data.database.entities.*

@Database(
    entities = [
        TaskEntity::class,
        TodoListEntity::class,
        TodoItemEntity::class,
        HabitEntity::class,
        HabitLogEntity::class
    ],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {
    
    abstract fun taskDao(): TaskDao
    abstract fun todoDao(): TodoDao
    abstract fun habitDao(): HabitDao
    
    companion object {
        const val DATABASE_NAME = "focusflow_database"
    }
}
