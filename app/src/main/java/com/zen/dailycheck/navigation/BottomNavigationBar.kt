package com.zen.dailycheck.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.CheckCircle
import androidx.compose.material.icons.outlined.Dashboard
import androidx.compose.material.icons.outlined.History
import androidx.compose.material.icons.outlined.List
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun BottomNavigationBar(
    navController: NavHostController,
    currentRoute: String?
) {

    val items = listOf(
        BottomNavItem(
            "Dashboard",
            AppDestination.Dashboard.route,
            Icons.Outlined.Dashboard
        ),
        BottomNavItem(
            "Goals",
            AppDestination.Goals.route,
            Icons.Outlined.List
        ),
        BottomNavItem(
            "Activities",
            AppDestination.Activities.route,
            Icons.Outlined.CheckCircle
        ),
        BottomNavItem(
            "History",
            AppDestination.History.route,
            Icons.Outlined.History
        ),
        BottomNavItem(
            "Settings",
            AppDestination.Settings.route,
            Icons.Outlined.Settings
        )
    )

    NavigationBar {

        items.forEach { item ->

            NavigationBarItem(
                selected = currentRoute == item.route,
                onClick = {
                    navController.navigate(item.route)
                },
                icon = {
                    Icon(
                        imageVector = item.icon,
                        contentDescription = item.title
                    )
                },
                label = {
                    Text(item.title)
                }
            )

        }

    }
}