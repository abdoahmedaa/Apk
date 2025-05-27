package com.focusflow.app.ui.screens.dashboard;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\u000fH\u0002J\u0006\u0010\u0016\u001a\u00020\u000fJ\u000e\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0019"}, d2 = {"Lcom/focusflow/app/ui/screens/dashboard/DashboardViewModel;", "Landroidx/lifecycle/ViewModel;", "taskRepository", "Lcom/focusflow/app/data/repository/TaskRepository;", "habitRepository", "Lcom/focusflow/app/data/repository/HabitRepository;", "(Lcom/focusflow/app/data/repository/TaskRepository;Lcom/focusflow/app/data/repository/HabitRepository;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/focusflow/app/ui/screens/dashboard/DashboardUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "deleteHabit", "", "habit", "Lcom/focusflow/app/domain/model/Habit;", "deleteTask", "task", "Lcom/focusflow/app/domain/model/Task;", "loadDashboardData", "refreshData", "toggleHabitCompletion", "toggleTaskCompletion", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class DashboardViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.focusflow.app.data.repository.TaskRepository taskRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.focusflow.app.data.repository.HabitRepository habitRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.focusflow.app.ui.screens.dashboard.DashboardUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.focusflow.app.ui.screens.dashboard.DashboardUiState> uiState = null;
    
    @javax.inject.Inject()
    public DashboardViewModel(@org.jetbrains.annotations.NotNull()
    com.focusflow.app.data.repository.TaskRepository taskRepository, @org.jetbrains.annotations.NotNull()
    com.focusflow.app.data.repository.HabitRepository habitRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.focusflow.app.ui.screens.dashboard.DashboardUiState> getUiState() {
        return null;
    }
    
    private final void loadDashboardData() {
    }
    
    public final void toggleTaskCompletion(@org.jetbrains.annotations.NotNull()
    com.focusflow.app.domain.model.Task task) {
    }
    
    public final void deleteTask(@org.jetbrains.annotations.NotNull()
    com.focusflow.app.domain.model.Task task) {
    }
    
    public final void toggleHabitCompletion(@org.jetbrains.annotations.NotNull()
    com.focusflow.app.domain.model.Habit habit) {
    }
    
    public final void deleteHabit(@org.jetbrains.annotations.NotNull()
    com.focusflow.app.domain.model.Habit habit) {
    }
    
    public final void refreshData() {
    }
}