package com.zen.dailycheck.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.NavHostController

@Composable
fun AppRoot() {

    val navController = rememberNavController()

    val currentRoute =
        navController.currentBackStackEntryAsState()
            .value
            ?.destination
            ?.route

    Scaffold(
        bottomBar = {
            BottomNavigationBar(
                navController = navController,
                currentRoute = currentRoute
            )
        }
    ) { paddingValues ->
        AppNavHost(
            navController = navController,
            Modifier.padding(paddingValues)
        )

    }

}

@Composable
fun AppNavHost(
    navController : NavHostController,
    modifier: Modifier = Modifier
) {

}