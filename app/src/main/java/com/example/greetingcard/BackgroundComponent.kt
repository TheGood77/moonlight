package com.example.greetingcard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.greetingcard.ui.theme.BackgroundColor

@Composable
fun BackgroundComponent() {
    Box {
        Image(
            painter = painterResource(id = R.drawable.ic_background_image),
            contentDescription = "background_image",
            contentScale = ContentScale.FillWidth,
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 350.dp)
                .clip(shape = RoundedCornerShape(10.dp))
                .size(size = 70.dp)
                .background(color = BackgroundColor)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BackgroundComponentPreview() {
    BackgroundComponent()
}