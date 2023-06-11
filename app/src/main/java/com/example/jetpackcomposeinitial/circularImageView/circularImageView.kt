package com.example.jetpackcomposeinitial.circularImageView

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Colors
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposeinitial.R
import com.example.jetpackcomposeinitial.ui.theme.JetpackComposeInitialTheme

@Composable
fun circularImageView() {
    Image(
        modifier = Modifier
            .size(250.dp)
            .clip(CircleShape)
            .border(width = 2.dp, shape = CircleShape, color = Color.Magenta),
        painter = painterResource(id = R.drawable.ic_launcher_background),
        contentDescription = "circularImageView"
    )
}

@Preview(showBackground = true)
@Composable
fun circularImageViewPreview() {
    JetpackComposeInitialTheme {
        Surface {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                circularImageView()
            }
        }
    }
}