package com.example.jetpackcomposeinitial.nestednavigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.jetpackcomposeinitial.navigation.HOME_GRAPH_ROUTE
import com.example.jetpackcomposeinitial.navigation.ROOT_GRAPH_ROUTE

@Composable
fun SetupNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = HOME_GRAPH_ROUTE,
        route = ROOT_GRAPH_ROUTE
    ) {
        homeNavGraph(navController = navController)
        authNavGraph(navController = navController)
    }
}