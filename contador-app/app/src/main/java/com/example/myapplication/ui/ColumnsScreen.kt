package com.example.myapplication.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ColumnsScreen() {

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text("Pantalla de Ejemplo") }
            )
        }
    ) { innerPadding ->


        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)   // <-- evita barra superior e inferior
                .padding(24.dp)        // <-- padding estándar de diseño
                .background(Color(0xFFEDEDED)),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                "Columna Principal - Arriba",
                style = MaterialTheme.typography.titleMedium
            )


            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp)
                    .background(Color.White),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.Start
            ) {

                Text(
                    "Columna Secundaria",
                    modifier = Modifier.padding(4.dp)
                        .align(Alignment.CenterHorizontally)
                )

                Text(
                    "Item 1",
                    modifier = Modifier.padding(4.dp)

                )

                Text(
                    "Item 2 (con weight)",
                    modifier = Modifier.padding(4.dp)
                )

                Text(
                    "Item 3",
                    modifier = Modifier.padding(4.dp)

                )
            }

            Text(
                "Columna Principal - Abajo",
                style = MaterialTheme.typography.bodyLarge
            )
        }
    }
}

