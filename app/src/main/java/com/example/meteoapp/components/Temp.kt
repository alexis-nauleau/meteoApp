package com.example.meteoapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.meteoapp.R

@Composable
fun Temp(modifier: Modifier = Modifier){
    Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center,
        modifier = modifier
            // .background(Color.Gray)
            .width(200.dp)
    ) {
        Text(
            text = "26°",
            style = TextStyle(fontSize = 90.sp),
            color = Color.White,
        )
        Text(
            text = "Ressenti",
            style = TextStyle(fontSize = 20.sp),
            color = Color.White,
            modifier = modifier.padding(start = 1.dp)
        )
    }
    Column(
        modifier = modifier
        //.background(Color.Yellow)
    ) {
        Image(
            painter = painterResource(id = R.drawable.image2),
            contentDescription = null,
            modifier = Modifier
                .size(width = 200.dp, height = 150.dp)
        )
    }
}