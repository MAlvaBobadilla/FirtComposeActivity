package com.malvab.compseapp1.components.layout

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun MyState(modifier: Modifier) {
    var number by rememberSaveable { mutableStateOf(0) }
    Column(modifier = modifier.fillMaxSize()) {
        Texto1(numero = number, onClick = { number += 1 })
        Texto2(number) { number -= 1 }
    }
}

@Composable
fun Texto1(numero: Int, onClick: () -> Unit) {
    Text("Presioname para aumentar : $numero", Modifier.clickable { onClick() })
}

@Composable
fun Texto2(numero: Int, onClick: () -> Unit) {
    Text("Presioname para aumentar : $numero", Modifier.clickable { onClick() })
}