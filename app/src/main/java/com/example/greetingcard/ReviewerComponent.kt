package com.example.greetingcard

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.greetingcard.ui.theme.Date_Review_Text
import com.example.greetingcard.ui.theme.Reviewer_Description_Text
import com.example.greetingcard.ui.theme.Reviewer_Name_Text

@Composable
fun ReviewerComponent(
    modifier: Modifier = Modifier,
    person: Int
) {
    val image = if (person == 0) R.drawable.ic_first_reviewer else R.drawable.ic_second_reviewer
    val name = if (person == 0) R.string.first_name_reviewer else R.string.second_name_reviewer
    Column(modifier = modifier.padding(horizontal = 24.dp)) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(space = 16.dp)
        ) {
            Image(
                modifier = modifier
                    .size(36.dp)
                    .clip(CircleShape),
                painter = painterResource(id = image),
                contentDescription = "Reviewer_image"
            )
            Column(
                verticalArrangement = Arrangement.spacedBy(space = 7.dp)
            ) {
                Text(
                    text = stringResource(id = name),
                    textAlign = TextAlign.Center,
                    style = Reviewer_Name_Text
                )
                Text(
                    text = stringResource(id = R.string.date_review),
                    textAlign = TextAlign.Center,
                    style = Date_Review_Text
                )
            }
        }
        Spacer(modifier = modifier.padding(top = 16.dp))
        Text(
            text = stringResource(id = R.string.reviewer_text),
            textAlign = TextAlign.Left,
            style = Reviewer_Description_Text
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ReviewerComponentPreview() {
    ReviewerComponent(person = 0)
}