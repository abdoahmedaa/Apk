package com.focusflow.app.ui.navigation;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u000b\f\r\u000e\u000fB\u001f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u0082\u0001\u0005\u0010\u0011\u0012\u0013\u0014\u00a8\u0006\u0015"}, d2 = {"Lcom/focusflow/app/ui/navigation/Screen;", "", "route", "", "title", "icon", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIcon", "()Ljava/lang/String;", "getRoute", "getTitle", "Dashboard", "Habits", "Settings", "Tasks", "Todos", "Lcom/focusflow/app/ui/navigation/Screen$Dashboard;", "Lcom/focusflow/app/ui/navigation/Screen$Habits;", "Lcom/focusflow/app/ui/navigation/Screen$Settings;", "Lcom/focusflow/app/ui/navigation/Screen$Tasks;", "Lcom/focusflow/app/ui/navigation/Screen$Todos;", "app_debug"})
public abstract class Screen {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String route = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String title = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String icon = null;
    
    private Screen(java.lang.String route, java.lang.String title, java.lang.String icon) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRoute() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIcon() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/focusflow/app/ui/navigation/Screen$Dashboard;", "Lcom/focusflow/app/ui/navigation/Screen;", "()V", "app_debug"})
    public static final class Dashboard extends com.focusflow.app.ui.navigation.Screen {
        @org.jetbrains.annotations.NotNull()
        public static final com.focusflow.app.ui.navigation.Screen.Dashboard INSTANCE = null;
        
        private Dashboard() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/focusflow/app/ui/navigation/Screen$Habits;", "Lcom/focusflow/app/ui/navigation/Screen;", "()V", "app_debug"})
    public static final class Habits extends com.focusflow.app.ui.navigation.Screen {
        @org.jetbrains.annotations.NotNull()
        public static final com.focusflow.app.ui.navigation.Screen.Habits INSTANCE = null;
        
        private Habits() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/focusflow/app/ui/navigation/Screen$Settings;", "Lcom/focusflow/app/ui/navigation/Screen;", "()V", "app_debug"})
    public static final class Settings extends com.focusflow.app.ui.navigation.Screen {
        @org.jetbrains.annotations.NotNull()
        public static final com.focusflow.app.ui.navigation.Screen.Settings INSTANCE = null;
        
        private Settings() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/focusflow/app/ui/navigation/Screen$Tasks;", "Lcom/focusflow/app/ui/navigation/Screen;", "()V", "app_debug"})
    public static final class Tasks extends com.focusflow.app.ui.navigation.Screen {
        @org.jetbrains.annotations.NotNull()
        public static final com.focusflow.app.ui.navigation.Screen.Tasks INSTANCE = null;
        
        private Tasks() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/focusflow/app/ui/navigation/Screen$Todos;", "Lcom/focusflow/app/ui/navigation/Screen;", "()V", "app_debug"})
    public static final class Todos extends com.focusflow.app.ui.navigation.Screen {
        @org.jetbrains.annotations.NotNull()
        public static final com.focusflow.app.ui.navigation.Screen.Todos INSTANCE = null;
        
        private Todos() {
        }
    }
}