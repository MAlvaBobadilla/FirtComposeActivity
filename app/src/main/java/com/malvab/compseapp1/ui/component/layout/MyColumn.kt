package com.malvab.compseapp1.ui.component.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun MyColumn(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally

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