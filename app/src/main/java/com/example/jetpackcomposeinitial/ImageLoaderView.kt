package com.example.jetpackcomposeinitial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.compose.AsyncImagePainter
import coil.compose.rememberAsyncImagePainter
import coil.compose.rememberImagePainter
import coil.request.ImageRequest
import coil.size.Size
import coil.transform.CircleCropTransformation
import coil.transform.RoundedCornersTransformation
import com.example.jetpackcomposeinitial.ui.theme.JetpackComposeInitialTheme

class ImageLoaderView : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeInitialTheme() {
                Surface(modifier = Modifier.fillMaxSize()) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        CoilImageLoader()
                    }
                }
            }
        }
    }

    @Composable
    fun CoilImageLoader() {
        /*Link : https://coil-kt.github.io/coil/compose/ */
        Box(
            modifier = Modifier
                .height(200.dp)
                .width(200.dp),
            contentAlignment = Alignment.Center
        ) {
            val painter = rememberAsyncImagePainter(
                ImageRequest.Builder(LocalContext.current)
                    .data("https://source.unsplash.com/user/c_v_r/1900x800")
                    .size(Size.ORIGINAL)
                    .placeholder(R.drawable.ic_launcher_background)
                    .error(R.drawable.ic_google_logo)
                    .crossfade(1000)
                    .transformations(
//                        CircleCropTransformation()
                        RoundedCornersTransformation(50f)
                    )// Set the target size to load the image at.
                    .build()
            )

            if (painter.state is AsyncImagePainter.State.Loading) {
                CircularProgressIndicator()
            }

            Image(
                painter = painter,
                contentDescription = stringResource(R.string.app_name)
            )

//            AsyncImage(
//                model = ImageRequest.Builder(LocalContext.current)
//                    .data("https://source.unsplash.com/user/c_v_r/1900x800")
//                    .crossfade(true)
//                    .build(),
//                contentDescription = null
//            )
        }

    }
}