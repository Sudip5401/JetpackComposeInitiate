package com.example.jetpackcomposeinitial.nestednavigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navigation
import com.example.jetpackcomposeinitial.navigation.DETAILS_ARG_ID_KEY
import com.example.jetpackcomposeinitial.navigation.DETAILS_ARG_NAME_KEY
import com.example.jetpackcomposeinitial.navigation.DetailsScreen
import com.example.jetpackcomposeinitial.navigation.HOME_GRAPH_ROUTE
import com.example.jetpackcomposeinitial.navigation.HomeScreen
import com.example.jetpackcomposeinitial.navigation.Screen

fun NavGraphBuilder.homeNavGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = Screen.Home.route,
        route = HOME_GRAPH_ROUTE
    ) {
        composable(
            route = Screen.Home.route
        ) {
            HomeScreen(navController = navController)
        }
        composable(
            route = Screen.Details.route,
            arguments = listOf(
                navArgument(DETAILS_ARG_ID_KEY) {
                    type = NavType.IntType
                    defaultValue = 0
                },
                navArgument(DETAILS_ARG_NAME_KEY) {
                    type = NavType.StringType
                    defaultValue = "Stevdza-San"
                }
            )
        ) {
            DetailsScreen(navController = navController)
        }
    }
}