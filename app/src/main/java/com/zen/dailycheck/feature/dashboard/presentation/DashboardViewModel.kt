package com.zen.dailycheck.feature.dashboard.presentation

import com.zen.dailycheck.ui.BaseViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class DashboardViewModel : BaseViewModel<DashboardUiState, DashboardUiEvent, DashboardUiEffect>(
    initialState = DashboardUiState()
) {

    override fun onEvent(event: DashboardUiEvent) {
        when (event) {
            DashboardUiEvent.Refresh -> fetchDashboardData()
            DashboardUiEvent.AddGoalClicked -> sendEffect(DashboardUiEffect.NavigateToCreateGoal)
        }
    }

    private fun fetchDashboardData() {
        updateState { it.copy(isLoading = true) }
        // Fetch data...
        updateState { it.copy(isLoading = false, goals = listOf("Goal 1")) }
    }
}