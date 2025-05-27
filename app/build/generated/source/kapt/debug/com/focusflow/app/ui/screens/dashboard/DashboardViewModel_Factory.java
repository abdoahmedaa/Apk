package com.focusflow.app.ui.screens.dashboard;

import com.focusflow.app.data.repository.HabitRepository;
import com.focusflow.app.data.repository.TaskRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class DashboardViewModel_Factory implements Factory<DashboardViewModel> {
  private final Provider<TaskRepository> taskRepositoryProvider;

  private final Provider<HabitRepository> habitRepositoryProvider;

  public DashboardViewModel_Factory(Provider<TaskRepository> taskRepositoryProvider,
      Provider<HabitRepository> habitRepositoryProvider) {
    this.taskRepositoryProvider = taskRepositoryProvider;
    this.habitRepositoryProvider = habitRepositoryProvider;
  }

  @Override
  public DashboardViewModel get() {
    return newInstance(taskRepositoryProvider.get(), habitRepositoryProvider.get());
  }

  public static DashboardViewModel_Factory create(Provider<TaskRepository> taskRepositoryProvider,
      Provider<HabitRepository> habitRepositoryProvider) {
    return new DashboardViewModel_Factory(taskRepositoryProvider, habitRepositoryProvider);
  }

  public static DashboardViewModel newInstance(TaskRepository taskRepository,
      HabitRepository habitRepository) {
    return new DashboardViewModel(taskRepository, habitRepository);
  }
}
