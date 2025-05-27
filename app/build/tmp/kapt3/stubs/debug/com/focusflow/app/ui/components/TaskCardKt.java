package com.focusflow.app.ui.components;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0018\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u001a\u0010\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000bH\u0007\u001aD\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007\u001a\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u00a8\u0006\u0015"}, d2 = {"CategoryChip", "", "category", "", "DueDateChip", "dueDate", "Ljava/util/Date;", "isOverdue", "", "PriorityChip", "priority", "Lcom/focusflow/app/data/database/entities/Priority;", "TaskCard", "task", "Lcom/focusflow/app/domain/model/Task;", "onToggleCompletion", "Lkotlin/Function0;", "onDelete", "onClick", "modifier", "Landroidx/compose/ui/Modifier;", "app_debug"})
public final class TaskCardKt {
    
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @androidx.compose.runtime.Composable()
    public static final void TaskCard(@org.jetbrains.annotations.NotNull()
    com.focusflow.app.domain.model.Task task, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onToggleCompletion, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onDelete, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void PriorityChip(@org.jetbrains.annotations.NotNull()
    com.focusflow.app.data.database.entities.Priority priority) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void DueDateChip(@org.jetbrains.annotations.NotNull()
    java.util.Date dueDate, boolean isOverdue) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void CategoryChip(@org.jetbrains.annotations.NotNull()
    java.lang.String category) {
    }
    
    private static final boolean isOverdue(java.util.Date dueDate) {
        return false;
    }
}