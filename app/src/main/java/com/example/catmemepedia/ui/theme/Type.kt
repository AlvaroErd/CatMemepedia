package com.example.catmemepedia.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.catmemepedia.R

val Lostar = FontFamily(
    Font(R.font.lostar, FontWeight.Normal),
)

val Coolvetica = FontFamily(
    Font(R.font.coolvetica_regular, FontWeight.Normal),
    Font(R.font.coolvetica_bold, FontWeight.Bold)
)

// Set of Material typography styles to start with
val Typography = Typography(
    h1 = TextStyle(
        fontFamily = Lostar,
        fontWeight = FontWeight.Normal,
        fontSize = 30.sp
    ),
    h2 = TextStyle(
        fontFamily = Lostar,
        fontSize = 20.sp
    ),
    h3 = TextStyle(
        fontFamily = Lostar,
        fontSize = 14.sp
    ),
    body1 = TextStyle(
        fontFamily = Coolvetica,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    )
)
