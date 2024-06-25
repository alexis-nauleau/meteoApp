package com.example.meteoapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.meteoapp.components.pagess.JourCinq
import com.example.meteoapp.components.pagess.JourDeux
import com.example.meteoapp.components.pagess.JourQuatre
import com.example.meteoapp.components.pagess.JourTrois
import com.example.meteoapp.components.pagess.JourUn

@Composable
fun Menu() {
    val navController = rememberNavController()
    Column(

        modifier = Modifier
            .background(color = Color.White.copy(alpha = 0.01f))
            // .background(color = Color.Red)
            .fillMaxHeight()
            .fillMaxSize()
            .padding(horizontal = 10.dp)

    )
    ////////////////////////////////////////////////
    {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.Bottom, modifier = Modifier
                // .background(color = Color.Yellow )
                .fillMaxWidth()
        ) {
            Box(modifier = Modifier
                .background(Color(0x4D771717))
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
                })
            {
                Button(
                    modifier = Modifier

                        .background(color = Color.Transparent),
                    onClick = { navController.navigate("first") },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Transparent, contentColor = Color.Black
                    ),
                ) {
                    Text("un")
                }
            }
            /////////////////////////////////////////////////////////////////////////
            Box(modifier = Modifier
                .background(color = Color.Green)
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
                }) {
                Button(
                    modifier = Modifier

                        .background(color = Color.Transparent),
                    onClick = { navController.navigate("second") },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Transparent, contentColor = Color.Black
                    ),
                ) {
                    Text("deux")
                }
            }
            //////////////////////////////////////////////////////////////////////////////
            Box(modifier = Modifier
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
                }) {
                Button(
                    modifier = Modifier

                        .background(color = Color.Transparent),
                    onClick = { navController.navigate("third") },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Transparent, contentColor = Color.Black
                    ),
                ) {
                    Text("trois")
                }

                //////////////////////////////////////////////////////////////////////////////
            }
            Box(modifier = Modifier
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
                }) {
                Button(
                    modifier = Modifier

                        .background(color = Color.Transparent),
                    onClick = { navController.navigate("fourth") },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Transparent, contentColor = Color.Black
                    ),
                ) {
                    Text("quadtree")
                }
            }
            /////////////////////////////////////////////
            Box(modifier = Modifier
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
                }) {
                Button(
                    modifier = Modifier

                        .background(color = Color.Transparent),
                    onClick = { navController.navigate("fifth") },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Transparent, contentColor = Color.Black
                    ),
                ) {
                    Text("cinq")
                }
            }

        }


        NavHost(navController = navController, startDestination = "first") {
            composable("first") { JourUn (navController) }
            composable("second") { JourDeux (navController) }
            composable("third") { JourTrois (navController) }
            composable("fourth") { JourQuatre (navController) }
            composable("fifth") { JourCinq (navController) }

        }
    }
}