package com.focusflow.app.ui.screens.settings;

import android.content.Context;
import com.focusflow.app.backup.BackupManager;
import com.focusflow.app.data.repository.HabitRepository;
import com.focusflow.app.data.repository.TaskRepository;
import com.focusflow.app.data.repository.TodoRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class SettingsViewModel_Factory implements Factory<SettingsViewModel> {
  private final Provider<Context> contextProvider;

  private final Provider<BackupManager> backupManagerProvider;

  private final Provider<TaskRepository> taskRepositoryProvider;

  private final Provider<TodoRepository> todoRepositoryProvider;

  private final Provider<HabitRepository> habitRepositoryProvider;

  public SettingsViewModel_Factory(Provider<Context> contextProvider,
      Provider<BackupManager> backupManagerProvider,
      Provider<TaskRepository> taskRepositoryProvider,
      Provider<TodoRepository> todoRepositoryProvider,
      Provider<HabitRepository> habitRepositoryProvider) {
    this.contextProvider = contextProvider;
    this.backupManagerProvider = backupManagerProvider;
    this.taskRepositoryProvider = taskRepositoryProvider;
    this.todoRepositoryProvider = todoRepositoryProvider;
    this.habitRepositoryProvider = habitRepositoryProvider;
  }

  @Override
  public SettingsViewModel get() {
    return newInstance(contextProvider.get(), backupManagerProvider.get(), taskRepositoryProvider.get(), todoRepositoryProvider.get(), habitRepositoryProvider.get());
  }

  public static SettingsViewModel_Factory create(Provider<Context> contextProvider,
      Provider<BackupManager> backupManagerProvider,
      Provider<TaskRepository> taskRepositoryProvider,
      Provider<TodoRepository> todoRepositoryProvider,
      Provider<HabitRepository> habitRepositoryProvider) {
    return new SettingsViewModel_Factory(contextProvider, backupManagerProvider, taskRepositoryProvider, todoRepositoryProvider, habitRepositoryProvider);
  }

  public static SettingsViewModel newInstance(Context context, BackupManager backupManager,
      TaskRepository taskRepository, TodoRepository todoRepository,
      HabitRepository habitRepository) {
    return new SettingsViewModel(context, backupManager, taskRepository, todoRepository, habitRepository);
  }
}
