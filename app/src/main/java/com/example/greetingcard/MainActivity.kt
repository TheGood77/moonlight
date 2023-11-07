package com.example.greetingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Divider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.greetingcard.ui.theme.GreetingCardTheme
import androidx.core.view.WindowCompat
import com.example.greetingcard.ui.theme.BackgroundColor
import com.example.greetingcard.ui.theme.Description_Text
import com.example.greetingcard.ui.theme.DividerColor
import com.example.greetingcard.ui.theme.Review_Title_Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            GreetingCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = BackgroundColor
                ) {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen() {
    LazyColumn(modifier = Modifier.fillMaxWidth()) {
        item {
            Box {
                BackgroundComponent()
                Box(modifier = Modifier.padding(top = 324.dp, start = 24.dp)) {
                    Row {
                        LogoComponent()
                        Spacer(modifier = Modifier.padding(horizontal = 6.dp))
                        TitleComponent()
                    }
                }
            }
        }
        item {
            ChipsComponent()
        }
        item {
            Text(
                text = stringResource(id = R.string.description_text),
                textAlign = TextAlign.Left,
                style = Description_Text,
                modifier = Modifier.padding(start = 24.dp)
            )
            Spacer(modifier = Modifier.padding(vertical = 8.dp))
        }
        item {
            GalleryComponent()
            Spacer(modifier = Modifier.padding(vertical = 12.dp))
        }
        item {
            Text(
                text = stringResource(id = R.string.review_title_text),
                textAlign = TextAlign.Left,
                style = Review_Title_Text,
                modifier = Modifier.padding(start = 24.dp)
            )
            Spacer(modifier = Modifier.padding(vertical = 8.dp))
        }
        item {
            RatingReviewComponent()
            Spacer(modifier = Modifier.padding(vertical = 15.dp))
        }
        item {
            ReviewerComponent(person = 0)
        }
        item {
            Divider(
                modifier = Modifier.padding(horizontal = 38.dp, vertical = 24.dp),
                thickness = 1.dp,
                color = DividerColor
            )
        }
        item {
            ReviewerComponent(person = 1)
            Spacer(modifier = Modifier.padding(vertical = 20.dp))
        }
        item {
            ButtonComponent()
            Spacer(modifier = Modifier.padding(vertical = 20.dp))
        }
    }
}

@Preview(showBackground = true, backgroundColor = 0)
@Composable
fun MainPreview() {
    MainScreen()
}