package com.example.greetingcard

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.greetingcard.ui.theme.Number_Rating_Text
import com.example.greetingcard.ui.theme.Rating_Review_Text

@Composable
fun RatingReviewComponent(
    modifier: Modifier = Modifier
) {
    Row(modifier = Modifier.padding(start = 24.dp)) {
        val ratingText = stringResource(id = R.string.number_rating_text).toDouble()
        Text(
            text = ratingText.toString(),
            textAlign = TextAlign.Left,
            style = Number_Rating_Text
        )
        Spacer(modifier = Modifier.padding(horizontal = 8.dp))
        Column(
            modifier = modifier.padding(top = 15.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            LazyRow(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                val starCount = if (ratingText == 5.0) 5 else 4
                items(starCount) {
                    Image(
                        modifier = modifier.size(size = 12.dp),
                        painter = painterResource(R.drawable.ic_star),
                        contentDescription = "Full_star"
                    )
                }
                if (ratingText != 5.0) {
                    item {
                        Image(
                            modifier = modifier.size(size = 12.dp),
                            painter = painterResource(R.drawable.ic_part_star),
                            contentDescription = "Part_star"
                        )
                    }
                }
            }
            Text(
                text = stringResource(id = R.string.review_rating_text),
                textAlign = TextAlign.Center,
                style = Rating_Review_Text
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RatingReviewComponentPreview() {
    RatingReviewComponent()
}