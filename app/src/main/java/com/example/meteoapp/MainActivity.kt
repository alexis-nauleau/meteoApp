package com.example.meteoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.meteoapp.components.Header
import com.example.meteoapp.components.Menu
import com.example.meteoapp.components.Middle
import com.example.meteoapp.ui.theme.MeteoAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MeteoAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(
                        Modifier
                            .background(Color(0xFF72ABBE))
                            .fillMaxSize()
                            .padding(innerPadding)

                        //image de fond
                        // .paint(painterResource(id = R.drawable.image3),contentScale = ContentScale.FillHeight)

                    ) {
                        Column {
                            Row(
                                Modifier
                                    .weight(1f)
                            ) {
                                Header()

                            }
                            Row(
                                Modifier
                                    .weight(0.5f)
                            ) {
                                Menu()
                            }
                            // Spacer(Modifier.weight(1.25f))
                            Box(
                                Modifier
                                    .background(Color(0xFF1B7FA0))
                                    .fillMaxWidth()
                                    .weight(7f)

                            ) {
                                Middle()
                            }
                            //Spacer(Modifier.weight(2.25f))
                            Box(
                                Modifier
                                    .fillMaxWidth()
                                    .weight(2f)
                            )
                        }
                    }
                }
            }
        }
    }
}