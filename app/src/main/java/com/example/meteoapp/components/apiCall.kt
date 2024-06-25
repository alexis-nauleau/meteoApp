package com.example.meteoapp.components



import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.meteoapp.components.pagess.WeatherApiClient
import com.example.meteoapp.components.pagess.WeatherResponse

@Composable
fun WeatherComposable() {
    val apiKey = "b49af9b0d7846fb2914f98c8a387f8d0"
    val weatherApiClient = remember { WeatherApiClient(apiKey) }
    var weatherResponse by remember { mutableStateOf<WeatherResponse?>(null) }

    LaunchedEffect(Unit) {
        weatherApiClient.getCurrentWeather("Lyon") { response ->
            weatherResponse = response
        }
    }

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        weatherResponse?.let {
            Text(
                text = "Température à Lyon: ${it.main.temp}°C",
                style = MaterialTheme.typography.bodyLarge,
                color = Color.White
            )
        } ?: Text(
            text = "Chargement...",
            style = MaterialTheme.typography.bodyLarge,
            color = Color.White
        )
    }
}
