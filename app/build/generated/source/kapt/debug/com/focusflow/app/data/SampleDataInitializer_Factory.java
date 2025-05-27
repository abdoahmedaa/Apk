package com.focusflow.app.data;

import com.focusflow.app.data.database.AppDatabase;
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
public final class SampleDataInitializer_Factory implements Factory<SampleDataInitializer> {
  private final Provider<AppDatabase> databaseProvider;

  public SampleDataInitializer_Factory(Provider<AppDatabase> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public SampleDataInitializer get() {
    return newInstance(databaseProvider.get());
  }

  public static SampleDataInitializer_Factory create(Provider<AppDatabase> databaseProvider) {
    return new SampleDataInitializer_Factory(databaseProvider);
  }

  public static SampleDataInitializer newInstance(AppDatabase database) {
    return new SampleDataInitializer(database);
  }
}
