package com.example.jetpackcomposeinitial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposeinitial.ui.theme.JetpackComposeInitialTheme

class RowColumnsView : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeInitialTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = Color.Gray
                ) {
//                    Column(
//                        modifier = Modifier
//                            .width(500.dp)
//                            .height(500.dp)
//                            .background(color = Color.Cyan),
//                        verticalArrangement = Arrangement.SpaceAround,
//                        horizontalAlignment = Alignment.CenterHorizontally
//                    ) {
//                        CustomSurfaceView(3f, MaterialTheme.colors.error)
//                        CustomSurfaceView(1f)
//                    }

                    Row(

                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        CustomSurfaceView(3f, MaterialTheme.colors.error)
                        CustomSurfaceView(1f)
                    }
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun RowColumnsViewPreview() {
    JetpackComposeInitialTheme {
//        Column(
//            modifier = Modifier.fillMaxSize(),
//            horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.Top
//        ) {
////            Surface(
////                modifier = Modifier
////                    .width(100.dp)
////                    .height(100.dp), color = MaterialTheme.colors.error
////            ) {
////                Column(
////                    verticalArrangement = Arrangement.SpaceAround,
////                    horizontalAlignment = Alignment.CenterHorizontally
////                ) {
////                    Greeting("Android")
////                    GreetingBody("Welcome")
////                }
////            }
////            Spacer(modifier = Modifier.height(4.dp))
////            Surface(
////                modifier = Modifier
////                    .width(100.dp)
////                    .height(100.dp),
////                color = MaterialTheme.colors.error
////            ) {
////                Column(
////                    verticalArrangement = Arrangement.SpaceAround,
////                    horizontalAlignment = Alignment.CenterHorizontally
////                ) {
////                    Greeting("Android")
////                    GreetingBody("Welcome")
////                }
////            }
//
//
//            CustomSurfaceView(3f, MaterialTheme.colors.error)
//            CustomSurfaceView(1f)
//        }


        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            CustomSurfaceView(3f, MaterialTheme.colors.error)
            CustomSurfaceView(1f)
        }
    }
}


@Composable
private fun RowScope.CustomSurfaceView(
    weight: Float,
    color: Color = MaterialTheme.colors.primary
) {
    Surface(
        modifier = Modifier
            .width(200.dp)
            .height(50.dp)
            .weight(weight),
        color = color
    ) {

    }
}

@Composable
private fun ColumnScope.CustomSurfaceView(
    weight: Float,
    color: Color = MaterialTheme.colors.primary
) {
    Surface(
        modifier = Modifier
            .width(200.dp)
            .weight(weight),
        color = color
    ) {
        Column(
            verticalArrangement = Arrangement.SpaceAround,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
        }
    }
}