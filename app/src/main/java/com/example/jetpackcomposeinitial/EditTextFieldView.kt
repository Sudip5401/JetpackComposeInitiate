package com.example.jetpackcomposeinitial

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposeinitial.ui.theme.JetpackComposeInitialTheme

class EditTextFieldView : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeInitialTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    Column(modifier = Modifier.fillMaxWidth()) {
                        NormalEdittextFieldUI()
                        PasswordEdittextFieldUI()
                    }
                }
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun EditTextFieldPreview() {
    JetpackComposeInitialTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            Column(modifier = Modifier.fillMaxWidth()) {
                NormalEdittextFieldUI()
                PasswordEdittextFieldUI()
            }
        }
    }
}

@Composable
private fun NormalEdittextFieldUI() {
    var textFieldValue by remember {
        mutableStateOf("")
    }
    /*TextField*/
    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        value = textFieldValue,
        onValueChange = { newValue -> textFieldValue = newValue },
        enabled = true,
        readOnly = false,
        label = { Text(text = "Title") }, singleLine = true,
        maxLines = 2,
        leadingIcon = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Filled.Email,
                    contentDescription = "EmailIcon"
                )
            }
        },
        trailingIcon = {
            IconButton(onClick = { println("clicked Edittext field tick ${textFieldValue}") }) {
                Icon(
                    imageVector = Icons.Filled.Check,
                    contentDescription = "EmailIcon"
                )
            }
        },
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Email,
            autoCorrect = false,
            imeAction = ImeAction.Done
        ),
        keyboardActions = KeyboardActions(onDone = {
            println("clicked keyboard onDone")
        })
    )
}


@Composable
private fun PasswordEdittextFieldUI() {
    var password by rememberSaveable {
        mutableStateOf("")
    }

    var passwordVisibiltySelection by remember {
        mutableStateOf(false)
    }
    val visibleIcon =
        if (passwordVisibiltySelection) painterResource(id = R.drawable.ic_google_logo) else painterResource(
            id = R.drawable.ic_launcher_background
        )
    /*TextField*/
    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        value = password,
        onValueChange = { newValue -> password = newValue },
        label = { Text(text = "Password") }, singleLine = true,
        placeholder = { Text(text = "Enter Password") },
        trailingIcon = {
            IconButton(onClick = {
                passwordVisibiltySelection = !passwordVisibiltySelection
            }) {
                Icon(
                    painter = visibleIcon,
                    contentDescription = "visibleIcon",
                    modifier = Modifier
                        .width(15.dp)
                        .height(15.dp)
                )
            }
        },
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Password,
            imeAction = ImeAction.Done
        ),
        visualTransformation = if (passwordVisibiltySelection) VisualTransformation.None else PasswordVisualTransformation()
    )
}
