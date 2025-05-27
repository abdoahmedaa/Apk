package com.focusflow.app.data.database.dao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u00a7@\u00a2\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00120\u0011H\'J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u0016\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u001c\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00120\u00112\u0006\u0010\u0015\u001a\u00020\tH\'J\u0018\u0010\u0019\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u0014\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00120\u0011H\'J\u0016\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u001d\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u00a7@\u00a2\u0006\u0002\u0010\u000eJ\u0016\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\u001f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010 \u001a\u00020!H\u00a7@\u00a2\u0006\u0002\u0010\"J\u0016\u0010#\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u00a7@\u00a2\u0006\u0002\u0010\u000e\u00a8\u0006$"}, d2 = {"Lcom/focusflow/app/data/database/dao/TodoDao;", "", "deleteTodoItem", "", "todoItem", "Lcom/focusflow/app/data/database/entities/TodoItemEntity;", "(Lcom/focusflow/app/data/database/entities/TodoItemEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTodoItemById", "id", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTodoList", "todoList", "Lcom/focusflow/app/data/database/entities/TodoListEntity;", "(Lcom/focusflow/app/data/database/entities/TodoListEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTodoListById", "getAllTodoLists", "Lkotlinx/coroutines/flow/Flow;", "", "getCompletedTodoItemCount", "", "todoListId", "getTodoItemById", "getTodoItemCount", "getTodoItemsByListId", "getTodoListById", "getTodoListsWithItems", "Lcom/focusflow/app/data/database/dao/TodoListWithItems;", "insertTodoItem", "insertTodoList", "updateTodoItem", "updateTodoItemCompletion", "isCompleted", "", "(JZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateTodoList", "app_debug"})
@androidx.room.Dao()
public abstract interface TodoDao {
    
    @androidx.room.Query(value = "SELECT * FROM todo_lists ORDER BY updatedAt DESC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.focusflow.app.data.database.entities.TodoListEntity>> getAllTodoLists();
    
    @androidx.room.Query(value = "SELECT * FROM todo_lists WHERE id = :id")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTodoListById(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.focusflow.app.data.database.entities.TodoListEntity> $completion);
    
    @androidx.room.Insert()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertTodoList(@org.jetbrains.annotations.NotNull()
    com.focusflow.app.data.database.entities.TodoListEntity todoList, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @androidx.room.Update()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateTodoList(@org.jetbrains.annotations.NotNull()
    com.focusflow.app.data.database.entities.TodoListEntity todoList, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteTodoList(@org.jetbrains.annotations.NotNull()
    com.focusflow.app.data.database.entities.TodoListEntity todoList, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM todo_lists WHERE id = :id")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteTodoListById(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM todo_items WHERE todoListId = :todoListId ORDER BY position ASC, createdAt ASC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.focusflow.app.data.database.entities.TodoItemEntity>> getTodoItemsByListId(long todoListId);
    
    @androidx.room.Query(value = "SELECT * FROM todo_items WHERE id = :id")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTodoItemById(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.focusflow.app.data.database.entities.TodoItemEntity> $completion);
    
    @androidx.room.Insert()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertTodoItem(@org.jetbrains.annotations.NotNull()
    com.focusflow.app.data.database.entities.TodoItemEntity todoItem, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @androidx.room.Update()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateTodoItem(@org.jetbrains.annotations.NotNull()
    com.focusflow.app.data.database.entities.TodoItemEntity todoItem, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteTodoItem(@org.jetbrains.annotations.NotNull()
    com.focusflow.app.data.database.entities.TodoItemEntity todoItem, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM todo_items WHERE id = :id")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteTodoItemById(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "UPDATE todo_items SET isCompleted = :isCompleted WHERE id = :id")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateTodoItemCompletion(long id, boolean isCompleted, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM todo_items WHERE todoListId = :todoListId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTodoItemCount(long todoListId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM todo_items WHERE todoListId = :todoListId AND isCompleted = 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCompletedTodoItemCount(long todoListId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Transaction()
    @androidx.room.Query(value = "SELECT * FROM todo_lists ORDER BY updatedAt DESC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.focusflow.app.data.database.dao.TodoListWithItems>> getTodoListsWithItems();
}