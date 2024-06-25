package com.example.meteoapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.meteoapp.R

@Composable
fun ItemList(){
    Column (horizontalAlignment = Alignment.CenterHorizontally, ) {
        Image(
            painter = painterResource(id = R.drawable.icone),
            contentDescription = null,
            modifier = Modifier
                .size(70.dp)
                .clip(CircleShape)

        )
        Text(
            text = "Visibility",
            style = TextStyle(fontSize = 20.sp, color = Color.White),


        )
    }
    Column (horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(id = R.drawable.icone),
            contentDescription = null,
            modifier = Modifier
                .size(70.dp)
                .clip(CircleShape)
        )
        Text(
            text = "wind",
            style = TextStyle(fontSize = 20.sp, color = Color.White),

        )
    }
    Column (horizontalAlignment = Alignment.CenterHorizontally){
        Image(
            painter = painterResource(id = R.drawable.icone),
            contentDescription = null,
            modifier = Modifier
                .size(70.dp)
                .clip(CircleShape)
        )
        Text(
            text = "UV",
            style = TextStyle(fontSize = 20.sp, color = Color.White),
        )
    }
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(id = R.drawable.icone),
            contentDescription = null,
            modifier = Modifier
                .size(70.dp)
                .clip(CircleShape)
        )
        Text(
            text = "Pression",
            style = TextStyle(fontSize = 20.sp, color = Color.White),
        )
    }
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(id = R.drawable.icone),
            contentDescription = null,
            modifier = Modifier
                .size(70.dp)
                .clip(CircleShape)
        )
        Text(
            text = "Humidité",
            style = TextStyle(fontSize = 20.sp, color = Color.White),
        )
    }
}