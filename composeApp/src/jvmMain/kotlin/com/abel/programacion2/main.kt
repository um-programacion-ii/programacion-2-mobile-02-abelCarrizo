package com.abel.programacion2

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "KotlinPrimeraClase",
    ) {
        App()
    }
}