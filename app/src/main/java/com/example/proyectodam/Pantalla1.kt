package com.example.app.ui.menu

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons

import androidx.compose.material.icons.filled.*
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Pantalla1(
    modifier: Modifier = Modifier,
    onSearchClick: () -> Unit = {},
    onNewProfileClick: () -> Unit = {},
    onManageProfileClick: () -> Unit = {}
) {
    Surface(modifier = modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Menú",
                style = MaterialTheme.typography.headlineMedium
            )

            Spacer(modifier = Modifier.height(32.dp))

            MenuButton(
                text = "Buscar",
                icon = Icons.Filled.Search,
                onClick = onSearchClick
            )

            Spacer(modifier = Modifier.height(16.dp))

            MenuButton(
                text = "Nuevo perfil",
                icon = Icons.Filled.Face,
                onClick = onNewProfileClick
            )

            Spacer(modifier = Modifier.height(16.dp))

            MenuButton(
                text = "Gestionar perfil",
                icon = Icons.Filled.Edit,
                onClick = onManageProfileClick
            )
        }
    }
}
/*


 */

@Composable
private fun MenuButton(
    text: String,
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp)
    ) {
        Icon(imageVector = icon, contentDescription = null)
        Spacer(modifier = Modifier.padding(horizontal = 8.dp))
        Text(text = text)
    }
}

@Preview(showBackground = true)
@Composable
private fun MenuScreenPreview() {
    MaterialTheme {
        Pantalla1()
    }
}
