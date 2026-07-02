package com.zen.dailycheck.feature.dashboard.presentation

sealed interface DashboardUiEffect {

    data object NavigateToGoal : DashboardUiEffect

    data class ShowSnackbar(
        val message: String
    ) : DashboardUiEffect

}