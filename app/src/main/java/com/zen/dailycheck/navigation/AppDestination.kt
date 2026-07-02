package com.zen.dailycheck.navigation

sealed class AppDestination(
    val route: String
) {
    data object Dashboard : AppDestination("dashboard")
    data object Goals : AppDestination("goals")
    data object Activities : AppDestination("activities")
    data object History : AppDestination("history")
    data object Settings : AppDestination("settings")
}