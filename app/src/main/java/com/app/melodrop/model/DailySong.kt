package com.app.melodrop.model

data class DailySong(
    val song: Song,
    val postedBy: User,
    val postedAt: String
)