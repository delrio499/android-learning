package com.example.myapplication.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun CounterScreen(navController: NavController) {
    var count by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(32.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Contador: $count",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = { count++ }) {
            Text("Incrementar")
        }
        Spacer(modifier = Modifier.height(32.dp))

        // 🔵 BOTÓN PARA NAVEGAR A LA OTRA PANTALLA
        Button(
            onClick = { navController.navigate("input") }
        ) {
            Text("Ir a Input")
        }
        Button(
            onClick = { navController.navigate("column") }
        ) {
            Text("Ir a Columns")
        }
        Button(
            onClick = { navController.navigate("fruitList") }
        ) {
            Text("Ir a Fruit List")
        }
        Button(
            onClick = { navController.navigate("scaffold") }
        ) {
            Text("Ir a Scaffold Screen")
        }
    }
}