package com.example.jetpackcomposeinitial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.*
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDirection
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposeinitial.ui.theme.JetpackComposeInitialTheme

class MarginView : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeInitialTheme() {
                Surface(color = MaterialTheme.colors.primary) {
                    Column {
                        CustomTextView()
                        CustomAnnotatedTextView(MaterialTheme.colors.secondary)
                        RepeatText()
                        SuperSubScriptText("Hello", "World")
                    }

                }
            }
        }
    }
}

@Composable
fun CustomTextView() {
    Text(
        text = stringResource(id = R.string.app_name),
        color = Color.Green,
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.DarkGray)
            .padding(horizontal = 8.dp, vertical = 8.dp),
        style = TextStyle(
            textAlign = TextAlign.Start,
            fontSize = MaterialTheme.typography.h6.fontSize,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.ExtraBold
        )
    )
}

@Composable
fun CustomAnnotatedTextView(color : Color) {
    Text(
        buildAnnotatedString {
            withStyle(
                style = ParagraphStyle(
                    textAlign = TextAlign.Center, textDirection = TextDirection.ContentOrLtr,
                    lineHeight = 20.sp
                )
            ) {
                withStyle(
                    style = SpanStyle(
                        color = color,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                ) {
                    append('A')
                }
                append('B')
                append('C')
            }
        }, modifier = Modifier.width(150.dp)
    )
}

@Composable
fun RepeatText() {
    SelectionContainer {
        Column {
            Text(
                "Hello World".repeat(3), maxLines = 2, overflow = TextOverflow.Ellipsis
            )
            DisableSelection {
                Text(
                    "Hello World".repeat(3), maxLines = 2, overflow = TextOverflow.Ellipsis
                )
            }
            Text(
                "Hello World".repeat(3), maxLines = 2, overflow = TextOverflow.Ellipsis
            )
        }
    }
}

@Composable
fun SuperSubScriptText(normalText: String, superSubText: String) {
    Column {
        Text(
            buildAnnotatedString {
                withStyle(style = SpanStyle(fontSize = 20.sp, fontStyle = FontStyle.Italic)) {
                    append(normalText)
                }
                withStyle(
                    style = SpanStyle(
                        fontSize = 10.sp,
                        fontStyle = FontStyle.Normal,
                        baselineShift = BaselineShift.Subscript
                    )
                ) {
                    append(superSubText)
                }
            },
        )
        Text(
            buildAnnotatedString {
                withStyle(style = SpanStyle(fontSize = 20.sp, fontStyle = FontStyle.Italic)) {
                    append(normalText)
                }
                withStyle(
                    style = SpanStyle(
                        fontSize = 10.sp,
                        fontStyle = FontStyle.Normal,
                        baselineShift = BaselineShift.Superscript
                    )
                ) {
                    append(superSubText)
                }
            },
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MarginViewPreview() {
    JetpackComposeInitialTheme() {
        Surface(color = MaterialTheme.colors.primary) {
            Column {
                CustomTextView()
                CustomAnnotatedTextView(MaterialTheme.colors.secondary)
                RepeatText()
                SuperSubScriptText("Hello", "World")
            }
        }
    }
}