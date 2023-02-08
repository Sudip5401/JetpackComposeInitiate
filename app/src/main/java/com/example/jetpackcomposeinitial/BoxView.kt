package com.example.jetpackcomposeinitial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposeinitial.ui.theme.JetpackComposeInitialTheme

class BoxView : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeInitialTheme {
                Surface(color = MaterialTheme.colors.primary) {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Box(
                            modifier = Modifier
                                .width(150.dp)
                                .height(150.dp)
                                .background(color = Color.Gray)
                                .verticalScroll(rememberScrollState()),
                            contentAlignment = Alignment.Center
                        ) {
                            Box(modifier = Modifier
                                .width(50.dp)
                                .height(50.dp)
                                .background(color = Color.Magenta))
                            Text(
                                text = "Hello sdsdsdsdsdsdsdsdsdsdsdsds",
                                color = Color.Green,
                                modifier = Modifier
                                    .fillMaxWidth(),
                                style = TextStyle(textAlign = TextAlign.End, fontSize = 40.sp)
                            )
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BoxViewPreview() {
    Surface(color = MaterialTheme.colors.primary) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Box(
                modifier = Modifier
                    .width(150.dp)
                    .height(100.dp)
                    .background(color = Color.Gray),
                contentAlignment = Alignment.Center
            ) {
                Box(
                    modifier = Modifier
                        .width(150.dp)
                        .height(100.dp)
                        .background(color = Color.Gray)
                        .verticalScroll(rememberScrollState()),
                    contentAlignment = Alignment.Center
                ){
                    Text(
                        text = "Hello sdsdsdsdsdsdsdsdsdsdsdsds",
                        color = Color.Green,
                        modifier = Modifier
                            .fillMaxWidth(),
                        style = TextStyle(textAlign = TextAlign.End, fontSize = 40.sp)
                    )
                }
                Box(modifier = Modifier
                    .width(50.dp)
                    .height(50.dp)
                    .background(color = Color.Magenta))
            }
        }
    }
}