package com.example.articlesfeedapp.di

import android.app.Application
import androidx.room.Room
import com.example.articlesfeedapp.BuildConfig
import com.example.articlesfeedapp.common.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object PersistenceModule {

    @Provides
    @Singleton
    fun provideAppDatabase(
        application: Application
    ): AppDatabase {
        return Room
            .databaseBuilder(application, AppDatabase::class.java, BuildConfig.DATABASE_NAME)
            .fallbackToDestructiveMigration()
            .build()
    }

}