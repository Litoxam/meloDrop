package com.app.melodrop.ui.theme.mainscreen.menu

import androidx.compose.ui.graphics.vector.ImageVector

enum class Label(
    val title: String,
    val icon: ImageVector
) {
    DISCOVER(
        title = "Découvrir",
        icon = Icons.Default.Search
    ),
    DROP(
        title = "Drop",
        icon = Icons.Default.AddCircle
    ),
    PROFILE(
        title = "Profil",
        icon = Icons.Default.Person
    )
}