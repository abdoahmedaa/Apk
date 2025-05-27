package com.focusflow.app.utils

import java.text.SimpleDateFormat
import java.util.*

object DateUtils {
    
    fun formatDate(date: Date, pattern: String = "MMM dd, yyyy"): String {
        val formatter = SimpleDateFormat(pattern, Locale.getDefault())
        return formatter.format(date)
    }
    
    fun formatTime(date: Date, pattern: String = "HH:mm"): String {
        val formatter = SimpleDateFormat(pattern, Locale.getDefault())
        return formatter.format(date)
    }
    
    fun formatDateTime(date: Date, pattern: String = "MMM dd, yyyy HH:mm"): String {
        val formatter = SimpleDateFormat(pattern, Locale.getDefault())
        return formatter.format(date)
    }
    
    fun isToday(date: Date): Boolean {
        val today = Calendar.getInstance()
        val targetDate = Calendar.getInstance().apply { time = date }
        
        return today.get(Calendar.YEAR) == targetDate.get(Calendar.YEAR) &&
               today.get(Calendar.DAY_OF_YEAR) == targetDate.get(Calendar.DAY_OF_YEAR)
    }
    
    fun isTomorrow(date: Date): Boolean {
        val tomorrow = Calendar.getInstance().apply {
            add(Calendar.DAY_OF_YEAR, 1)
        }
        val targetDate = Calendar.getInstance().apply { time = date }
        
        return tomorrow.get(Calendar.YEAR) == targetDate.get(Calendar.YEAR) &&
               tomorrow.get(Calendar.DAY_OF_YEAR) == targetDate.get(Calendar.DAY_OF_YEAR)
    }
    
    fun isYesterday(date: Date): Boolean {
        val yesterday = Calendar.getInstance().apply {
            add(Calendar.DAY_OF_YEAR, -1)
        }
        val targetDate = Calendar.getInstance().apply { time = date }
        
        return yesterday.get(Calendar.YEAR) == targetDate.get(Calendar.YEAR) &&
               yesterday.get(Calendar.DAY_OF_YEAR) == targetDate.get(Calendar.DAY_OF_YEAR)
    }
    
    fun isOverdue(date: Date): Boolean {
        return date.before(Date())
    }
    
    fun getStartOfDay(date: Date = Date()): Date {
        val calendar = Calendar.getInstance().apply {
            time = date
            set(Calendar.HOUR_OF_DAY, 0)
            set(Calendar.MINUTE, 0)
            set(Calendar.SECOND, 0)
            set(Calendar.MILLISECOND, 0)
        }
        return calendar.time
    }
    
    fun getEndOfDay(date: Date = Date()): Date {
        val calendar = Calendar.getInstance().apply {
            time = date
            set(Calendar.HOUR_OF_DAY, 23)
            set(Calendar.MINUTE, 59)
            set(Calendar.SECOND, 59)
            set(Calendar.MILLISECOND, 999)
        }
        return calendar.time
    }
    
    fun addDays(date: Date, days: Int): Date {
        val calendar = Calendar.getInstance().apply {
            time = date
            add(Calendar.DAY_OF_YEAR, days)
        }
        return calendar.time
    }
    
    fun getDaysBetween(startDate: Date, endDate: Date): Int {
        val start = Calendar.getInstance().apply { time = startDate }
        val end = Calendar.getInstance().apply { time = endDate }
        
        val startDay = start.get(Calendar.DAY_OF_YEAR)
        val endDay = end.get(Calendar.DAY_OF_YEAR)
        val startYear = start.get(Calendar.YEAR)
        val endYear = end.get(Calendar.YEAR)
        
        return if (startYear == endYear) {
            endDay - startDay
        } else {
            // Handle year difference (simplified)
            val daysInStartYear = start.getActualMaximum(Calendar.DAY_OF_YEAR) - startDay
            val daysInEndYear = endDay
            val yearsBetween = endYear - startYear - 1
            
            daysInStartYear + daysInEndYear + (yearsBetween * 365) // Simplified, doesn't account for leap years
        }
    }
}
