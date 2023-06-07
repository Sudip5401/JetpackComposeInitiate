package com.example.jetpackcomposeinitial.bottomNavigation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun BottomNavHomeScreen(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = Modifier.clickable {
//                navController.navigate(
//                    route = Screen.Details.PassMultiOptionalParams(
//                        id = 11,
//                        name = "John"
//                    )
//                )
//                throw RuntimeException("Test Crash"); // Force a crash
            },
            text = "Home Screen",
            color = MaterialTheme.colors.primary,
            fontSize = MaterialTheme.typography.h3.fontSize,
            fontWeight = FontWeight.Bold
        )

        /*To showcase nested navigation*/
//        Text(
//            modifier = Modifier
//                .padding(top = 150.dp)
//                .clickable {
//                    navController.navigate(AUTH_GRAPH_ROUTE)
//                },
//            text = "Login/Sign Up",
//            fontSize = MaterialTheme.typography.h6.fontSize,
//            fontWeight = FontWeight.Medium
//        )
    }
}


@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    BottomNavHomeScreen(rememberNavController())
}
