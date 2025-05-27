package com.focusflow.app.domain.analytics;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\r\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\r\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\r\u00a2\u0006\u0002\u0010\u0014J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00100\rH\u00c6\u0003J\u000f\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00100\rH\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0006H\u00c6\u0003J\t\u0010*\u001a\u00020\u0006H\u00c6\u0003J\t\u0010+\u001a\u00020\tH\u00c6\u0003J\t\u0010,\u001a\u00020\u000bH\u00c6\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u00c6\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00100\rH\u00c6\u0003J\u000f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00100\rH\u00c6\u0003J\u0095\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\r2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\r2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\r2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\rH\u00c6\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00104\u001a\u00020\u0006H\u00d6\u0001J\t\u00105\u001a\u00020\u0010H\u00d6\u0001R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010#\u00a8\u00066"}, d2 = {"Lcom/focusflow/app/domain/analytics/WeeklyReport;", "", "weekStartDate", "Ljava/util/Date;", "weekEndDate", "tasksCompleted", "", "habitsCompleted", "totalTimeSpent", "", "productivityScore", "", "achievements", "", "Lcom/focusflow/app/domain/analytics/Achievement;", "improvements", "", "nextWeekGoals", "topCategories", "streakMilestones", "(Ljava/util/Date;Ljava/util/Date;IIJFLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getAchievements", "()Ljava/util/List;", "getHabitsCompleted", "()I", "getImprovements", "getNextWeekGoals", "getProductivityScore", "()F", "getStreakMilestones", "getTasksCompleted", "getTopCategories", "getTotalTimeSpent", "()J", "getWeekEndDate", "()Ljava/util/Date;", "getWeekStartDate", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class WeeklyReport {
    @org.jetbrains.annotations.NotNull()
    private final java.util.Date weekStartDate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Date weekEndDate = null;
    private final int tasksCompleted = 0;
    private final int habitsCompleted = 0;
    private final long totalTimeSpent = 0L;
    private final float productivityScore = 0.0F;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.focusflow.app.domain.analytics.Achievement> achievements = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> improvements = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> nextWeekGoals = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> topCategories = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> streakMilestones = null;
    
    public WeeklyReport(@org.jetbrains.annotations.NotNull()
    java.util.Date weekStartDate, @org.jetbrains.annotations.NotNull()
    java.util.Date weekEndDate, int tasksCompleted, int habitsCompleted, long totalTimeSpent, float productivityScore, @org.jetbrains.annotations.NotNull()
    java.util.List<com.focusflow.app.domain.analytics.Achievement> achievements, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> improvements, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> nextWeekGoals, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> topCategories, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> streakMilestones) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getWeekStartDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getWeekEndDate() {
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
    
    public final float getProductivityScore() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.focusflow.app.domain.analytics.Achievement> getAchievements() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getImprovements() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getNextWeekGoals() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getTopCategories() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getStreakMilestones() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component2() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final long component5() {
        return 0L;
    }
    
    public final float component6() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.focusflow.app.domain.analytics.Achievement> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.focusflow.app.domain.analytics.WeeklyReport copy(@org.jetbrains.annotations.NotNull()
    java.util.Date weekStartDate, @org.jetbrains.annotations.NotNull()
    java.util.Date weekEndDate, int tasksCompleted, int habitsCompleted, long totalTimeSpent, float productivityScore, @org.jetbrains.annotations.NotNull()
    java.util.List<com.focusflow.app.domain.analytics.Achievement> achievements, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> improvements, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> nextWeekGoals, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> topCategories, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> streakMilestones) {
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