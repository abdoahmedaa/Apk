package com.focusflow.app.ui.screens.todos;

import com.focusflow.app.data.repository.TodoRepository;
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
public final class TodosViewModel_Factory implements Factory<TodosViewModel> {
  private final Provider<TodoRepository> todoRepositoryProvider;

  public TodosViewModel_Factory(Provider<TodoRepository> todoRepositoryProvider) {
    this.todoRepositoryProvider = todoRepositoryProvider;
  }

  @Override
  public TodosViewModel get() {
    return newInstance(todoRepositoryProvider.get());
  }

  public static TodosViewModel_Factory create(Provider<TodoRepository> todoRepositoryProvider) {
    return new TodosViewModel_Factory(todoRepositoryProvider);
  }

  public static TodosViewModel newInstance(TodoRepository todoRepository) {
    return new TodosViewModel(todoRepository);
  }
}
