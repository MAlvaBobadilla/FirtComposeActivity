package com.malvab.compseapp1.ui.component.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun Reto1(modifier: Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        Box(
            Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color.Cyan),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Ejemplo 1", color = Color.Black)
        }
        Row(
            Modifier
                .weight(1f)
        ) {
            Box(
                 Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Red),
                contentAlignment = Alignment.Center
            ) { Text(text = "Ejemplo 2", color = Color.Black) }
            Box(
                Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Green),
                contentAlignment = Alignment.Center
            ) { Text(text = "Ejemplo 3", color = Color.Black) }
        }

        Box(
            Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color.Magenta),
            contentAlignment = Alignment.BottomCenter
        ) { Text(text = "Ejemplo 4", color = Color.Black) }
    }
}