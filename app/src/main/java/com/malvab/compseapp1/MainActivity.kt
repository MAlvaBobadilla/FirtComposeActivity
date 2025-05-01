package com.malvab.compseapp1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.malvab.compseapp1.components.MyButtons
import com.malvab.compseapp1.components.MyImages
import com.malvab.compseapp1.components.MyTextField
import com.malvab.compseapp1.ui.theme.CompseApp1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CompseApp1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MyImages(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}