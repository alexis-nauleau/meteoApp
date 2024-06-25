package com.example.meteoapp.components.pagess

import com.google.gson.Gson
import okhttp3.OkHttpClient
import okhttp3.Request
import java.io.IOException
data class WeatherResponse(
    val main: Main
)

data class Main(
    val temp: Double
)

class WeatherApiClient(private val apiKey: String) {

    private val client = OkHttpClient()
    private val gson = Gson()

    fun getCurrentWeather(city: String, onResult: (WeatherResponse?) -> Unit) {
        val request = Request.Builder()
            .url("https://api.openweathermap.org/data/2.5/weather?q=$city&appid=$apiKey&units=metric")
            .build()

        client.newCall(request).enqueue(object : okhttp3.Callback {
            override fun onFailure(call: okhttp3.Call, e: IOException) {
                onResult(null)
            }

            override fun onResponse(call: okhttp3.Call, response: okhttp3.Response) {
                response.body?.string()?.let { json ->
                    val weatherResponse = gson.fromJson(json, WeatherResponse::class.java)
                    onResult(weatherResponse)
                }
            }
        })
    }
}