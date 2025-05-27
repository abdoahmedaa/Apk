package com.focusflow.app.data.repository

import com.focusflow.app.data.database.dao.TodoDao
import com.focusflow.app.data.database.entities.TodoListEntity
import com.focusflow.app.data.database.entities.TodoItemEntity
import com.focusflow.app.domain.model.TodoList
import com.focusflow.app.domain.model.TodoItem
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import java.util.Date
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TodoRepository @Inject constructor(
    private val todoDao: TodoDao
) {

    fun getAllTodoLists(): Flow<List<TodoList>> {
        return todoDao.getTodoListsWithItems().map { listWithItems ->
            listWithItems.map { it.toDomainModel() }
        }
    }

    suspend fun getTodoListById(id: Long): TodoList? {
        val listEntity = todoDao.getTodoListById(id) ?: return null
        return listEntity.toDomainModel()
    }

    fun getTodoItemsByListId(todoListId: Long): Flow<List<TodoItem>> {
        return todoDao.getTodoItemsByListId(todoListId).map { entities ->
            entities.map { it.toDomainModel() }
        }
    }

    suspend fun insertTodoList(todoList: TodoList): Long {
        return todoDao.insertTodoList(todoList.toEntity())
    }

    suspend fun updateTodoList(todoList: TodoList) {
        todoDao.updateTodoList(todoList.toEntity())
    }

    suspend fun deleteTodoList(todoList: TodoList) {
        todoDao.deleteTodoList(todoList.toEntity())
    }

    suspend fun deleteTodoListById(id: Long) {
        todoDao.deleteTodoListById(id)
    }

    suspend fun insertTodoItem(todoItem: TodoItem): Long {
        return todoDao.insertTodoItem(todoItem.toEntity())
    }

    suspend fun updateTodoItem(todoItem: TodoItem) {
        todoDao.updateTodoItem(todoItem.toEntity())
    }

    suspend fun deleteTodoItem(todoItem: TodoItem) {
        todoDao.deleteTodoItem(todoItem.toEntity())
    }

    suspend fun deleteTodoItemById(id: Long) {
        todoDao.deleteTodoItemById(id)
    }

    suspend fun updateTodoItemCompletion(id: Long, isCompleted: Boolean) {
        todoDao.updateTodoItemCompletion(id, isCompleted)
    }

    suspend fun getTodoItemCount(todoListId: Long): Int {
        return todoDao.getTodoItemCount(todoListId)
    }

    suspend fun getCompletedTodoItemCount(todoListId: Long): Int {
        return todoDao.getCompletedTodoItemCount(todoListId)
    }

    // Extension functions for mapping
    private fun com.focusflow.app.data.database.dao.TodoListWithItems.toDomainModel(): TodoList {
        return TodoList(
            id = todoList.id,
            title = todoList.title,
            description = todoList.description,
            color = todoList.color,
            items = items.map { it.toDomainModel() },
            createdAt = todoList.createdAt,
            updatedAt = todoList.updatedAt
        )
    }

    private fun TodoListEntity.toDomainModel(items: List<TodoItem> = emptyList()): TodoList {
        return TodoList(
            id = id,
            title = title,
            description = description,
            color = color,
            items = items,
            createdAt = createdAt,
            updatedAt = updatedAt
        )
    }

    private fun TodoItemEntity.toDomainModel(): TodoItem {
        return TodoItem(
            id = id,
            todoListId = todoListId,
            title = title,
            isCompleted = isCompleted,
            position = position,
            createdAt = createdAt,
            updatedAt = updatedAt
        )
    }

    private fun TodoList.toEntity(): TodoListEntity {
        return TodoListEntity(
            id = id,
            title = title,
            description = description,
            color = color,
            createdAt = createdAt,
            updatedAt = updatedAt
        )
    }

    private fun TodoItem.toEntity(): TodoItemEntity {
        return TodoItemEntity(
            id = id,
            todoListId = todoListId,
            title = title,
            isCompleted = isCompleted,
            position = position,
            createdAt = createdAt,
            updatedAt = updatedAt
        )
    }
}
