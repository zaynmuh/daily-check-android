package com.zen.dailycheck.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.zen.dailycheck.feature.activities.ActivitiesScreen
import com.zen.dailycheck.feature.dashboard.DashboardScreen
import com.zen.dailycheck.feature.goals.GoalsScreen
import com.zen.dailycheck.feature.history.HistoryScreen
import com.zen.dailycheck.feature.settings.SettingsScreen

@Composable
fun AppNavHost(
    navController: NavHostController
) {

    NavHost(
        navController = navController,
        startDestination = AppDestination.Dashboard.route
    ) {

        composable(AppDestination.Dashboard.route) {
            DashboardScreen()
        }

        composable(AppDestination.Goals.route) {
            GoalsScreen()
        }

        composable(AppDestination.Activities.route) {
            ActivitiesScreen()
        }

        composable(AppDestination.History.route) {
            HistoryScreen()
        }

        composable(AppDestination.Settings.route) {
            SettingsScreen()
        }

    }
}