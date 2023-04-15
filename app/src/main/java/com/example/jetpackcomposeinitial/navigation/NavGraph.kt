package com.example.jetpackcomposeinitial.navigation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument

@Composable
fun SetUpNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screen.Home.route) {
        composable(route = Screen.Home.route) {
            HomeScreen(navController)
        }
        composable(
            route = Screen.Details.route, arguments = listOf(
//                navArgument("id") {
//                    type = NavType.IntType
//                },
//                navArgument("name") {
//                    type = NavType.StringType
//                }
                navArgument("id") {
                    type = NavType.IntType
                    defaultValue = 0
                }
            )
        ) {
            Log.e("value", it.arguments?.getInt("id").toString())
            Log.e("StringValue", it.arguments?.getString("name").toString())
            DetailsScreen(navController)
        }
    }
}