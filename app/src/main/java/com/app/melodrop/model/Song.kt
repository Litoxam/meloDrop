package com.app.melodrop.model

data class Song(
    val id: String,
    val isrc: String?,
    val title: String,
    val artist: String,
    val genre: String,
    val coverUrl: String,
    val reportCount: Int = 0
)