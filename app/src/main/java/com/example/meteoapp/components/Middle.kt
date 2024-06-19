package com.example.meteoapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
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
        contentAlignment = Alignment.Center
    ) {
        Column {
            Row(
                modifier = modifier
                   // .background(Color.Cyan)
                    .fillMaxWidth()
                    .weight(0.3f)

            ) {
                Text(
                    modifier = modifier
                        .padding(top = 5.dp),
                    text = "Date",
                    style = TextStyle(fontSize = 28.sp)
                )
            }
            Spacer(Modifier.weight(0.35f))
            //-----------------------------------------
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = modifier
                   // .background(Color.Magenta)
                    .fillMaxWidth()
                    .weight(2f)
            ) {
                Column(
                    modifier = modifier
                      //  .background(Color.Gray)
                        .width(200.dp)
                ) {
                    Text(
                        text = "https://api.openweathermap.org/data/3.0/onecall/day_summary?current.temp={lat}&appid={27eecac1c8db4978855d8a6efda65f5e}",
                        style = TextStyle(fontSize = 90.sp)
                    )
                    Text(
                        text = "Ressenti",
                        style = TextStyle(fontSize = 20.sp)
                    )
                }
                Column(
                    modifier = modifier
                       // .background(Color.Yellow)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.image2),
                        contentDescription = null,
                        modifier = Modifier
                            .size(width = 200.dp, height = 150.dp)
                    )

                }


            }
            //--------------------------------------
            Row( horizontalArrangement = Arrangement.SpaceBetween,

                modifier = modifier
                    .background(Color.Green)
                    .fillMaxWidth()
                    .weight(1F)
            ) {
                Column (horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(
                        painter = painterResource(id = R.drawable.icone),
                        contentDescription = null,
                        modifier = Modifier
                            .size(70.dp)
                            .clip(CircleShape)
                    )
                    Text(
                        text = "Visibility",
                        style = TextStyle(fontSize = 20.sp)
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
                        style = TextStyle(fontSize = 20.sp)
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
                        style = TextStyle(fontSize = 20.sp)
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
                        style = TextStyle(fontSize = 20.sp)
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
                        style = TextStyle(fontSize = 20.sp)
                    )
                }

            }
            //---------------------------------------
            Row ( horizontalArrangement = Arrangement.SpaceAround,
                modifier = modifier
                   // .background(Color.LightGray)
                    .fillMaxWidth()
                    .weight(1F)
            ){
                Column (horizontalAlignment = Alignment.CenterHorizontally){
                    Image(
                        painter = painterResource(id = R.drawable.sun),
                        contentDescription = null,
                        modifier = Modifier
                            .size(70.dp)
                            .clip(CircleShape)
                    )
                    Text(
                        text = "Levé ",
                        style = TextStyle(fontSize = 20.sp),
                       // textAlign = TextAlign.Center


                    )
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(
                        painter = painterResource(id = R.drawable.sun),
                        contentDescription = null,
                        modifier = Modifier
                            .size(70.dp)
                            .clip(CircleShape)
                    )
                    Text(
                        text = "Couché",
                        style = TextStyle(fontSize = 20.sp)
                    )
                }




            }

        }
    }
}