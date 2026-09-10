package com.app.melodrop.ui.theme.mainscreen.menu

import android.view.Surface
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.app.melodrop.ui.theme.Unbounded
import com.app.melodrop.ui.theme.meloDropTheme


@Composable
fun ProfileScreen(name: String, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Surface(color = MaterialTheme.colorScheme.primary) {
            Text(
                text = "${Label.PROFILE} $name!",
                fontFamily = Unbounded,
                color = MaterialTheme.colorScheme.onPrimary
            )


        }

    }
}


@Preview(
    showBackground = false,
    showSystemUi = true,
    device = Devices.PIXEL_7
)
@Composable
fun ProfilePreview(){
    meloDropTheme {
        ProfileScreen("Maxime")
    }
}