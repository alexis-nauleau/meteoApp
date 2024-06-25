package com.example.meteoapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Middle(
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp)
            .background(Color.Transparent)
            ,
        contentAlignment = Alignment.Center
    ) {
        Column {
            Row(horizontalArrangement = Arrangement.SpaceBetween,
                modifier = modifier
                     .background(Color.Transparent)
                    .fillMaxWidth()
                    .weight(0.3f)
            ) {
                Text(
                    modifier = modifier
                        .padding(top = 15.dp)
                        .background(Color.Transparent),
                    text = "04/05/2024 ",
                    style = TextStyle(fontSize = 28.sp),
                    color = Color.White,
                )
                Text(
                    modifier = modifier
                        .padding(top = 15.dp),
                    text = "25:78 Kandor",
                    style = TextStyle(fontSize = 28.sp),
                    color = Color.White,
                )
            }
            //-------------------------------------
            Spacer(Modifier.weight(0.35f))
            //-----------------------------------------
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = modifier
                   // .background(Color.Magenta)
                    .fillMaxWidth()
                    .weight(2f)
            ) {
               Temp()

            }
            //--------------------------------------
            Row( horizontalArrangement = Arrangement.SpaceBetween,
                modifier = modifier
                    // .background(Color.Green)
                    .fillMaxWidth()
                    .weight(1F)
            ) {
                ItemList()

            }
            //---------------------------------------
            Row (horizontalArrangement = Arrangement.SpaceAround,
                modifier = modifier
                   .weight(2f)
                    .fillMaxWidth()
            ){
                Sun()
            }
        }
    }
}