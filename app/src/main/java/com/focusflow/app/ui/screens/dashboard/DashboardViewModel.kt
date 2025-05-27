package com.focusflow.app.ui.screens.dashboard

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.focusflow.app.data.repository.TaskRepository
import com.focusflow.app.data.repository.HabitRepository
import com.focusflow.app.domain.model.Task
import com.focusflow.app.domain.model.Habit
import com.focusflow.app.utils.DateUtils
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.launch
import java.util.Date
import javax.inject.Inject

@HiltViewModel
class DashboardViewModel @Inject constructor(
    private val taskRepository: TaskRepository,
    private val habitRepository: HabitRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(DashboardUiState())
    val uiState: StateFlow<DashboardUiState> = _uiState.asStateFlow()

    init {
        loadDashboardData()
    }

    private fun loadDashboardData() {
        viewModelScope.launch {
            combine(
                taskRepository.getAllTasks(),
                habitRepository.getActiveHabits()
            ) { tasks, habits ->
                val today = Date()
                val startOfDay = DateUtils.getStartOfDay(today)
                val endOfDay = DateUtils.getEndOfDay(today)

                val todaysTasks = tasks.filter { task ->
                    task.dueDate?.let { dueDate ->
                        DateUtils.isToday(dueDate)
                    } ?: false
                }

                val overdueTasks = tasks.filter { task ->
                    task.dueDate?.let { dueDate ->
                        DateUtils.isOverdue(dueDate) && !task.isCompleted
                    } ?: false
                }

                val completedHabitsToday = habits.count { habit ->
                    habit.logs.any { log ->
                        DateUtils.isToday(log.date)
                    }
                }

                _uiState.value = DashboardUiState(
                    totalTasks = tasks.size,
                    completedTasks = tasks.count { it.isCompleted },
                    todaysTasks = todaysTasks,
                    overdueTasks = overdueTasks,
                    totalHabits = habits.size,
                    completedHabitsToday = completedHabitsToday,
                    todaysHabits = habits,
                    isLoading = false
                )
            }.collect { }
        }
    }

    fun toggleTaskCompletion(task: Task) {
        viewModelScope.launch {
            taskRepository.updateTaskCompletion(task.id, !task.isCompleted)
        }
    }

    fun deleteTask(task: Task) {
        viewModelScope.launch {
            taskRepository.deleteTask(task)
        }
    }

    fun toggleHabitCompletion(habit: Habit) {
        viewModelScope.launch {
            val today = Date()
            val existingLog = habitRepository.getHabitLogByDate(habit.id, today)

            if (existingLog != null) {
                habitRepository.deleteHabitLogByDate(habit.id, today)
            } else {
                val habitLog = com.focusflow.app.domain.model.HabitLog(
                    habitId = habit.id,
                    date = today,
                    count = 1
                )
                habitRepository.insertHabitLog(habitLog)
            }
        }
    }

    fun deleteHabit(habit: Habit) {
        viewModelScope.launch {
            habitRepository.deleteHabit(habit)
        }
    }

    fun refreshData() {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isLoading = true)
            // Refresh data by re-collecting flows - data will be automatically updated
            // through the existing combine flows in init block
            kotlinx.coroutines.delay(1000) // Simulate refresh delay
            _uiState.value = _uiState.value.copy(isLoading = false)
        }
    }
}

data class DashboardUiState(
    val totalTasks: Int = 0,
    val completedTasks: Int = 0,
    val todaysTasks: List<Task> = emptyList(),
    val overdueTasks: List<Task> = emptyList(),
    val totalHabits: Int = 0,
    val completedHabitsToday: Int = 0,
    val todaysHabits: List<Habit> = emptyList(),
    val isLoading: Boolean = true,
    val productivityScore: Float = 0.75f,
    val weeklyProgress: Float = 0.6f,
    val streakCount: Int = 0,
    val timeSpentToday: Long = 0L,
    val achievements: List<String> = emptyList(),
    val upcomingDeadlines: List<Task> = emptyList(),
    val error: String? = null
)
