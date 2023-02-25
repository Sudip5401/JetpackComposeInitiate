package com.example.jetpackcomposeinitial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposeinitial.ui.theme.JetpackComposeInitialTheme

class ExpandableCardView : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeInitialTheme() {
                Surface(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(color = Color.White),
                    color = Color.Gray
                ) {
                    Box(modifier = Modifier.padding(8.dp)) {
                        ExpandableCard(
                            title = "My Title",
                            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                                    "sed do eiusmod tempor incididunt ut labore et dolore magna " +
                                    "aliqua. Ut enim ad minim veniam, quis nostrud exercitation " +
                                    "ullamco laboris nisi ut aliquip ex ea commodo consequat."
                        )
                    }
                }
            }
        }
    }
}