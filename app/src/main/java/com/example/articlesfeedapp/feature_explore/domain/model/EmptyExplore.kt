package com.example.articlesfeedapp.feature_explore.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class EmptyExplore(
    @PrimaryKey(autoGenerate = true)
    val _id: Int = 0
)