package com.focusflow.app.domain.analytics;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u0013\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u0013\u00a2\u0006\u0002\u0010\u0015J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eH\u00c6\u0003J\u0015\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u0013H\u00c6\u0003J\u0015\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u0013H\u00c6\u0003J\t\u0010,\u001a\u00020\u0005H\u00c6\u0003J\t\u0010-\u001a\u00020\u0005H\u00c6\u0003J\t\u0010.\u001a\u00020\bH\u00c6\u0003J\t\u0010/\u001a\u00020\nH\u00c6\u0003J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u00c6\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eH\u00c6\u0003J\u00ab\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u00132\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u0013H\u00c6\u0001J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00108\u001a\u00020\u0005H\u00d6\u0001J\t\u00109\u001a\u00020\u0003H\u00d6\u0001R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001b\u00a8\u0006:"}, d2 = {"Lcom/focusflow/app/domain/analytics/MonthlyReport;", "", "monthYear", "", "tasksCompleted", "", "habitsCompleted", "totalTimeSpent", "", "averageProductivityScore", "", "bestWeek", "worstWeek", "achievements", "", "Lcom/focusflow/app/domain/analytics/Achievement;", "insights", "nextMonthGoals", "categoryBreakdown", "", "habitSuccessRate", "(Ljava/lang/String;IIJFLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)V", "getAchievements", "()Ljava/util/List;", "getAverageProductivityScore", "()F", "getBestWeek", "()Ljava/lang/String;", "getCategoryBreakdown", "()Ljava/util/Map;", "getHabitSuccessRate", "getHabitsCompleted", "()I", "getInsights", "getMonthYear", "getNextMonthGoals", "getTasksCompleted", "getTotalTimeSpent", "()J", "getWorstWeek", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class MonthlyReport {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String monthYear = null;
    private final int tasksCompleted = 0;
    private final int habitsCompleted = 0;
    private final long totalTimeSpent = 0L;
    private final float averageProductivityScore = 0.0F;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String bestWeek = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String worstWeek = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.focusflow.app.domain.analytics.Achievement> achievements = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> insights = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> nextMonthGoals = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.String, java.lang.Float> categoryBreakdown = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.String, java.lang.Float> habitSuccessRate = null;
    
    public MonthlyReport(@org.jetbrains.annotations.NotNull()
    java.lang.String monthYear, int tasksCompleted, int habitsCompleted, long totalTimeSpent, float averageProductivityScore, @org.jetbrains.annotations.NotNull()
    java.lang.String bestWeek, @org.jetbrains.annotations.NotNull()
    java.lang.String worstWeek, @org.jetbrains.annotations.NotNull()
    java.util.List<com.focusflow.app.domain.analytics.Achievement> achievements, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> insights, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> nextMonthGoals, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.Float> categoryBreakdown, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.Float> habitSuccessRate) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMonthYear() {
        return null;
    }
    
    public final int getTasksCompleted() {
        return 0;
    }
    
    public final int getHabitsCompleted() {
        return 0;
    }
    
    public final long getTotalTimeSpent() {
        return 0L;
    }
    
    public final float getAverageProductivityScore() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBestWeek() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWorstWeek() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.focusflow.app.domain.analytics.Achievement> getAchievements() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getInsights() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getNextMonthGoals() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.Float> getCategoryBreakdown() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.Float> getHabitSuccessRate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.Float> component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.Float> component12() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final long component4() {
        return 0L;
    }
    
    public final float component5() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.focusflow.app.domain.analytics.Achievement> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.focusflow.app.domain.analytics.MonthlyReport copy(@org.jetbrains.annotations.NotNull()
    java.lang.String monthYear, int tasksCompleted, int habitsCompleted, long totalTimeSpent, float averageProductivityScore, @org.jetbrains.annotations.NotNull()
    java.lang.String bestWeek, @org.jetbrains.annotations.NotNull()
    java.lang.String worstWeek, @org.jetbrains.annotations.NotNull()
    java.util.List<com.focusflow.app.domain.analytics.Achievement> achievements, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> insights, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> nextMonthGoals, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.Float> categoryBreakdown, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.Float> habitSuccessRate) {
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