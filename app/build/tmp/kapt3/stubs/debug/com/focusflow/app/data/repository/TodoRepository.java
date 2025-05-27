package com.focusflow.app.data.repository;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0086@\u00a2\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@\u00a2\u0006\u0002\u0010\u0011J\u0016\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0086@\u00a2\u0006\u0002\u0010\rJ\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00150\u0014J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fH\u0086@\u00a2\u0006\u0002\u0010\rJ\u0016\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fH\u0086@\u00a2\u0006\u0002\u0010\rJ\u001a\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00150\u00142\u0006\u0010\u0018\u001a\u00020\fJ\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\fH\u0086@\u00a2\u0006\u0002\u0010\rJ\u0016\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\tJ\u0016\u0010\u001d\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@\u00a2\u0006\u0002\u0010\u0011J\u0016\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\tJ\u001e\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010 \u001a\u00020!H\u0086@\u00a2\u0006\u0002\u0010\"J\u0016\u0010#\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@\u00a2\u0006\u0002\u0010\u0011J\f\u0010$\u001a\u00020\u0010*\u00020%H\u0002J\f\u0010$\u001a\u00020\b*\u00020&H\u0002J\u001c\u0010$\u001a\u00020\u0010*\u00020\'2\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020\b0\u0015H\u0002J\f\u0010)\u001a\u00020&*\u00020\bH\u0002J\f\u0010)\u001a\u00020\'*\u00020\u0010H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/focusflow/app/data/repository/TodoRepository;", "", "todoDao", "Lcom/focusflow/app/data/database/dao/TodoDao;", "(Lcom/focusflow/app/data/database/dao/TodoDao;)V", "deleteTodoItem", "", "todoItem", "Lcom/focusflow/app/domain/model/TodoItem;", "(Lcom/focusflow/app/domain/model/TodoItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTodoItemById", "id", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTodoList", "todoList", "Lcom/focusflow/app/domain/model/TodoList;", "(Lcom/focusflow/app/domain/model/TodoList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTodoListById", "getAllTodoLists", "Lkotlinx/coroutines/flow/Flow;", "", "getCompletedTodoItemCount", "", "todoListId", "getTodoItemCount", "getTodoItemsByListId", "getTodoListById", "insertTodoItem", "insertTodoList", "updateTodoItem", "updateTodoItemCompletion", "isCompleted", "", "(JZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateTodoList", "toDomainModel", "Lcom/focusflow/app/data/database/dao/TodoListWithItems;", "Lcom/focusflow/app/data/database/entities/TodoItemEntity;", "Lcom/focusflow/app/data/database/entities/TodoListEntity;", "items", "toEntity", "app_debug"})
public final class TodoRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.focusflow.app.data.database.dao.TodoDao todoDao = null;
    
    @javax.inject.Inject()
    public TodoRepository(@org.jetbrains.annotations.NotNull()
    com.focusflow.app.data.database.dao.TodoDao todoDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.focusflow.app.domain.model.TodoList>> getAllTodoLists() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTodoListById(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.focusflow.app.domain.model.TodoList> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.focusflow.app.domain.model.TodoItem>> getTodoItemsByListId(long todoListId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertTodoList(@org.jetbrains.annotations.NotNull()
    com.focusflow.app.domain.model.TodoList todoList, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateTodoList(@org.jetbrains.annotations.NotNull()
    com.focusflow.app.domain.model.TodoList todoList, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteTodoList(@org.jetbrains.annotations.NotNull()
    com.focusflow.app.domain.model.TodoList todoList, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteTodoListById(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertTodoItem(@org.jetbrains.annotations.NotNull()
    com.focusflow.app.domain.model.TodoItem todoItem, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateTodoItem(@org.jetbrains.annotations.NotNull()
    com.focusflow.app.domain.model.TodoItem todoItem, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteTodoItem(@org.jetbrains.annotations.NotNull()
    com.focusflow.app.domain.model.TodoItem todoItem, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteTodoItemById(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateTodoItemCompletion(long id, boolean isCompleted, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTodoItemCount(long todoListId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCompletedTodoItemCount(long todoListId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    private final com.focusflow.app.domain.model.TodoList toDomainModel(com.focusflow.app.data.database.dao.TodoListWithItems $this$toDomainModel) {
        return null;
    }
    
    private final com.focusflow.app.domain.model.TodoList toDomainModel(com.focusflow.app.data.database.entities.TodoListEntity $this$toDomainModel, java.util.List<com.focusflow.app.domain.model.TodoItem> items) {
        return null;
    }
    
    private final com.focusflow.app.domain.model.TodoItem toDomainModel(com.focusflow.app.data.database.entities.TodoItemEntity $this$toDomainModel) {
        return null;
    }
    
    private final com.focusflow.app.data.database.entities.TodoListEntity toEntity(com.focusflow.app.domain.model.TodoList $this$toEntity) {
        return null;
    }
    
    private final com.focusflow.app.data.database.entities.TodoItemEntity toEntity(com.focusflow.app.domain.model.TodoItem $this$toEntity) {
        return null;
    }
}