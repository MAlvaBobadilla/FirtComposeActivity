package com.malvab.compseapp1.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign

@Composable
fun MyText(modifier: Modifier) {
    Text(
        "Hola", modifier
            .fillMaxWidth(),
        textAlign = TextAlign.Center,
        color = Red,
        fontWeight = FontWeight.Bold
    )
}