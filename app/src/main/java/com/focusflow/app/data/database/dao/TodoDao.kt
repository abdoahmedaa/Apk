package com.focusflow.app.data.database.dao

import androidx.room.*
import com.focusflow.app.data.database.entities.TodoListEntity
import com.focusflow.app.data.database.entities.TodoItemEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface TodoDao {
    
    // TodoList operations
    @Query("SELECT * FROM todo_lists ORDER BY updatedAt DESC")
    fun getAllTodoLists(): Flow<List<TodoListEntity>>
    
    @Query("SELECT * FROM todo_lists WHERE id = :id")
    suspend fun getTodoListById(id: Long): TodoListEntity?
    
    @Insert
    suspend fun insertTodoList(todoList: TodoListEntity): Long
    
    @Update
    suspend fun updateTodoList(todoList: TodoListEntity)
    
    @Delete
    suspend fun deleteTodoList(todoList: TodoListEntity)
    
    @Query("DELETE FROM todo_lists WHERE id = :id")
    suspend fun deleteTodoListById(id: Long)
    
    // TodoItem operations
    @Query("SELECT * FROM todo_items WHERE todoListId = :todoListId ORDER BY position ASC, createdAt ASC")
    fun getTodoItemsByListId(todoListId: Long): Flow<List<TodoItemEntity>>
    
    @Query("SELECT * FROM todo_items WHERE id = :id")
    suspend fun getTodoItemById(id: Long): TodoItemEntity?
    
    @Insert
    suspend fun insertTodoItem(todoItem: TodoItemEntity): Long
    
    @Update
    suspend fun updateTodoItem(todoItem: TodoItemEntity)
    
    @Delete
    suspend fun deleteTodoItem(todoItem: TodoItemEntity)
    
    @Query("DELETE FROM todo_items WHERE id = :id")
    suspend fun deleteTodoItemById(id: Long)
    
    @Query("UPDATE todo_items SET isCompleted = :isCompleted WHERE id = :id")
    suspend fun updateTodoItemCompletion(id: Long, isCompleted: Boolean)
    
    @Query("SELECT COUNT(*) FROM todo_items WHERE todoListId = :todoListId")
    suspend fun getTodoItemCount(todoListId: Long): Int
    
    @Query("SELECT COUNT(*) FROM todo_items WHERE todoListId = :todoListId AND isCompleted = 1")
    suspend fun getCompletedTodoItemCount(todoListId: Long): Int
    
    // Combined operations
    @Transaction
    @Query("SELECT * FROM todo_lists ORDER BY updatedAt DESC")
    fun getTodoListsWithItems(): Flow<List<TodoListWithItems>>
}

data class TodoListWithItems(
    @Embedded val todoList: TodoListEntity,
    @Relation(
        parentColumn = "id",
        entityColumn = "todoListId"
    )
    val items: List<TodoItemEntity>
)
