package com.focusflow.app.ui.screens.settings;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0017\u001a\u00020\u0015J\u0006\u0010\u0018\u001a\u00020\u0015J\u0006\u0010\u0019\u001a\u00020\u0015J\u0006\u0010\u001a\u001a\u00020\u0015J\u0006\u0010\u001b\u001a\u00020\u0015J\u0006\u0010\u001c\u001a\u00020\u0015J\u0006\u0010\u001d\u001a\u00020\u0015R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001e"}, d2 = {"Lcom/focusflow/app/ui/screens/settings/SettingsViewModel;", "Landroidx/lifecycle/ViewModel;", "context", "Landroid/content/Context;", "backupManager", "Lcom/focusflow/app/backup/BackupManager;", "taskRepository", "Lcom/focusflow/app/data/repository/TaskRepository;", "todoRepository", "Lcom/focusflow/app/data/repository/TodoRepository;", "habitRepository", "Lcom/focusflow/app/data/repository/HabitRepository;", "(Landroid/content/Context;Lcom/focusflow/app/backup/BackupManager;Lcom/focusflow/app/data/repository/TaskRepository;Lcom/focusflow/app/data/repository/TodoRepository;Lcom/focusflow/app/data/repository/HabitRepository;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/focusflow/app/ui/screens/settings/SettingsUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "clearAllData", "", "clearMessage", "exportData", "hideClearDataDialog", "importData", "showClearDataDialog", "toggleDarkMode", "toggleHabitNotifications", "toggleTaskNotifications", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class SettingsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.focusflow.app.backup.BackupManager backupManager = null;
    @org.jetbrains.annotations.NotNull()
    private final com.focusflow.app.data.repository.TaskRepository taskRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.focusflow.app.data.repository.TodoRepository todoRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.focusflow.app.data.repository.HabitRepository habitRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.focusflow.app.ui.screens.settings.SettingsUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.focusflow.app.ui.screens.settings.SettingsUiState> uiState = null;
    
    @javax.inject.Inject()
    public SettingsViewModel(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.focusflow.app.backup.BackupManager backupManager, @org.jetbrains.annotations.NotNull()
    com.focusflow.app.data.repository.TaskRepository taskRepository, @org.jetbrains.annotations.NotNull()
    com.focusflow.app.data.repository.TodoRepository todoRepository, @org.jetbrains.annotations.NotNull()
    com.focusflow.app.data.repository.HabitRepository habitRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.focusflow.app.ui.screens.settings.SettingsUiState> getUiState() {
        return null;
    }
    
    public final void toggleDarkMode() {
    }
    
    public final void toggleTaskNotifications() {
    }
    
    public final void toggleHabitNotifications() {
    }
    
    public final void exportData() {
    }
    
    public final void importData() {
    }
    
    public final void showClearDataDialog() {
    }
    
    public final void hideClearDataDialog() {
    }
    
    public final void clearAllData() {
    }
    
    public final void clearMessage() {
    }
}