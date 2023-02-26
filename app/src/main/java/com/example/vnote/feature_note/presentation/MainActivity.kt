package com.example.vnote.feature_note.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.vnote.ui.theme.Purple700
import com.example.vnote.ui.theme.VNoteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VNoteTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Purple700
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    VNoteTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Purple700
        ) {
            Greeting("Android")
        }
    }
}