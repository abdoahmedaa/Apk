package com.focusflow.app.ui.screens.dashboard;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b,\b\u0086\b\u0018\u00002\u00020\u0001B\u00bb\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0006\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0002\u0010\u0019J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\t\u0010/\u001a\u00020\u0010H\u00c6\u0003J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\t\u00101\u001a\u00020\u0014H\u00c6\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00160\u0006H\u00c6\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003J\t\u00105\u001a\u00020\u0003H\u00c6\u0003J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J\u000f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\t\u00109\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010:\u001a\b\u0012\u0004\u0012\u00020\f0\u0006H\u00c6\u0003J\t\u0010;\u001a\u00020\u000eH\u00c6\u0003J\t\u0010<\u001a\u00020\u0010H\u00c6\u0003J\u00bf\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00062\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0016H\u00c6\u0001J\u0013\u0010>\u001a\u00020\u000e2\b\u0010?\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010@\u001a\u00020\u0003H\u00d6\u0001J\t\u0010A\u001a\u00020\u0016H\u00d6\u0001R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010!R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001bR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001bR\u0011\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010$\u00a8\u0006B"}, d2 = {"Lcom/focusflow/app/ui/screens/dashboard/DashboardUiState;", "", "totalTasks", "", "completedTasks", "todaysTasks", "", "Lcom/focusflow/app/domain/model/Task;", "overdueTasks", "totalHabits", "completedHabitsToday", "todaysHabits", "Lcom/focusflow/app/domain/model/Habit;", "isLoading", "", "productivityScore", "", "weeklyProgress", "streakCount", "timeSpentToday", "", "achievements", "", "upcomingDeadlines", "error", "(IILjava/util/List;Ljava/util/List;IILjava/util/List;ZFFIJLjava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getAchievements", "()Ljava/util/List;", "getCompletedHabitsToday", "()I", "getCompletedTasks", "getError", "()Ljava/lang/String;", "()Z", "getOverdueTasks", "getProductivityScore", "()F", "getStreakCount", "getTimeSpentToday", "()J", "getTodaysHabits", "getTodaysTasks", "getTotalHabits", "getTotalTasks", "getUpcomingDeadlines", "getWeeklyProgress", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
public final class DashboardUiState {
    private final int totalTasks = 0;
    private final int completedTasks = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.focusflow.app.domain.model.Task> todaysTasks = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.focusflow.app.domain.model.Task> overdueTasks = null;
    private final int totalHabits = 0;
    private final int completedHabitsToday = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.focusflow.app.domain.model.Habit> todaysHabits = null;
    private final boolean isLoading = false;
    private final float productivityScore = 0.0F;
    private final float weeklyProgress = 0.0F;
    private final int streakCount = 0;
    private final long timeSpentToday = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> achievements = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.focusflow.app.domain.model.Task> upcomingDeadlines = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String error = null;
    
    public DashboardUiState(int totalTasks, int completedTasks, @org.jetbrains.annotations.NotNull()
    java.util.List<com.focusflow.app.domain.model.Task> todaysTasks, @org.jetbrains.annotations.NotNull()
    java.util.List<com.focusflow.app.domain.model.Task> overdueTasks, int totalHabits, int completedHabitsToday, @org.jetbrains.annotations.NotNull()
    java.util.List<com.focusflow.app.domain.model.Habit> todaysHabits, boolean isLoading, float productivityScore, float weeklyProgress, int streakCount, long timeSpentToday, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> achievements, @org.jetbrains.annotations.NotNull()
    java.util.List<com.focusflow.app.domain.model.Task> upcomingDeadlines, @org.jetbrains.annotations.Nullable()
    java.lang.String error) {
        super();
    }
    
    public final int getTotalTasks() {
        return 0;
    }
    
    public final int getCompletedTasks() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.focusflow.app.domain.model.Task> getTodaysTasks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.focusflow.app.domain.model.Task> getOverdueTasks() {
        return null;
    }
    
    public final int getTotalHabits() {
        return 0;
    }
    
    public final int getCompletedHabitsToday() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.focusflow.app.domain.model.Habit> getTodaysHabits() {
        return null;
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    public final float getProductivityScore() {
        return 0.0F;
    }
    
    public final float getWeeklyProgress() {
        return 0.0F;
    }
    
    public final int getStreakCount() {
        return 0;
    }
    
    public final long getTimeSpentToday() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getAchievements() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.focusflow.app.domain.model.Task> getUpcomingDeadlines() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getError() {
        return null;
    }
    
    public DashboardUiState() {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final float component10() {
        return 0.0F;
    }
    
    public final int component11() {
        return 0;
    }
    
    public final long component12() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.focusflow.app.domain.model.Task> component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component15() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.focusflow.app.domain.model.Task> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.focusflow.app.domain.model.Task> component4() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int component6() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.focusflow.app.domain.model.Habit> component7() {
        return null;
    }
    
    public final boolean component8() {
        return false;
    }
    
    public final float component9() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.focusflow.app.ui.screens.dashboard.DashboardUiState copy(int totalTasks, int completedTasks, @org.jetbrains.annotations.NotNull()
    java.util.List<com.focusflow.app.domain.model.Task> todaysTasks, @org.jetbrains.annotations.NotNull()
    java.util.List<com.focusflow.app.domain.model.Task> overdueTasks, int totalHabits, int completedHabitsToday, @org.jetbrains.annotations.NotNull()
    java.util.List<com.focusflow.app.domain.model.Habit> todaysHabits, boolean isLoading, float productivityScore, float weeklyProgress, int streakCount, long timeSpentToday, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> achievements, @org.jetbrains.annotations.NotNull()
    java.util.List<com.focusflow.app.domain.model.Task> upcomingDeadlines, @org.jetbrains.annotations.Nullable()
    java.lang.String error) {
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