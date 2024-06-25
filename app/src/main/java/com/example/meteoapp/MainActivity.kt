package com.example.meteoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

import com.example.meteoapp.components.Header
import com.example.meteoapp.components.Localisation
import com.example.meteoapp.components.Menu
import com.example.meteoapp.components.Middle
import com.example.meteoapp.ui.theme.MeteoAppTheme
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices


class MainActivity : ComponentActivity() {
    private lateinit var fusedLocationClient: FusedLocationProviderClient

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this)

        enableEdgeToEdge()
        setContent {
            MeteoAppTheme {

                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(
                        Modifier

                            .background(Color(0xFF174B77))
                            .fillMaxSize()
                            .padding(innerPadding)

                        //image de fond
                        // .paint(painterResource(id = R.drawable.image3),contentScale = ContentScale.FillHeight)

                    ) {
                        Column  {

                            Row(
                                Modifier
                                    .weight(1f)
                            ) {
                                Header()

                            }
                            Row(
                                Modifier
                                    .weight(5.5f)
                            ) {
                               Menu()

                            }
                          //  Spacer(Modifier.weight(0.1f))
                           // Box(
                              //  Modifier
                                   // .background(color = Color.White.copy(alpha = 0.01f))
                                   // .fillMaxWidth()
                                   // .weight(7f)

                          //  ) {

                               // Middle()
                            }
                            //Spacer(Modifier.weight(2.25f))
                          //  Box(
                               // Modifier
                                   // .fillMaxWidth()
                                  //  .weight(2f)
                          //  )
                        }
                    }
                }
            }
        }

    }
//}