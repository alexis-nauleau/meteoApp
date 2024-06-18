package com.example.meteoapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.Share
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.meteoapp.ui.theme.MeteoAppTheme
import kotlinx.coroutines.flow.MutableStateFlow

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
                            Box(
                                Modifier
                                    .weight(1f)
                            ) {
                                Header()
                            }
                            Spacer(Modifier.weight(2.25f))
                            Box(
                                Modifier
                                    .background(Color(0xFF1B7FA0))
                                    .fillMaxWidth()
                                    .weight(2.5f)

                            ) {
                                Middle()
                            }
                            Spacer(Modifier.weight(2.25f))
                            Box(
                                Modifier

                                    .fillMaxWidth()
                                    .weight(2f)
                            )
                            {
                                Footer()
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Footer(modifier: Modifier = Modifier) {
    val scrollState = rememberScrollState()


    Row(
        modifier = modifier

            .fillMaxSize()
            .padding(start = 10.dp)
            .horizontalScroll(state = scrollState)
    ) {
        MaBox()
        MaBox()
        MaBox()
        MaBox()
        MaBox()

    }
}

@Composable
public fun MaBox() {
    val arr = arrayOf(
        R.drawable.imag1,
        R.drawable.image2,
        R.drawable.image3,
        R.drawable.image4
    )
    Box(
        Modifier
            .background(Color.Yellow)
            .width(150.dp)
            .padding(end = 10.dp)
    )
    {
        Column {
            Image(
                painter = painterResource(id = R.drawable.image2), contentDescription = null,
                modifier = Modifier
                    .size(width = 200.dp, height = 150.dp)
                    .align(Alignment.CenterHorizontally)

            )
            Text(
                text = "title",
                style = TextStyle(fontSize = 20.sp),
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)

            )
        }
    }
}

@SuppressLint("StateFlowValueCalledInComposition")
@Composable
fun Header() {
    val text = MutableStateFlow<String>("")
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxHeight()
            .padding(horizontal = 15.dp)
    ) {
        Column {
            Icon(
                Icons.Outlined.Search,
                contentDescription = "recherche",
                modifier = Modifier
                    .weight(1f)
                    .size(50.dp),
                tint = Color.White,

                )
            Icon(
                Icons.Outlined.Share,
                contentDescription = "partager",
                modifier = Modifier
                    .weight(1f)
                    .size(50.dp),
                tint = Color.White
            )
        }
        Box(modifier = Modifier.weight(1f))
        TextField(
            value = text.value,

            onValueChange = { s: String -> text.value = s },
            colors = TextFieldDefaults.colors(
                unfocusedContainerColor = Color(0x60FFFFFF),
                unfocusedIndicatorColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent,
            ),
            modifier = Modifier
                .border(width = 0.dp, color = Color.Transparent)
                .weight(5f)
                .clip(RoundedCornerShape(100))
        )
    }
}


@Composable
fun Middle(

    modifier: Modifier = Modifier
) {
    val configuration = LocalConfiguration.current
    val screenHeight = configuration.screenHeightDp.dp
    val desiredHeight = (screenHeight / 4) // 1/4 eme de l'écran

    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(desiredHeight)
            .padding(horizontal = 16.dp), // ajuste l'emplacement du texte
        contentAlignment = Alignment.Center
    ) {
        Column {
            Text(
                text = "title".uppercase(),
                style = TextStyle(fontSize = 28.sp)
            )

            Row {
                Icon(
                    Icons.Outlined.Star,
                    contentDescription = "star",

                    )
                Icon(
                    Icons.Outlined.Star,
                    contentDescription = "star",

                    )
                Icon(
                    Icons.Outlined.Star,
                    contentDescription = "star",

                    )
                Icon(
                    Icons.Outlined.Star,
                    contentDescription = "star",

                    )
            }
            Text(
                text = "Lorem ipsum dolor sit amet consectetur," +
                        " adipisicing elit. Incidunt modi quos illum" +

                        " asperiores illum qui veniam aspernatur? Officiis" +
                        " quidem neque enim culpa hic?",
                style = TextStyle(fontSize = 20.sp)
            )
        }

    }
}
