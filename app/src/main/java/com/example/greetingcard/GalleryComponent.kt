package com.example.greetingcard

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun GalleryComponent() {
    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 24.dp),
        horizontalArrangement = Arrangement.spacedBy(space = 15.dp)
    ) {
        item {
            Box(contentAlignment = Alignment.Center) {
                Image(
                    painter = painterResource(id = R.drawable.ic_first_gallery_image),
                    contentDescription = "first_gallery_image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(width = 240.dp, height = 128.dp)
                        .clip(RoundedCornerShape(14.dp))
                )
                Image(
                    painter = painterResource(id = R.drawable.ic_play_button),
                    contentDescription = "play_button_image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(size = 48.dp)
                        .align(Alignment.Center)
                )
            }
        }
        item {
            Image(
                painter = painterResource(id = R.drawable.ic_second_gallery_image),
                contentDescription = "second_gallery_image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(width = 240.dp, height = 128.dp)
                    .clip(RoundedCornerShape(14.dp))
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GalleryComponentPreview() {
    GalleryComponent()
}