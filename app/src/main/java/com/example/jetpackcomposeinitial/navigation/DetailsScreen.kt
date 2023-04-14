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
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun DetailsScreen(navController: NavHostController) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(
            text = "Details",
            style = TextStyle(
                color = Color.Red,
                fontWeight = FontWeight.Bold,
                fontSize = MaterialTheme.typography.h4.fontSize
            ),
            modifier = Modifier.clickable {
//                navController.popBackStack()
                navController.navigate(Screen.Home.route){
                    popUpTo(Screen.Home.route){
                        inclusive = true
                    }
                }
            })
    }
}


@Preview(showBackground = true)
@Composable
fun DetailsScreenPreview() {
    DetailsScreen(rememberNavController())
}
