package com.example.jetpackcomposeinitial.searchBar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material.Surface
import com.example.jetpackcomposeinitial.ui.theme.JetpackComposeInitialTheme

class SearchBarActivity : ComponentActivity() {

    private val mainViewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface {
                JetpackComposeInitialTheme {
                    MainScreen(mainViewModel = mainViewModel)
                }
            }
        }
    }
}