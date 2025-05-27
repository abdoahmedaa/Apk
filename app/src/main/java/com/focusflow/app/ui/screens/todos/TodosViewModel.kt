package com.focusflow.app.ui.screens.todos

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.focusflow.app.data.repository.TodoRepository
import com.focusflow.app.domain.model.TodoList
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TodosViewModel @Inject constructor(
    private val todoRepository: TodoRepository
) : ViewModel() {
    
    private val _uiState = MutableStateFlow(TodosUiState())
    val uiState: StateFlow<TodosUiState> = _uiState.asStateFlow()
    
    init {
        loadTodoLists()
    }
    
    private fun loadTodoLists() {
        viewModelScope.launch {
            todoRepository.getAllTodoLists().collect { todoLists ->
                _uiState.value = _uiState.value.copy(
                    todoLists = todoLists,
                    isLoading = false
                )
            }
        }
    }
    
    fun addTodoList(title: String, description: String = "", color: String = "#2196F3") {
        viewModelScope.launch {
            val todoList = TodoList(
                title = title,
                description = description,
                color = color
            )
            todoRepository.insertTodoList(todoList)
        }
    }
    
    fun deleteTodoList(todoList: TodoList) {
        viewModelScope.launch {
            todoRepository.deleteTodoList(todoList)
        }
    }
}

data class TodosUiState(
    val todoLists: List<TodoList> = emptyList(),
    val isLoading: Boolean = true,
    val error: String? = null
)
