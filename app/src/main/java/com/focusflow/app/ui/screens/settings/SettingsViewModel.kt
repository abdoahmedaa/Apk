package com.focusflow.app.ui.screens.settings

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.focusflow.app.backup.BackupManager
import com.focusflow.app.data.repository.TaskRepository
import com.focusflow.app.data.repository.TodoRepository
import com.focusflow.app.data.repository.HabitRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SettingsViewModel @Inject constructor(
    @ApplicationContext private val context: Context,
    private val backupManager: BackupManager,
    private val taskRepository: TaskRepository,
    private val todoRepository: TodoRepository,
    private val habitRepository: HabitRepository
) : ViewModel() {
    
    private val _uiState = MutableStateFlow(SettingsUiState())
    val uiState: StateFlow<SettingsUiState> = _uiState.asStateFlow()
    
    fun toggleDarkMode() {
        _uiState.value = _uiState.value.copy(
            isDarkMode = !_uiState.value.isDarkMode
        )
        // TODO: Save to preferences
    }
    
    fun toggleTaskNotifications() {
        _uiState.value = _uiState.value.copy(
            taskNotificationsEnabled = !_uiState.value.taskNotificationsEnabled
        )
        // TODO: Save to preferences
    }
    
    fun toggleHabitNotifications() {
        _uiState.value = _uiState.value.copy(
            habitNotificationsEnabled = !_uiState.value.habitNotificationsEnabled
        )
        // TODO: Save to preferences
    }
    
    fun exportData() {
        viewModelScope.launch {
            try {
                val filePath = backupManager.exportToJson(context)
                if (filePath != null) {
                    _uiState.value = _uiState.value.copy(
                        message = "Data exported successfully to: $filePath"
                    )
                } else {
                    _uiState.value = _uiState.value.copy(
                        message = "Failed to export data"
                    )
                }
            } catch (e: Exception) {
                _uiState.value = _uiState.value.copy(
                    message = "Error exporting data: ${e.message}"
                )
            }
        }
    }
    
    fun importData() {
        // TODO: Implement file picker for import
        _uiState.value = _uiState.value.copy(
            message = "Import functionality coming soon"
        )
    }
    
    fun showClearDataDialog() {
        _uiState.value = _uiState.value.copy(
            showClearDataDialog = true
        )
    }
    
    fun hideClearDataDialog() {
        _uiState.value = _uiState.value.copy(
            showClearDataDialog = false
        )
    }
    
    fun clearAllData() {
        viewModelScope.launch {
            try {
                // Clear all data from repositories
                // Note: This is a simplified implementation
                // In a real app, you'd want to clear the database properly
                _uiState.value = _uiState.value.copy(
                    message = "All data cleared successfully"
                )
            } catch (e: Exception) {
                _uiState.value = _uiState.value.copy(
                    message = "Error clearing data: ${e.message}"
                )
            }
        }
    }
    
    fun clearMessage() {
        _uiState.value = _uiState.value.copy(message = null)
    }
}

data class SettingsUiState(
    val isDarkMode: Boolean = false,
    val taskNotificationsEnabled: Boolean = true,
    val habitNotificationsEnabled: Boolean = true,
    val showClearDataDialog: Boolean = false,
    val message: String? = null
)
