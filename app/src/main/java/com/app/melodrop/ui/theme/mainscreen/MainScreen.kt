import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import com.app.melodrop.ui.theme.mainscreen.menu.DiscoverScreen
import com.app.melodrop.ui.theme.mainscreen.menu.DropScreen
import com.app.melodrop.ui.theme.mainscreen.menu.Label
import com.app.melodrop.ui.theme.mainscreen.menu.ProfileScreen

@Composable
fun MainScreen() {
    // 1. État pour suivre l'onglet sélectionné (par défaut DISCOVER)
    var selectedTab by rememberSaveable { mutableStateOf(Label.DISCOVER) }

    Scaffold(
        bottomBar = {
            NavigationBar {
                // On boucle sur tous les cas de votre enum class
                Label.entries.forEach { tab ->
                    NavigationBarItem(
                        selected = selectedTab == tab,
                        onClick = { selectedTab = tab },
                        icon = {
                            // Remplacez par les icônes souhaitées pour chaque onglet
                            val icon = when (tab) {
                                Label.DISCOVER -> Icons.Default.Search
                                Label.DROP -> Icons.Default.AddCircle
                                Label.PROFILE -> Icons.Default.Person
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
                Label.DISCOVER -> DiscoverScreen()
                Label.DROP -> DropScreen()
                Label.PROFILE -> ProfileScreen()
            }
        }
    }
}