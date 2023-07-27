package com.example.littlelemon_android.utils

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.littlelemon_android.R

// This file defines the custom fonts that are used in the app.

val karlaFont = FontFamily(
    Font(R.font.karla_regular)
)

val markazitextFont = FontFamily(
    Font(R.font.markazitext_regular)
)

// Define custom text styles using TextStyle
val body1 = TextStyle(
    fontFamily = karlaFont,
    fontSize = 16.sp,
    color = Color.Black
)

val body2 = TextStyle(
    fontFamily = markazitextFont,
    fontSize = 14.sp,
    color = Color.Black
)

val displayTitle = TextStyle(
    fontFamily = karlaFont,
    fontSize = 24.sp,
    color = Color.Black,
    fontWeight = FontWeight.Bold
)

val subTitle = TextStyle(
    fontFamily = markazitextFont,
    fontSize = 18.sp,
    color = Color.Black,
    fontWeight = FontWeight.Bold
)

// Usage of the custom text styles in your Compose UI
@Composable
fun MyComposable() {
    // You can use the custom text styles like this:
    Text("This is body text", style = body1)
    Text("This is another body text", style = body2)
    Text("This is a display title", style = displayTitle)
    Text("This is a subtitle", style = subTitle)
}
