package com.malvab.compseapp1.components.layout.retos

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable

fun Reto2(modifier: Modifier) {
    ConstraintLayout(modifier.fillMaxSize()) {

        val (box1, box2, box3, box4, box5, box6, box7, box8, box9) = createRefs()

        Box(
            Modifier
                .size(175.dp)
                .background(Color.Cyan)
                .constrainAs(box1) {
                    bottom.linkTo(box4.top)
                    end.linkTo(box4.end)
                }
        )
        Box(
            Modifier
                .size(75.dp)
                .background(Color.Black)
                .constrainAs(box2) {
                    start.linkTo(box1.start)
                    end.linkTo(box3.end)
                    bottom.linkTo(box1.bottom)
                    top.linkTo(box3.top)
                }
        )
        Box(
            Modifier
                .size(175.dp)
                .background(Color.DarkGray)
                .constrainAs(box3) {
                    bottom.linkTo(box5.top)
                    start.linkTo(box5.start)
                }
        )
        Box(
            Modifier
                .size(75.dp)
                .background(Color.Magenta)
                .constrainAs(box4) {
                    bottom.linkTo(box6.top)
                    end.linkTo(box6.start)
                }
        )
        Box(
            Modifier
                .size(75.dp)
                .background(Color.Green)
                .constrainAs(box5) {
                    bottom.linkTo(box6.top)
                    start.linkTo(box6.end)
                }
        )
        Box(
            Modifier
                .size(75.dp)
                .background(Color.Yellow)
                .constrainAs(box6) {
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                }
        )
        Box(
            Modifier
                .size(175.dp)
                .background(Color.Blue)
                .constrainAs(box9) {
                    top.linkTo(box6.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
        )
        Box(
            Modifier
                .size(75.dp)
                .background(Color.Gray)
                .constrainAs(box7) {
                    top.linkTo(box6.bottom)
                    end.linkTo(box6.start)
                }
        )
        Box(
            Modifier
                .size(75.dp)
                .background(Color.Red)
                .constrainAs(box8) {
                    top.linkTo(box6.bottom)
                    start.linkTo(box6.end)
                }
        )
    }
}