package com.example.meteoapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.meteoapp.R

@Composable
fun Middle(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp),
        // contentAlignment = Alignment.Center
    ) {
        Column {
            Row(
                modifier = modifier
                    .background(Color.Cyan)
                    .fillMaxWidth()
                    .weight(0.5f)
            ) {
                Text(
                    modifier = modifier
                        .padding(top = 5.dp),
                    text = "Date",
                    style = TextStyle(fontSize = 28.sp)
                )
            }
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = modifier
                    .background(Color.Magenta)
                    .fillMaxWidth()
                    .weight(3f)
            ) {
                Column(
                    modifier = modifier
                        .background(Color.Gray)
                        .width(200.dp)
                ) {
                    Text(
                        text = "26°",
                        style = TextStyle(fontSize = 90.sp)
                    )
                    Text(
                        text = "Description°",
                        style = TextStyle(fontSize = 20.sp)
                    )
                    Text(
                        text = "26°",
                        style = TextStyle(fontSize = 90.sp)
                    )
                    Text(
                        text = "Description°",
                        style = TextStyle(fontSize = 20.sp)
                    )
                    Text(
                        text = "26°",
                        style = TextStyle(fontSize = 90.sp)
                    )
                    Text(
                        text = "Description°",
                        style = TextStyle(fontSize = 20.sp)
                    )
                }
                Column(
                    modifier = modifier
                        .background(Color.Yellow)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.image2),
                        contentDescription = null,
                        modifier = Modifier
                            .size(width = 200.dp, height = 150.dp)
                    )
                    Text(modifier = modifier.padding(top = 20.dp),
                        text = "DescriptionDescriptionDescriptionDescriptionDescriptionDescriptionDescriptionDescriptionDescriptionDescriptionDescriptionDescriptionDescriptionDescriptionDescriptionDescriptionDescription",
                        style = TextStyle(fontSize = 20.sp)
                    )
                }


            }

        }
    }
}