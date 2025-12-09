package com.example.myapplication.ui

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun SaludoScreen(name: String) {
    Text(text = "Hola $name")
}