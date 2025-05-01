package com.malvab.compseapp1.components.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun MyRow(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically

    ) {
        Text(
            modifier = Modifier
                .background(Color.Red), text = "Hola1"
        )
        Text(
            modifier = Modifier
                .background(Color.Blue), text = "Hola2"
        )
        Text(
            modifier = Modifier
                .background(Color.White), text = "Hola3"
        )
        Text(
            modifier = Modifier
                .background(Color.Yellow), text = "Hola4"
        )
    }
}