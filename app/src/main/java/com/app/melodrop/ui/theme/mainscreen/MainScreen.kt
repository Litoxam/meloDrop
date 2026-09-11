package com.app.melodrop.ui.theme.mainscreen

import android.R
import androidx.annotation.ContentView
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.app.melodrop.ui.theme.mainscreen.menu.DiscoverScreen
import com.app.melodrop.ui.theme.mainscreen.menu.DropScreen
import com.app.melodrop.ui.theme.mainscreen.menu.Tabs
import com.app.melodrop.ui.theme.mainscreen.menu.ProfileScreen
import com.app.melodrop.ui.theme.meloDropTheme

@Composable
fun MainScreen(hasLinkedAccount: Boolean) {
    // 1. État pour suivre l'onglet sélectionné (par défaut DISCOVER)
    var selectedTab by rememberSaveable { mutableStateOf(Tabs.DISCOVER) }

    Scaffold(
        bottomBar = {
            NavigationBar {
                // On boucle sur tous les cas de votre enum class
                Tabs.entries.forEach { tab ->
                    NavigationBarItem(
                        selected = selectedTab == tab,
                        onClick = { selectedTab = tab },
                        icon = {
                            // Remplacez par les icônes souhaitées pour chaque onglet
                            val icon = when (tab) {
                                Tabs.DISCOVER -> Icons.Default.Search
                                Tabs.DROP -> Icons.Default.AddCircle
                                Tabs.PROFILE -> Icons.Default.Person
                            }
                            Icon(icon, contentDescription = tab.name)
                        },
                        label = { Text(tab.name) }
                    )
                }
            }
        }
    ) { innerPadding ->
        // 2. Zone de contenu qui change selon l'onglet actif
        Box(modifier = Modifier.padding(innerPadding)) {
            when (selectedTab) {
                Tabs.DISCOVER -> DiscoverScreen("Maxime")
                Tabs.DROP -> DropScreen("Maxime")
                Tabs.PROFILE -> ProfileScreen("Maxime")
            }
        }
    }
}

@Preview
@Composable
private fun MainScreenPreview() {
    meloDropTheme {
        MainScreen(hasLinkedAccount = false)
    }
}