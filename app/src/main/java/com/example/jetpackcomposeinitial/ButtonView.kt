package com.example.jetpackcomposeinitial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposeinitial.ui.theme.JetpackComposeInitialTheme
import com.example.jetpackcomposeinitial.ui.theme.greenHighlight
import com.example.jetpackcomposeinitial.ui.theme.greenlight

class ButtonView : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeInitialTheme() {
                Surface() {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        GradientButton(
                            text = "Continue",
                            textColor = Color.White,
                            gradient = Brush.horizontalGradient(
                                listOf(
                                    greenHighlight,
                                    greenlight
                                )
                            )
                        ) {

                        }
                    }
                }
            }
        }
    }


}

@Composable
fun GradientButton(
    text: String,
    textColor: Color,
    gradient: Brush,
    onClick: () -> Unit
) {
    Button(
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Transparent
        ),
        contentPadding = PaddingValues(),
        onClick = { onClick() })
    {
        Box(
            modifier = Modifier
                .background(gradient)
                .padding(horizontal = 16.dp, vertical = 8.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(text = text, color = textColor)
        }
    }
}

@Composable
@Preview(showBackground = true)
fun ButtonViewPreview() {
    JetpackComposeInitialTheme() {
        Surface() {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                GradientButton(
                    text = "Continue",
                    textColor = Color.White,
                    gradient = Brush.horizontalGradient(
                        listOf(
                            greenHighlight,
                            greenlight
                        )
                    )
                ) {

                }
            }
        }
    }
}