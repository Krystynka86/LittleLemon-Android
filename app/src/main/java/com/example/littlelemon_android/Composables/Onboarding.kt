package com.example.littlelemon_android.Composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme // Import MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.littlelemon_android.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Onboarding() {
    val logoImage: Painter = painterResource(id = R.drawable.logo)

    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally // Horizontally center the logo
        ) {
            // Header with logo image
            Image(
                painter = logoImage,
                contentDescription = "Logo",
                modifier = Modifier
                    .size(100.dp)
                    .padding(16.dp)
            )

            // Other onboarding content can be added here
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun OnboardingPreview() {
    // This preview will display the Onboarding Composable with sample data.
    // Replace any relevant data or add other preview parameters as needed.
    val logoImage: Painter = painterResource(id = R.drawable.logo)

    // Set the Material Design Components 3 (MDC) theme for the preview using MaterialTheme
    MaterialTheme {
        Onboarding()
    }
}
