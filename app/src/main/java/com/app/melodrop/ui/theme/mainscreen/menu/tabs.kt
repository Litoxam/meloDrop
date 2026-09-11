package com.app.melodrop.ui.theme.mainscreen.menu

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector

enum class Tabs(
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