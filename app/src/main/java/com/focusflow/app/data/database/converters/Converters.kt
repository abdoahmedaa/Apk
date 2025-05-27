package com.focusflow.app.data.database.converters

import androidx.room.TypeConverter
import com.focusflow.app.data.database.entities.Priority
import com.focusflow.app.data.database.entities.HabitFrequency
import java.util.Date

class Converters {
    
    @TypeConverter
    fun fromTimestamp(value: Long?): Date? {
        return value?.let { Date(it) }
    }

    @TypeConverter
    fun dateToTimestamp(date: Date?): Long? {
        return date?.time
    }

    @TypeConverter
    fun fromPriority(priority: Priority): String {
        return priority.name
    }

    @TypeConverter
    fun toPriority(priority: String): Priority {
        return Priority.valueOf(priority)
    }

    @TypeConverter
    fun fromHabitFrequency(frequency: HabitFrequency): String {
        return frequency.name
    }

    @TypeConverter
    fun toHabitFrequency(frequency: String): HabitFrequency {
        return HabitFrequency.valueOf(frequency)
    }
}
