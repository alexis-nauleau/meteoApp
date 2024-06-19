package com.example.meteoapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp

@Composable
fun Menu() {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.Bottom,

        modifier = Modifier
           // .background(color = Color.White.copy(alpha = 0.01f))
            .fillMaxHeight()
            .fillMaxSize()
            .padding(horizontal = 10.dp)

    ) {
        Box (modifier = Modifier
            //.background(color = Color.Red)
            .padding(bottom = 0.1.dp)
            .drawBehind {
                val strokeWidth = 2.dp.toPx()
                val y = size.height - strokeWidth / 2
                drawLine(
                    color = Color.White,
                    start = androidx.compose.ui.geometry.Offset(0f, y),
                    end = androidx.compose.ui.geometry.Offset(size.width, y),
                    strokeWidth = strokeWidth
                )
            }
        )
            {
            Text(
                text = "aujourd'hui".uppercase(),
               // style = TextStyle(textDecoration = TextDecoration.Underline),
                color = Color.White,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    // .border(width = 1.dp,
                    //  color = Color.Red, )
                    .padding(bottom = 10.dp)

            )
        }
        Box (modifier = Modifier
            //.background(color = Color.Red)
            .padding(bottom = 0.1.dp)
            .drawBehind {
                val strokeWidth = 2.dp.toPx()
                val y = size.height - strokeWidth / 2
                drawLine(
                    color = Color.White,
                    start = androidx.compose.ui.geometry.Offset(0f, y),
                    end = androidx.compose.ui.geometry.Offset(size.width, y),
                    strokeWidth = strokeWidth
                )
            }
        )
        {
            Text(
                text = "demain".uppercase(),
                // style = TextStyle(textDecoration = TextDecoration.Underline),
                color = Color.White,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    // .border(width = 1.dp,
                    //  color = Color.Red, )
                    .padding(bottom = 10.dp)

            )
        }
        Box (modifier = Modifier
            //.background(color = Color.Red)
            .padding(bottom = 0.1.dp)
            .drawBehind {
                val strokeWidth = 2.dp.toPx()
                val y = size.height - strokeWidth / 2
                drawLine(
                    color = Color.White,
                    start = androidx.compose.ui.geometry.Offset(0f, y),
                    end = androidx.compose.ui.geometry.Offset(size.width, y),
                    strokeWidth = strokeWidth
                )
            }
        )
        {
            Text(
                text = "prochainement".uppercase(),
                // style = TextStyle(textDecoration = TextDecoration.Underline),
                color = Color.White,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    // .border(width = 1.dp,
                    //  color = Color.Red, )
                    .padding(bottom = 10.dp)

            )
        }


    }
}