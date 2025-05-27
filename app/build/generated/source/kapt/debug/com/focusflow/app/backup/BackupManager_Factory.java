package com.focusflow.app.backup;

import com.focusflow.app.data.repository.HabitRepository;
import com.focusflow.app.data.repository.TaskRepository;
import com.focusflow.app.data.repository.TodoRepository;
import com.google.gson.Gson;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
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
public final class BackupManager_Factory implements Factory<BackupManager> {
  private final Provider<TaskRepository> taskRepositoryProvider;

  private final Provider<TodoRepository> todoRepositoryProvider;

  private final Provider<HabitRepository> habitRepositoryProvider;

  private final Provider<Gson> gsonProvider;

  public BackupManager_Factory(Provider<TaskRepository> taskRepositoryProvider,
      Provider<TodoRepository> todoRepositoryProvider,
      Provider<HabitRepository> habitRepositoryProvider, Provider<Gson> gsonProvider) {
    this.taskRepositoryProvider = taskRepositoryProvider;
    this.todoRepositoryProvider = todoRepositoryProvider;
    this.habitRepositoryProvider = habitRepositoryProvider;
    this.gsonProvider = gsonProvider;
  }

  @Override
  public BackupManager get() {
    return newInstance(taskRepositoryProvider.get(), todoRepositoryProvider.get(), habitRepositoryProvider.get(), gsonProvider.get());
  }

  public static BackupManager_Factory create(Provider<TaskRepository> taskRepositoryProvider,
      Provider<TodoRepository> todoRepositoryProvider,
      Provider<HabitRepository> habitRepositoryProvider, Provider<Gson> gsonProvider) {
    return new BackupManager_Factory(taskRepositoryProvider, todoRepositoryProvider, habitRepositoryProvider, gsonProvider);
  }

  public static BackupManager newInstance(TaskRepository taskRepository,
      TodoRepository todoRepository, HabitRepository habitRepository, Gson gson) {
    return new BackupManager(taskRepository, todoRepository, habitRepository, gson);
  }
}
