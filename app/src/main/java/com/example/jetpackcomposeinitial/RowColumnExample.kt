package com.example.jetpackcomposeinitial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposeinitial.ui.theme.JetpackComposeInitialTheme

class RowColumnExample : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeInitialTheme() {
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color.Magenta)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(color = Color.Gray)
                    ) {
                        Row(
                            modifier = Modifier
                                .height(400.dp)
                                .fillMaxWidth()
                                .background(color = Color.Green)
                        ) {

                        }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(200.dp)
                                .background(color = Color.Cyan)
                        ) {

                        }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(200.dp)
                                .background(color = Color.Red)
                        ) {

                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RowColumnExamplePreview() {
    JetpackComposeInitialTheme() {
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.Magenta)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color.Gray)
            ) {
                Row(
                    modifier = Modifier
                        .height(400.dp)
                        .background(color = Color.Green)
                ) {

                }
                Row(
                    modifier = Modifier
                        .height(200.dp)
                        .background(color = Color.Cyan)
                ) {

                }
                Row(
                    modifier = Modifier
                        .height(200.dp)
                        .background(color = Color.Red)
                ) {

                }
            }
        }
    }
}