package com.example.mapremiereapp.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp

// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = textFont,
        fontWeight = FontWeight.Normal,
        fontSize = 36.sp
    ),
    body2 = TextStyle(
        fontFamily = FontFamily.Default,
        fontSize = 16.sp
    ),
    h1 = TextStyle(
        fontFamily = titleFont,
//        fontWeight = FontWeight.Bold,
        fontSize = 22.sp,
        letterSpacing = 0.1.em,
        textAlign = TextAlign.Left
    )
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)