package com.focusflow.app.ui.screens.todos;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000fJ\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\rH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lcom/focusflow/app/ui/screens/todos/TodosViewModel;", "Landroidx/lifecycle/ViewModel;", "todoRepository", "Lcom/focusflow/app/data/repository/TodoRepository;", "(Lcom/focusflow/app/data/repository/TodoRepository;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/focusflow/app/ui/screens/todos/TodosUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "addTodoList", "", "title", "", "description", "color", "deleteTodoList", "todoList", "Lcom/focusflow/app/domain/model/TodoList;", "loadTodoLists", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class TodosViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.focusflow.app.data.repository.TodoRepository todoRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.focusflow.app.ui.screens.todos.TodosUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.focusflow.app.ui.screens.todos.TodosUiState> uiState = null;
    
    @javax.inject.Inject()
    public TodosViewModel(@org.jetbrains.annotations.NotNull()
    com.focusflow.app.data.repository.TodoRepository todoRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.focusflow.app.ui.screens.todos.TodosUiState> getUiState() {
        return null;
    }
    
    private final void loadTodoLists() {
    }
    
    public final void addTodoList(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String color) {
    }
    
    public final void deleteTodoList(@org.jetbrains.annotations.NotNull()
    com.focusflow.app.domain.model.TodoList todoList) {
    }
}