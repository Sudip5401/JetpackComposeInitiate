package com.example.jetpackcomposeinitial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposeinitial.ui.theme.JetpackComposeInitialTheme
import com.example.jetpackcomposeinitial.ui.theme.Shapes
import com.example.jetpackcomposeinitial.ui.theme.Typography

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeInitialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background
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

@Composable
fun GreetingBody(body: String) {
    Text(text = "$body", style = TextStyle(fontFamily = FontFamily.Cursive, fontSize = 40.sp))
}

//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    JetpackComposeInitialTheme {
//        Surface(
//            color = MaterialTheme.colors.error
//        ) {
//            Column(
//                modifier = Modifier
//                    .width(400.dp)
//                    .height(250.dp)
//                    .background(color = Color.Gray),
//                verticalArrangement = Arrangement.SpaceAround,
//                horizontalAlignment = Alignment.CenterHorizontally
//            ) {
//                Greeting("Android")
//                GreetingBody("Welcome")
//            }
//        }
//    }
//}