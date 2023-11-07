package com.example.greetingcard.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.greetingcard.R

val modernistFamily = FontFamily(
    Font(R.font.modernist_bold, weight =  FontWeight.Bold),
    Font(R.font.modernist_regular, weight = FontWeight.Normal),
    Font(R.font.modernist_mono)
)

val montserratFamily = FontFamily(
    Font(R.font.montserrat_regular, weight = FontWeight.Normal)
)

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
)

val Title_Text = TextStyle(
    fontFamily = modernistFamily,
    fontWeight = FontWeight.Bold,
    fontSize = 20.sp,
    lineHeight = 26.sp,
    letterSpacing = 0.5.sp,
    color = TitleColor
)

val Count_Review_Text = TextStyle(
    fontFamily = modernistFamily,
    fontWeight = FontWeight.Normal,
    fontSize = 12.sp,
    lineHeight = 14.sp,
    letterSpacing = 0.5.sp,
    color = CountReviewColor
)

val Chips_Text = TextStyle(
    fontFamily = montserratFamily,
    fontWeight = FontWeight.Normal,
    fontSize = 10.sp,
    letterSpacing = 0.sp
)

val Description_Text = TextStyle(
    fontFamily = modernistFamily,
    fontWeight = FontWeight.Normal,
    fontSize = 12.sp,
    lineHeight = 19.sp,
    letterSpacing = 0.5.sp,
    color = DescriptionColor
)

val Review_Title_Text = TextStyle(
    fontFamily = modernistFamily,
    fontWeight = FontWeight.Bold,
    fontSize = 16.sp,
    lineHeight = 0.sp,
    letterSpacing = 0.6.sp,
    color = ReviewTitleColor
)

val Number_Rating_Text = TextStyle(
    fontFamily = modernistFamily,
    fontWeight = FontWeight.Bold,
    fontSize = 48.sp,
    lineHeight = 58.sp,
    letterSpacing = 0.sp,
    color = TitleColor
)

val Rating_Review_Text = TextStyle(
    fontFamily = modernistFamily,
    fontWeight = FontWeight.Normal,
    fontSize = 12.sp,
    lineHeight = 14.sp,
    letterSpacing = 0.5.sp,
    color = ReviewTextColor
)

val Reviewer_Name_Text = TextStyle(
    fontFamily = modernistFamily,
    fontWeight = FontWeight.Normal,
    fontSize = 16.sp,
    lineHeight = 19.sp,
    letterSpacing = 0.5.sp,
    color = TitleColor
)

val Date_Review_Text = TextStyle(
    fontFamily = modernistFamily,
    fontWeight = FontWeight.Normal,
    fontSize = 12.sp,
    lineHeight = 14.sp,
    letterSpacing = 0.5.sp,
    color = ReviewDateColor
)

val Reviewer_Description_Text = TextStyle(
    fontFamily = modernistFamily,
    fontWeight = FontWeight.Normal,
    fontSize = 12.sp,
    lineHeight = 20.sp,
    letterSpacing = 0.5.sp,
    color = ReviewTextColor
)

val Button_Text = TextStyle(
    fontFamily = modernistFamily,
    fontWeight = FontWeight.Bold,
    fontSize = 20.sp,
    lineHeight = 24.sp,
    letterSpacing = 0.6.sp,
    color = ButtonTextColor
)