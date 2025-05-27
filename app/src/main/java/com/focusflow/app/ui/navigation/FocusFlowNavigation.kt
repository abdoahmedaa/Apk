package com.focusflow.app.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.focusflow.app.ui.screens.dashboard.DashboardScreen
import com.focusflow.app.ui.screens.tasks.TasksScreen
import com.focusflow.app.ui.screens.todos.TodosScreen
import com.focusflow.app.ui.screens.habits.HabitsScreen
import com.focusflow.app.ui.screens.settings.SettingsScreen

@Composable
fun FocusFlowNavigation(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Dashboard.route,
        modifier = modifier
    ) {
        composable(Screen.Dashboard.route) {
            DashboardScreen()
        }
        composable(Screen.Tasks.route) {
            TasksScreen()
        }
        composable(Screen.Todos.route) {
            TodosScreen()
        }
        composable(Screen.Habits.route) {
            HabitsScreen()
        }
        composable(Screen.Settings.route) {
            SettingsScreen()
        }
    }
}

sealed class Screen(val route: String, val title: String, val icon: String) {
    object Dashboard : Screen("dashboard", "Dashboard", "🏠")
    object Tasks : Screen("tasks", "Tasks", "✓")
    object Todos : Screen("todos", "To-Dos", "📝")
    object Habits : Screen("habits", "Habits", "🎯")
    object Settings : Screen("settings", "Settings", "⚙️")
}
