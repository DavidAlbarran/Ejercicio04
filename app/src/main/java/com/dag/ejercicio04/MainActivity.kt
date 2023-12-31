package com.dag.ejercicio04

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.dag.ejercicio04.ui.theme.Ejercicio04Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Ejercicio04Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    myImageAdvance()
                }
            }
        }
    }
}

@Preview(
    name = "P1",
    showSystemUi = true,
    showBackground = true,
    fontScale = 1.1f,
    apiLevel = 33,
    device = Devices.NEXUS_5
)


@Composable
fun GreetingPreview() {
    Ejercicio04Theme {
        myImageAdvance()
    }
}