package com.example.meteoapp.components.pagess

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.meteoapp.components.Middle

@Composable
fun JourTrois (navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),

        ) {

        Middle(modifier = Modifier.background(Color(0x4B1034B3)))
    }
}
