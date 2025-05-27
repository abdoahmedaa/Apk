package com.focusflow.app.ui.screens.tasks

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.focusflow.app.data.repository.TaskRepository
import com.focusflow.app.domain.model.Task
import com.focusflow.app.data.database.entities.Priority
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.launch
import java.util.Date
import javax.inject.Inject

@HiltViewModel
class TasksViewModel @Inject constructor(
    private val taskRepository: TaskRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(TasksUiState())
    val uiState: StateFlow<TasksUiState> = _uiState.asStateFlow()

    private val _filterType = MutableStateFlow(TaskFilter.ALL)
    private val _searchQuery = MutableStateFlow("")

    init {
        loadTasks()
    }

    private fun loadTasks() {
        viewModelScope.launch {
            combine(
                taskRepository.getAllTasks(),
                _filterType,
                _searchQuery
            ) { tasks, filter, query ->
                val filteredTasks = filterTasks(tasks, filter, query)
                _uiState.value = _uiState.value.copy(
                    tasks = filteredTasks,
                    isLoading = false
                )
            }.collect { }
        }
    }

    private fun filterTasks(tasks: List<Task>, filter: TaskFilter, query: String): List<Task> {
        var filteredTasks = when (filter) {
            TaskFilter.ALL -> tasks
            TaskFilter.ACTIVE -> tasks.filter { !it.isCompleted }
            TaskFilter.COMPLETED -> tasks.filter { it.isCompleted }
            TaskFilter.TODAY -> {
                val today = Date()
                tasks.filter { task ->
                    task.dueDate?.let { dueDate ->
                        isSameDay(dueDate, today)
                    } ?: false
                }
            }
            TaskFilter.OVERDUE -> {
                val now = Date()
                tasks.filter { task ->
                    task.dueDate?.let { dueDate ->
                        dueDate.before(now) && !task.isCompleted
                    } ?: false
                }
            }
        }

        if (query.isNotBlank()) {
            filteredTasks = filteredTasks.filter { task ->
                task.title.contains(query, ignoreCase = true) ||
                task.description.contains(query, ignoreCase = true) ||
                task.category.contains(query, ignoreCase = true)
            }
        }

        return filteredTasks.sortedWith(
            compareByDescending<Task> { it.priority.ordinal }
                .thenBy { it.dueDate }
                .thenByDescending { it.createdAt }
        )
    }

    fun setFilter(filter: TaskFilter) {
        _filterType.value = filter
    }

    fun setSearchQuery(query: String) {
        _searchQuery.value = query
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

    fun addTask(
        title: String,
        description: String = "",
        dueDate: Date? = null,
        priority: Priority = Priority.MEDIUM,
        category: String = ""
    ) {
        viewModelScope.launch {
            val task = Task(
                title = title,
                description = description,
                dueDate = dueDate,
                priority = priority,
                category = category
            )
            taskRepository.insertTask(task)
        }
    }

    private fun isSameDay(date1: Date, date2: Date): Boolean {
        val cal1 = java.util.Calendar.getInstance().apply { time = date1 }
        val cal2 = java.util.Calendar.getInstance().apply { time = date2 }
        return cal1.get(java.util.Calendar.YEAR) == cal2.get(java.util.Calendar.YEAR) &&
               cal1.get(java.util.Calendar.DAY_OF_YEAR) == cal2.get(java.util.Calendar.DAY_OF_YEAR)
    }
}

data class TasksUiState(
    val tasks: List<Task> = emptyList(),
    val isLoading: Boolean = true,
    val error: String? = null
)

enum class TaskFilter {
    ALL, ACTIVE, COMPLETED, TODAY, OVERDUE
}
