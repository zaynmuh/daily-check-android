package com.zen.dailycheck.core.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.zen.dailycheck.core.database.entity.GoalEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface GoalDao {

    @Query("SELECT * FROM goals")
    fun getGoals(): Flow<List<GoalEntity>>

    @Insert
    suspend fun insert(goal: GoalEntity)

}