package com.malvab.compseapp1.ui.component.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable

fun MyBasicContraintLayout(modifier: Modifier) {
    ConstraintLayout(modifier = modifier.fillMaxSize()) {

        val (box1, box2, box3, box4, box5) = createRefs()

        Box(
            Modifier
                .size(150.dp)
                .background(Color.Red)
                .constrainAs(box1) {
                    top.linkTo(box5.bottom)
                    start.linkTo(box5.end)
                },
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Ejemplo 1", color = Color.Black)
        }
        Box(
            Modifier
                .size(150.dp)
                .background(Color.Gray)
                .constrainAs(box2) {
                    top.linkTo(box5.bottom)
                    end.linkTo(box5.start)
                },
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Ejemplo 1", color = Color.Black)
        }
        Box(
            Modifier
                .size(150.dp)
                .background(Color.Green)
                .constrainAs(box3) {
                    bottom.linkTo(box5.top)
                    start.linkTo(box5.end)
                },
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Ejemplo 1", color = Color.Black)
        }
        Box(
            Modifier
                .size(150.dp)
                .background(Color.Magenta)
                .constrainAs(box4) {
                    end.linkTo(box5.start)
                    bottom.linkTo(box5.top)
                },
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Ejemplo 1", color = Color.Black)
        }
        Box(
            modifier = Modifier
                .size(150.dp)
                .background(Color.Yellow)
                .constrainAs(box5) {
                    bottom.linkTo(parent.bottom)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                },
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Ejemplo 1", color = Color.Black)
        }
    }
}