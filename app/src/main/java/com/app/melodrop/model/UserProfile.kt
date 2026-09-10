package com.app.melodrop.model

data class UserProfile(
    val user: User,
    val songsSharedCount: Int,
    val songsAddedCount: Int
)