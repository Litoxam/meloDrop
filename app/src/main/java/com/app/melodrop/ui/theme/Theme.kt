package com.app.melodrop.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

/*
 * Melodrop n'a qu'une seule apparence : la DA Nuit.
 * Le thème ignore volontairement le mode clair/sombre du téléphone.
 *
 * darkColorScheme() reste utilisé car c'est lui qui fournit des valeurs par défaut
 * adaptées à un fond sombre pour les rôles non redéfinis (les couleurs d'erreur).
 *
 * Chaque rôle "xxx" a son "onXxx" : la couleur du texte ou des icônes posés dessus.
 * Tous les autres rôles sont définis : ceux qu'on oublie retombent
 * sur la palette violette par défaut de Material 3.
 */
private val MelodropColorScheme = darkColorScheme(
    // Actions principales (Button, Switch activé, Slider...)
    primary = Mandarine,
    onPrimary = Encre,                    // texte sombre sur orange, bien plus lisible que du blanc
    primaryContainer = MandarineSombre,   // FloatingActionButton
    onPrimaryContainer = PecheClaire,
    inversePrimary = OrangeBrule,         // bouton d'action d'une Snackbar

    // Éléments secondaires, volontairement neutres pour garder l'orange rare
    secondary = NuitGrisClair,
    onSecondary = NuitSurfaceHigh,
    secondaryContainer = NuitSurfaceHighest,  // indicateur de la NavigationBar, FilterChip sélectionné
    onSecondaryContainer = NuitTexte,

    // Accent doux (tags de genre, badges...)
    tertiary = MandarinePale,
    onTertiary = BrunOrange,
    tertiaryContainer = MandarineSombre,
    onTertiaryContainer = PecheClaire,

    // Fonds et textes
    background = Encre,
    onBackground = NuitTexte,
    surface = Encre,                      // écrans, TopAppBar
    onSurface = NuitTexte,
    surfaceVariant = NuitSurfaceHigh,
    onSurfaceVariant = NuitTexteSecondaire,
    surfaceTint = NuitTexteSecondaire,    // évite que les surfaces surélevées virent à l'orange
    inverseSurface = NuitTexte,           // fond des Snackbar
    inverseOnSurface = NuitSurfaceHigh,

    // Contours
    outline = NuitContour,                // OutlinedTextField
    outlineVariant = NuitSeparateur,      // HorizontalDivider

    // Échelle des surfaces
    surfaceDim = Encre,
    surfaceBright = NuitSurfaceBright,
    surfaceContainerLowest = NuitSurfaceLowest,
    surfaceContainerLow = NuitSurfaceLow,          // ModalBottomSheet, ElevatedCard
    surfaceContainer = NuitSurfaceContainer,       // NavigationBar
    surfaceContainerHigh = NuitSurfaceHigh,        // AlertDialog
    surfaceContainerHighest = NuitSurfaceHighest   // Card, TextField rempli
)

@Composable
fun meloDropTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = MelodropColorScheme,
        typography = Typography,
        content = content
    )
}