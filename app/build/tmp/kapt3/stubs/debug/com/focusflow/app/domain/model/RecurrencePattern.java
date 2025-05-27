package com.focusflow.app.domain.model;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u00c6\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJV\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010$\u001a\u00020\u0005H\u00d6\u0001J\t\u0010%\u001a\u00020&H\u00d6\u0001R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0016\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006\'"}, d2 = {"Lcom/focusflow/app/domain/model/RecurrencePattern;", "", "type", "Lcom/focusflow/app/domain/model/RecurrenceType;", "interval", "", "daysOfWeek", "", "dayOfMonth", "endDate", "Ljava/util/Date;", "maxOccurrences", "(Lcom/focusflow/app/domain/model/RecurrenceType;ILjava/util/List;Ljava/lang/Integer;Ljava/util/Date;Ljava/lang/Integer;)V", "getDayOfMonth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDaysOfWeek", "()Ljava/util/List;", "getEndDate", "()Ljava/util/Date;", "getInterval", "()I", "getMaxOccurrences", "getType", "()Lcom/focusflow/app/domain/model/RecurrenceType;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lcom/focusflow/app/domain/model/RecurrenceType;ILjava/util/List;Ljava/lang/Integer;Ljava/util/Date;Ljava/lang/Integer;)Lcom/focusflow/app/domain/model/RecurrencePattern;", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
public final class RecurrencePattern {
    @org.jetbrains.annotations.NotNull()
    private final com.focusflow.app.domain.model.RecurrenceType type = null;
    private final int interval = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Integer> daysOfWeek = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer dayOfMonth = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.Date endDate = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer maxOccurrences = null;
    
    public RecurrencePattern(@org.jetbrains.annotations.NotNull()
    com.focusflow.app.domain.model.RecurrenceType type, int interval, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> daysOfWeek, @org.jetbrains.annotations.Nullable()
    java.lang.Integer dayOfMonth, @org.jetbrains.annotations.Nullable()
    java.util.Date endDate, @org.jetbrains.annotations.Nullable()
    java.lang.Integer maxOccurrences) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.focusflow.app.domain.model.RecurrenceType getType() {
        return null;
    }
    
    public final int getInterval() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getDaysOfWeek() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getDayOfMonth() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getEndDate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getMaxOccurrences() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.focusflow.app.domain.model.RecurrenceType component1() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.focusflow.app.domain.model.RecurrencePattern copy(@org.jetbrains.annotations.NotNull()
    com.focusflow.app.domain.model.RecurrenceType type, int interval, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> daysOfWeek, @org.jetbrains.annotations.Nullable()
    java.lang.Integer dayOfMonth, @org.jetbrains.annotations.Nullable()
    java.util.Date endDate, @org.jetbrains.annotations.Nullable()
    java.lang.Integer maxOccurrences) {
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