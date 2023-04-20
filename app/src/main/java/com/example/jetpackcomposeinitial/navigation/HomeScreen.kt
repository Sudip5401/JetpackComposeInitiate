package com.example.jetpackcomposeinitial.navigation

import androidx.activity.ComponentActivity
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun HomeScreen(navController: NavHostController) {
    /*To showcase normal navigation*/
//    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
//        Text(
//            text = "Home",
//            style = TextStyle(
//                color = Color.Blue,
//                fontWeight = FontWeight.Bold,
//                fontSize = MaterialTheme.typography.h4.fontSize
//            ),
//            modifier = Modifier.clickable {
////                navController.navigate(Screen.Details.passIntAndStringValue(10, "Nawin"))
//                navController.navigate(
//                    Screen.Details.PassMultiOptionalParams(
//                        name = "Nawin",
//                        id = 25
//                    )
//                )
//            })
//    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = Modifier.clickable {
                navController.navigate(
                    route = Screen.Details.PassMultiOptionalParams(
                        id = 11,
                        name = "John"
                    )
                )
//                throw RuntimeException("Test Crash"); // Force a crash
            },
            text = "Home",
            color = MaterialTheme.colors.primary,
            fontSize = MaterialTheme.typography.h3.fontSize,
            fontWeight = FontWeight.Bold
        )

        /*To showcase nested navigation*/
        Text(
            modifier = Modifier
                .padding(top = 150.dp)
                .clickable {
                    navController.navigate(AUTH_GRAPH_ROUTE)
                },
            text = "Login/Sign Up",
            fontSize = MaterialTheme.typography.h6.fontSize,
            fontWeight = FontWeight.Medium
        )
    }
}


@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(rememberNavController())
}
