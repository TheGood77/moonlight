package com.example.greetingcard

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.greetingcard.ui.theme.Title_Text

@Composable
fun TitleComponent() {
    Column(modifier = Modifier.padding(top = 34.dp))
    {
        Text(
            text = stringResource(id = R.string.title_text),
            textAlign = TextAlign.Left,
            style = Title_Text
        )
        Spacer(modifier = Modifier.padding(vertical = 3.dp))
        RatingComponent(stars = 5)
    }
}

@Preview(showBackground = true)
@Composable
fun TitleComponentPreview() {
    TitleComponent()
}