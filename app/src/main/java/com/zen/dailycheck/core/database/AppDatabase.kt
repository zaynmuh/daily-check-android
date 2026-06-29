package com.zen.dailycheck.core.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.zen.dailycheck.core.database.dao.GoalDao
import com.zen.dailycheck.core.database.entity.GoalEntity

@Database(
    entities = [
        GoalEntity::class
    ],
    version = 1,
    exportSchema = true
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun goalDao(): GoalDao

}