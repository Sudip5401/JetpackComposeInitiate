package com.example.jetpackcomposeinitial.spaceallocation_alignment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.DarkGray
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposeinitial.ui.theme.JetpackComposeInitialTheme

class SpaceDistribution : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            JetpackComposeInitialTheme() {
                Surface() {
//                stack1()
                    TwoTextsInRow(text1 = "Hi", text2 = "there")
                }
            }
        }
    }

    @Composable
    private fun stack1() {
        Column(modifier = Modifier.fillMaxSize()) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Blue)
                    .weight(1f)
                    .padding(8.dp),
                contentAlignment = Alignment.TopCenter
            ) {
                Column() {
                    Text(text = "Example", fontSize = 44.sp)
                }
            }
            Divider(
                color = Color.White,
                modifier = Modifier
                    .height(1.dp)
                    .fillMaxWidth()
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Red)
                    .weight(3f)
                    .padding(8.dp),
                contentAlignment = Alignment.Center
            ) {
                Column {

                    Text(
                        text = "Example",
                        textAlign = TextAlign.End,
                        color = DarkGray,
                        fontSize = 12.sp
                    )
                }
            }
        }
    }

    @Composable
    fun TwoTextsInRow(modifier: Modifier = Modifier, text1: String, text2: String) {
        Row(modifier = modifier.height(IntrinsicSize.Min)) {
            Text(
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 4.dp)
                    .wrapContentWidth(Alignment.Start),
                text = text1
            )
//            Divider(
//                color = Color.Black,
//                modifier = Modifier
//                    .height(10.dp)
//                    .width(1.dp).align(CenterVertically)
//            )
            Divider(
                color = Color.Black,
                modifier = Modifier.fillMaxHeight().width(1.dp)
            )
            Text(
                modifier = Modifier
                    .weight(1f)
                    .padding(end = 4.dp)
                    .wrapContentWidth(Alignment.End),

                text = text2
            )
        }
    }

    @Composable
    fun ThreeTextsInRow(modifier: Modifier = Modifier, text1: String, text2: String,text3: String,) {
        Row(modifier = modifier.fillMaxWidth()) {
            Text(
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 4.dp)
                    .wrapContentWidth(Alignment.Start),
                text = text1
            )
            Text(
                modifier = Modifier
                    .weight(2f)
                    .padding(start = 4.dp)
                    .wrapContentWidth(Alignment.CenterHorizontally).background(color = Color.Cyan),
                text = text2
            )
            Text(
                modifier = Modifier
                    .weight(1f)
                    .padding(end = 4.dp)
                    .wrapContentWidth(Alignment.End),

                text = text3
            )
        }
    }

    @Composable
    @Preview(showBackground = true)
    private fun SpaceDistributionPreview() {
        JetpackComposeInitialTheme() {
            Surface() {
//                stack1()
//                TwoTextsInRow(text1 = "Hi", text2 = "there")
                ThreeTextsInRow(text1 = "Hi", text2 = "Mr.", text3 = "Rohit")
            }
        }
    }
}