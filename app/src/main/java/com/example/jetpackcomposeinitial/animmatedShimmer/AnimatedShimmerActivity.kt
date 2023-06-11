package com.example.jetpackcomposeinitial.animmatedShimmer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import com.example.jetpackcomposeinitial.ui.theme.JetpackComposeInitialTheme

class AnimatedShimmerActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeInitialTheme {
                Column {
                    /*To perform the same operations 7 times*/
                    repeat(7) {
                        AnimatedShimmer()
                    }
                }
            }
        }
    }
}