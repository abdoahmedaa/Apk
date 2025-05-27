package com.focusflow.app.ui.screens.tasks;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J8\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\tJ\u000e\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001bJ,\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001d2\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\tH\u0002J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u0015H\u0002J\b\u0010%\u001a\u00020\u0011H\u0002J\u000e\u0010&\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u0007J\u000e\u0010\'\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\tJ\u000e\u0010(\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001bR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006)"}, d2 = {"Lcom/focusflow/app/ui/screens/tasks/TasksViewModel;", "Landroidx/lifecycle/ViewModel;", "taskRepository", "Lcom/focusflow/app/data/repository/TaskRepository;", "(Lcom/focusflow/app/data/repository/TaskRepository;)V", "_filterType", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/focusflow/app/ui/screens/tasks/TaskFilter;", "_searchQuery", "", "_uiState", "Lcom/focusflow/app/ui/screens/tasks/TasksUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "addTask", "", "title", "description", "dueDate", "Ljava/util/Date;", "priority", "Lcom/focusflow/app/data/database/entities/Priority;", "category", "deleteTask", "task", "Lcom/focusflow/app/domain/model/Task;", "filterTasks", "", "tasks", "filter", "query", "isSameDay", "", "date1", "date2", "loadTasks", "setFilter", "setSearchQuery", "toggleTaskCompletion", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class TasksViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.focusflow.app.data.repository.TaskRepository taskRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.focusflow.app.ui.screens.tasks.TasksUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.focusflow.app.ui.screens.tasks.TasksUiState> uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.focusflow.app.ui.screens.tasks.TaskFilter> _filterType = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _searchQuery = null;
    
    @javax.inject.Inject()
    public TasksViewModel(@org.jetbrains.annotations.NotNull()
    com.focusflow.app.data.repository.TaskRepository taskRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.focusflow.app.ui.screens.tasks.TasksUiState> getUiState() {
        return null;
    }
    
    private final void loadTasks() {
    }
    
    private final java.util.List<com.focusflow.app.domain.model.Task> filterTasks(java.util.List<com.focusflow.app.domain.model.Task> tasks, com.focusflow.app.ui.screens.tasks.TaskFilter filter, java.lang.String query) {
        return null;
    }
    
    public final void setFilter(@org.jetbrains.annotations.NotNull()
    com.focusflow.app.ui.screens.tasks.TaskFilter filter) {
    }
    
    public final void setSearchQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    public final void toggleTaskCompletion(@org.jetbrains.annotations.NotNull()
    com.focusflow.app.domain.model.Task task) {
    }
    
    public final void deleteTask(@org.jetbrains.annotations.NotNull()
    com.focusflow.app.domain.model.Task task) {
    }
    
    public final void addTask(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    java.util.Date dueDate, @org.jetbrains.annotations.NotNull()
    com.focusflow.app.data.database.entities.Priority priority, @org.jetbrains.annotations.NotNull()
    java.lang.String category) {
    }
    
    private final boolean isSameDay(java.util.Date date1, java.util.Date date2) {
        return false;
    }
}