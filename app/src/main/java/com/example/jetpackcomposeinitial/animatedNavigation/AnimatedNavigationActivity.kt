package com.example.jetpackcomposeinitial.animatedNavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcomposeinitial.ui.theme.JetpackComposeInitialTheme

class AnimatedNavigationActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeInitialTheme() {
                val navController = rememberNavController()
                SetupNavGraph(navController = navController)
            }
        }
    }
}