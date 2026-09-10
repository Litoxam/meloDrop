package com.app.melodrop.model

data class User(
    val id: String,
    val username: String,
    val favoriteGenres: List<String>
)