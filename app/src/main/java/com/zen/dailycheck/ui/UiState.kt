package com.zen.dailycheck.ui

// Marker interface representing the UI state of a screen.
interface UiState

@Composable
fun DashboardScreen(viewModel: DashboardViewModel = viewModel()) {
    // 1. Collect UI State (Re-triggers recomposition when state changes)
    val state by viewModel.uiState.collectAsStateWithLifecycle()

    // 2. Collect Side Effects (Handles one-time actions sequentially)
    LaunchedEffect(Unit) {
        viewModel.effect.collect { effect ->
            when (effect) {
                is DashboardUiEffect.NavigateToCreateGoal -> {
                    // Navigate to next screen here
                }
                is DashboardUiEffect.ShowToast -> {
                    // Show a snackbar or toast
                }
            }
        }
    }

    // 3. Render the UI and pipe actions through onEvent
    DashboardContent(
        state = state,
        onRefresh = { viewModel.onEvent(DashboardUiEvent.Refresh) },
        onAddGoal = { viewModel.onEvent(DashboardUiEvent.AddGoalClicked) }
    )
}