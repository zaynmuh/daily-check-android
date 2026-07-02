package com.zen.dailycheck

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.zen.dailycheck.navigation.AppRoot
import com.zen.dailycheck.core.designsystem.theme.DailyCheckTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import android.util.Log

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var appInfoProvider: AppInfoProvider

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        Log.d("DailyCheck", appInfoProvider.appName())

        setContent {
            DailyCheckTheme {
                AppRoot()
            }
        }
    }
}