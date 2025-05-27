package com.focusflow.app.backup;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\nH\u00c6\u0003J\t\u0010\u001a\u001a\u00020\fH\u00c6\u0003JM\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\t\u0010!\u001a\u00020\fH\u00d6\u0001R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006\""}, d2 = {"Lcom/focusflow/app/backup/BackupData;", "", "tasks", "", "Lcom/focusflow/app/domain/model/Task;", "todoLists", "Lcom/focusflow/app/domain/model/TodoList;", "habits", "Lcom/focusflow/app/domain/model/Habit;", "exportDate", "Ljava/util/Date;", "version", "", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/lang/String;)V", "getExportDate", "()Ljava/util/Date;", "getHabits", "()Ljava/util/List;", "getTasks", "getTodoLists", "getVersion", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class BackupData {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.focusflow.app.domain.model.Task> tasks = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.focusflow.app.domain.model.TodoList> todoLists = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.focusflow.app.domain.model.Habit> habits = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Date exportDate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String version = null;
    
    public BackupData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.focusflow.app.domain.model.Task> tasks, @org.jetbrains.annotations.NotNull()
    java.util.List<com.focusflow.app.domain.model.TodoList> todoLists, @org.jetbrains.annotations.NotNull()
    java.util.List<com.focusflow.app.domain.model.Habit> habits, @org.jetbrains.annotations.NotNull()
    java.util.Date exportDate, @org.jetbrains.annotations.NotNull()
    java.lang.String version) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.focusflow.app.domain.model.Task> getTasks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.focusflow.app.domain.model.TodoList> getTodoLists() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.focusflow.app.domain.model.Habit> getHabits() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getExportDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVersion() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.focusflow.app.domain.model.Task> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.focusflow.app.domain.model.TodoList> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.focusflow.app.domain.model.Habit> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.focusflow.app.backup.BackupData copy(@org.jetbrains.annotations.NotNull()
    java.util.List<com.focusflow.app.domain.model.Task> tasks, @org.jetbrains.annotations.NotNull()
    java.util.List<com.focusflow.app.domain.model.TodoList> todoLists, @org.jetbrains.annotations.NotNull()
    java.util.List<com.focusflow.app.domain.model.Habit> habits, @org.jetbrains.annotations.NotNull()
    java.util.Date exportDate, @org.jetbrains.annotations.NotNull()
    java.lang.String version) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}