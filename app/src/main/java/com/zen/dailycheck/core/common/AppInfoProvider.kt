package com.zen.dailycheck

import javax.inject.Inject

class AppInfoProvider @Inject constructor() {
    fun appName(): String {
        return "Daily Check"
    }
}