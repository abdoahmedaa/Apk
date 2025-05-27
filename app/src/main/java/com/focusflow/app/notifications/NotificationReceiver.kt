package com.focusflow.app.notifications

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class NotificationReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        val notificationManager = NotificationManager(context)
        
        when (intent.action) {
            "TASK_REMINDER" -> {
                val taskId = intent.getLongExtra("task_id", -1)
                val taskTitle = intent.getStringExtra("task_title") ?: "Task Reminder"
                notificationManager.showTaskReminder(taskId, taskTitle)
            }
            "HABIT_REMINDER" -> {
                val habitId = intent.getLongExtra("habit_id", -1)
                val habitTitle = intent.getStringExtra("habit_title") ?: "Habit Reminder"
                notificationManager.showHabitReminder(habitId, habitTitle)
            }
        }
    }
}
