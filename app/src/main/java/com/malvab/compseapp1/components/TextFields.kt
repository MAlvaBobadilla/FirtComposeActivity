package com.malvab.compseapp1.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp

@Composable
fun MyTextField(modifier: Modifier) {
    Column(modifier = modifier) {

        val indUsuario = "Ingrese su Usuario"
        val indPassword = "Ingrese su Contraseña"

        var user by rememberSaveable { mutableStateOf("") }
        var password by rememberSaveable { mutableStateOf("") }

        TextFieldUser(indUsuario = indUsuario, user = user) { user = it }
        TextFieldPassword(indPassword = indPassword, password = password) { password = it }

    }
}

@Composable
fun TextFieldUser(indUsuario: String, user: String, onValueChange: (String) -> Unit) {
    TextField(
        value = user,
        onValueChange = { onValueChange(it) },
        label = { Text(indUsuario) }
    )
}

@Composable
fun TextFieldPassword(indPassword: String, password: String, onValueChange: (String) -> Unit) {

    var passwordHidden by rememberSaveable { mutableStateOf(true) }

    TextField(
        value = password,
        onValueChange = onValueChange,
        label = { Text(indPassword) },
        singleLine = true,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        visualTransformation = if (passwordHidden) PasswordVisualTransformation() else VisualTransformation.None,
        trailingIcon = {
            Text(
                if (passwordHidden) "Mostrar" else "Ocultar",
                modifier = Modifier
                    .padding(10.dp)
                    .clickable { passwordHidden = !passwordHidden })
        }
    )
}


