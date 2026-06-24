package com.zen.dailycheck

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.zen.dailycheck.navigation.AppNavHost
import com.zen.dailycheck.core.designsystem.theme.DailyCheckTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DailyCheckTheme {
                AppNavHost()
            }
        }
    }
}