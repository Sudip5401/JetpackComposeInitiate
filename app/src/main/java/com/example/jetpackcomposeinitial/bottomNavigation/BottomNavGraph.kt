package com.example.jetpackcomposeinitial.bottomNavigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = BottomBarScreen.Home.route) {
        composable(route = BottomBarScreen.Home.route) {
            BottomNavHomeScreen(navController)
        }

        composable(route = BottomBarScreen.Profile.route) {
            BottomNavProfileScreen(navController)
        }

        composable(route = BottomBarScreen.Settings.route) {
            BottomNavSettingScreen(navController)
        }
    }
}