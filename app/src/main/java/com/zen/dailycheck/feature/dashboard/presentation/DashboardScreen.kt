package com.zen.dailycheck.feature.dashboard

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun DashboardScreen(
    viewModel: DashboardViewModel = androidx.lifecycle.viewmodel.compose.viewModel()
) {

    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    Text(uiState.title)

}