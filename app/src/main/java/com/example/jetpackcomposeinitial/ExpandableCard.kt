package com.example.jetpackcomposeinitial

import androidx.compose.ui.graphics.Shape
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposeinitial.ui.theme.JetpackComposeInitialTheme
import com.example.jetpackcomposeinitial.ui.theme.Shapes

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ExpandableCard(
    title: String,
    titleFontSize: TextUnit = MaterialTheme.typography.h6.fontSize,
    titleFontWeight: FontWeight = FontWeight.Bold,
    description: String,
    descriptionFontSize: TextUnit = MaterialTheme.typography.subtitle1.fontSize,
    descriptionFontWeight: FontWeight = FontWeight.Normal,
    descriptionMaxLines: Int = 4,
    shape: Shape = Shapes.medium,
    padding: Dp = 8.dp
) {
    var isExpanded by remember { mutableStateOf(false) }
    var rotationState by remember { mutableStateOf(if (isExpanded) 180f else 0f) }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .animateContentSize(
                animationSpec = tween(
                    durationMillis = 300,
                    easing = LinearOutSlowInEasing
                )
            ),
        backgroundColor = Color.White,
        elevation = 4.dp,
        onClick = {
            isExpanded = !isExpanded
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(padding)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = title,
                    modifier = Modifier.weight(4f),
                    style = TextStyle(
                        fontSize = titleFontSize,
                        color = Color.DarkGray,
                        fontWeight = titleFontWeight
                    ),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                IconButton(
                    onClick = { isExpanded = !isExpanded },
                    modifier = Modifier
                        .weight(1f)
                        .alpha(ContentAlpha.medium)
                        .rotate(rotationState),
                    content = {
                        Icon(
                            tint = Color.Gray,
                            imageVector = Icons.Default.ArrowDropDown,
                            contentDescription = "Drop-down arrow"
                        )
                    })
            }
            if (isExpanded) {
                Text(
                    text = description,
                    modifier = Modifier.fillMaxWidth(),
                    style = TextStyle(
                        fontSize = descriptionFontSize,
                        color = Color.DarkGray,
                        fontWeight = descriptionFontWeight
                    ),
                    maxLines = descriptionMaxLines
                )
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun ExpandableCardPreview() {
    JetpackComposeInitialTheme() {
        Surface(
            modifier = Modifier.fillMaxWidth()
        ) {
            Box(modifier = Modifier.padding(8.dp)){
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