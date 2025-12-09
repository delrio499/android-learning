package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.ui.CounterScreen
import com.example.myapplication.ui.NameInputScreen
import com.example.myapplication.ui.SaludoScreen
import com.example.myapplication.ui.ColumnsScreen
import com.example.myapplication.ui.FruitListScreen
import com.example.myapplication.ui.ScaffoldScreen
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                // 1. Crear el navController
                val navController = rememberNavController()

                // 2. Definir las rutas
                NavHost(
                    navController = navController,
                    startDestination = "counter"
                ) {

                    // Pantalla 1: el contador
                    composable("counter") {
                        CounterScreen(navController)
                    }

                    // Pantalla 2: input de nombre
                    composable("input") {
                        NameInputScreen(navController)
                    }
                    // Ruta CON argumento
                    composable("saludo/{name}") { backStackEntry ->
                        val name = backStackEntry.arguments?.getString("name") ?: ""
                        SaludoScreen(name)
                    }
                    // Pantalla 3: input de nombre Column
                    composable("column") {
                        ColumnsScreen()
                    }
                    // Pantalla 4: input de nombre fruitList
                    composable("fruitList") {
                        FruitListScreen()
                    }
                    // Pantalla 5: Ejemplo de scaffold
                    composable("scaffold") {
                        ScaffoldScreen()
                    }
                }
                // CounterScreen()
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("Android")
    }
}
