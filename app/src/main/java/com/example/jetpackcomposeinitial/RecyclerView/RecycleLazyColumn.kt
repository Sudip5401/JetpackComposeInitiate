package com.example.jetpackcomposeinitial.RecyclerView

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposeinitial.ui.theme.JetpackComposeInitialTheme

class RecycleLazyColumn : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeInitialTheme {
                Surface {
                    Column {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(300.dp)
                        ) {
                            ConstructRecyclerList()
                        }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .fillMaxHeight()
                                .background(color = Color.Magenta)
                        ) {
                            ConstructRecyclerList()
                        }
                    }
                }
            }
        }
    }

    @Composable
    private fun ConstructRecyclerList() {
        val repository = PersonRepository()
        LazyColumn(modifier = Modifier.padding(all = 12.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
            items(count = repository.getAllPersons().size){
                CustomListItem(repository.getAllPersons()[it])
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
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(300.dp)
                    ) {
                        ConstructRecyclerList()
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight()
                            .background(color = Color.Magenta)
                    ) {
                        ConstructRecyclerList()
                    }
                }

            }
        }
    }
}

