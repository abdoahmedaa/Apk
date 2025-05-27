package com.focusflow.app.ui.screens.habits

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.focusflow.app.data.repository.HabitRepository
import com.focusflow.app.domain.model.Habit
import com.focusflow.app.domain.model.HabitLog
import com.focusflow.app.data.database.entities.HabitFrequency
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import java.util.Date
import javax.inject.Inject

@HiltViewModel
class HabitsViewModel @Inject constructor(
    private val habitRepository: HabitRepository
) : ViewModel() {
    
    private val _uiState = MutableStateFlow(HabitsUiState())
    val uiState: StateFlow<HabitsUiState> = _uiState.asStateFlow()
    
    init {
        loadHabits()
    }
    
    private fun loadHabits() {
        viewModelScope.launch {
            habitRepository.getActiveHabits().collect { habits ->
                _uiState.value = _uiState.value.copy(
                    habits = habits,
                    isLoading = false
                )
            }
        }
    }
    
    fun addHabit(
        title: String,
        description: String = "",
        frequency: HabitFrequency = HabitFrequency.DAILY,
        targetCount: Int = 1,
        color: String = "#4CAF50",
        icon: String = "🎯"
    ) {
        viewModelScope.launch {
            val habit = Habit(
                title = title,
                description = description,
                frequency = frequency,
                targetCount = targetCount,
                color = color,
                icon = icon
            )
            habitRepository.insertHabit(habit)
        }
    }
    
    fun deleteHabit(habit: Habit) {
        viewModelScope.launch {
            habitRepository.deleteHabit(habit)
        }
    }
    
    fun toggleHabitCompletion(habit: Habit) {
        viewModelScope.launch {
            val today = Date()
            val existingLog = habitRepository.getHabitLogByDate(habit.id, today)
            
            if (existingLog != null) {
                // Remove completion for today
                habitRepository.deleteHabitLogByDate(habit.id, today)
            } else {
                // Add completion for today
                val habitLog = HabitLog(
                    habitId = habit.id,
                    date = today,
                    count = 1
                )
                habitRepository.insertHabitLog(habitLog)
            }
        }
    }
}

data class HabitsUiState(
    val habits: List<Habit> = emptyList(),
    val isLoading: Boolean = true,
    val error: String? = null
)
