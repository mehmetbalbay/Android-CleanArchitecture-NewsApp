package com.example.articlesfeedapp.common

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.articlesfeedapp.feature_explore.domain.model.EmptyExplore

@Database(
    entities = [EmptyExplore::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {

}