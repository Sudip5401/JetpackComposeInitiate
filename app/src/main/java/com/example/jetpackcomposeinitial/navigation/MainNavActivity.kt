package com.example.jetpackcomposeinitial.navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcomposeinitial.nestednavigation.SetupNavGraph
import com.example.jetpackcomposeinitial.ui.theme.JetpackComposeInitialTheme

class MainNavActivity : ComponentActivity() {

    lateinit var navController : NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeInitialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background
                ) {
                    navController = rememberNavController()
                    /*This is for normal navigation graph*/
                    SetUpNavGraph(navController)

                    /*This is for nested navigation graph*/
                    SetupNavGraph(navController)
                }
            }
        }
    }
}