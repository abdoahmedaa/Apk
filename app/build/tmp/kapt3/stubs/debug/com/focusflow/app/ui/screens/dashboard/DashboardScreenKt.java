package com.focusflow.app.ui.screens.dashboard;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0007\u001a\u0012\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0007\u001a \u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0007\u001aF\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u0015H\u0007\u001aL\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u001d\u0010\u001e\u001a(\u0010\u001f\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0007\u001a.\u0010 \u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0015H\u0007\u001aD\u0010#\u001a\u00020\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\b$\u0010%\u0082\u0002\u0007\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006&"}, d2 = {"DashboardHeader", "", "DashboardScreen", "viewModel", "Lcom/focusflow/app/ui/screens/dashboard/DashboardViewModel;", "EmptyStateCard", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "title", "", "subtitle", "EnhancedAnalyticsSection", "totalTasks", "", "completedTasks", "totalHabits", "completedHabitsToday", "productivityScore", "", "weeklyProgress", "onAnalyticsClick", "Lkotlin/Function0;", "EnhancedStatCard", "modifier", "Landroidx/compose/ui/Modifier;", "value", "progress", "color", "Landroidx/compose/ui/graphics/Color;", "EnhancedStatCard-hftG7rw", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FJLandroidx/compose/ui/graphics/vector/ImageVector;)V", "QuickStatsSection", "SectionHeader", "actionText", "onActionClick", "StatCard", "StatCard-jzV_Hc0", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLandroidx/compose/ui/graphics/vector/ImageVector;)V", "app_debug"})
public final class DashboardScreenKt {
    
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @androidx.compose.runtime.Composable()
    public static final void DashboardScreen(@org.jetbrains.annotations.NotNull()
    com.focusflow.app.ui.screens.dashboard.DashboardViewModel viewModel) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void DashboardHeader() {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void QuickStatsSection(int totalTasks, int completedTasks, int totalHabits, int completedHabitsToday) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void SectionHeader(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String actionText, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> onActionClick) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void EnhancedAnalyticsSection(int totalTasks, int completedTasks, int totalHabits, int completedHabitsToday, float productivityScore, float weeklyProgress, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onAnalyticsClick) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void EmptyStateCard(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.graphics.vector.ImageVector icon, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String subtitle) {
    }
}