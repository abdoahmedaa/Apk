package com.focusflow.app.notifications

import android.app.NotificationChannel
import android.app.NotificationManager as AndroidNotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.core.app.NotificationCompat
import com.focusflow.app.MainActivity
import com.focusflow.app.R

class NotificationManager(private val context: Context) {
    
    private val notificationManager = context.getSystemService(Context.NOTIFICATION_SERVICE) as AndroidNotificationManager
    
    companion object {
        const val TASK_CHANNEL_ID = "task_reminders"
        const val HABIT_CHANNEL_ID = "habit_reminders"
        const val TASK_NOTIFICATION_ID = 1001
        const val HABIT_NOTIFICATION_ID = 1002
    }
    
    init {
        createNotificationChannels()
    }
    
    private fun createNotificationChannels() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val taskChannel = NotificationChannel(
                TASK_CHANNEL_ID,
                "Task Reminders",
                AndroidNotificationManager.IMPORTANCE_DEFAULT
            ).apply {
                description = "Notifications for task reminders"
            }
            
            val habitChannel = NotificationChannel(
                HABIT_CHANNEL_ID,
                "Habit Reminders",
                AndroidNotificationManager.IMPORTANCE_DEFAULT
            ).apply {
                description = "Notifications for habit reminders"
            }
            
            notificationManager.createNotificationChannel(taskChannel)
            notificationManager.createNotificationChannel(habitChannel)
        }
    }
    
    fun showTaskReminder(taskId: Long, taskTitle: String) {
        val intent = Intent(context, MainActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        }
        
        val pendingIntent = PendingIntent.getActivity(
            context,
            taskId.toInt(),
            intent,
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
        )
        
        val notification = NotificationCompat.Builder(context, TASK_CHANNEL_ID)
            .setSmallIcon(android.R.drawable.ic_dialog_info) // Use a proper icon in production
            .setContentTitle("Task Reminder")
            .setContentText(taskTitle)
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            .setContentIntent(pendingIntent)
            .setAutoCancel(true)
            .build()
        
        notificationManager.notify(TASK_NOTIFICATION_ID + taskId.toInt(), notification)
    }
    
    fun showHabitReminder(habitId: Long, habitTitle: String) {
        val intent = Intent(context, MainActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        }
        
        val pendingIntent = PendingIntent.getActivity(
            context,
            habitId.toInt(),
            intent,
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
        )
        
        val notification = NotificationCompat.Builder(context, HABIT_CHANNEL_ID)
            .setSmallIcon(android.R.drawable.ic_dialog_info) // Use a proper icon in production
            .setContentTitle("Habit Reminder")
            .setContentText("Time to complete: $habitTitle")
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            .setContentIntent(pendingIntent)
            .setAutoCancel(true)
            .build()
        
        notificationManager.notify(HABIT_NOTIFICATION_ID + habitId.toInt(), notification)
    }
}
