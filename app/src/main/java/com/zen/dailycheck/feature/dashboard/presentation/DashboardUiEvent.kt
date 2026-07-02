package com.zen.dailycheck.feature.dashboard.presentation

sealed interface DashboardUiEvent {

    data object Refresh : DashboardUiEvent

    data object AddGoalClicked : DashboardUiEvent

}