package com.example.meteoapp.components

import android.os.Build
import java.io.BufferedReader
import java.net.HttpURLConnection
import java.net.URL

fun sendGet() {
    val url = URL("http://www.google.com/")

    with(url.openConnection() as HttpURLConnection) {
        requestMethod = "GET"  // optional default is GET

        println("\nSent 'GET' request to URL : $url; Response Code : $responseCode")

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            inputStream.bufferedReader().use {
                it.lines().forEach { line ->
                    println(line)
                }
            }
        } else {
            val reader: BufferedReader = inputStream.bufferedReader()
            var line: String? = reader.readLine()
            while (line != null) {
                System.out.println(line)
                line = reader.readLine()
            }
            reader.close()
        }
    }
}