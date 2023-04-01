package com.example.jetpackcomposeinitial.RecyclerView

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposeinitial.ui.theme.JetpackComposeInitialTheme

class RecycleStickyLazyColumn : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeInitialTheme {
                Surface {
                    Column {
                        Row(
                            modifier = Modifier.fillMaxSize()
                                .background(color = Color.Gray)
                        ) {
                            ConstructRecyclerList()
                        }
                    }
                }
            }
        }
    }

    @OptIn(ExperimentalFoundationApi::class)
    @Composable
    private fun ConstructRecyclerList() {
        val sections = listOf("A", "B", "C", "D", "E", "F", "G")
        LazyColumn(modifier = Modifier.padding(all = 12.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
            sections.forEach { header ->
                stickyHeader {
                    Text(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.LightGray)
                            .padding(12.dp),
                        text = "Section $header"
                    )
                }
                items(count = 10) {
                    Text(
                        modifier = Modifier.padding(12.dp),
                        text = "Item $it from the section $header"
                    )
                }
            }
        }
    }

    @Composable
    @Preview(showBackground = true)
    private fun RecycleLazyColumnPreview(){
        JetpackComposeInitialTheme {
            Surface {
                Column {
                    Row(
                        modifier = Modifier.fillMaxSize()
                            .background(color = Color.Gray)
                    ) {
                        ConstructRecyclerList()
                    }
                }
            }
        }
    }
}