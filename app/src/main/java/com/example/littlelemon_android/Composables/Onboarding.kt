package com.example.littlelemon_android.Composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme // Import MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.littlelemon_android.R
import com.example.littlelemon_android.utils.displayTitle

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
            // Collect user input
            Text(
                text = "Let's get to know you",
                style = displayTitle, // Use the displayTitle style
                modifier = Modifier.padding(8.dp)
            )

            // User's first name
            var firstName by remember { mutableStateOf("") }
            TextField(
                value = firstName,
                onValueChange = { firstName = it },
                label = { Text("First Name") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            )

            // User's last name
            var lastName by remember { mutableStateOf("") }
            TextField(
                value = lastName,
                onValueChange = { lastName = it },
                label = { Text("Last Name") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            )

            // User's email address
            var email by remember { mutableStateOf("") }
            TextField(
                value = email,
                onValueChange = { email = it },
                label = { Text("Email Address") },
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Email,
                    imeAction = ImeAction.Done
                ),
                keyboardActions = KeyboardActions(onDone = { /* Perform action on Done */ }),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            )
            // Register button
            Button(
                onClick = { /* Perform registration logic here */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                Text("Register")
            }
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
