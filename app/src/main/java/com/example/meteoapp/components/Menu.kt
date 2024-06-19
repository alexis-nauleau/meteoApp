package com.example.meteoapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Menu() {
    Row(horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.Bottom,

        modifier = Modifier
            //.background(color = Color.Red)
            .fillMaxHeight()
            .fillMaxSize()
            .padding(horizontal = 10.dp)
    ) {
        Text(text = "aujourd'hui".uppercase())
        Text(text = "demain".uppercase())
        Text(text = "prochainement".uppercase())

    }
}