package com.example.meteoapp.components

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material.icons.outlined.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.flow.MutableStateFlow

@SuppressLint("StateFlowValueCalledInComposition")
@Composable
fun Header() {
    val text = MutableStateFlow<String>("")
    Row(
        verticalAlignment = Alignment.CenterVertically,
       // horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 10.dp)
            //.background(color = Color.Blue)
    ) {
        Row {

            Icon(
                Icons.Outlined.LocationOn,
                contentDescription = "localisation",
                modifier = Modifier.size(50.dp),
                tint = Color.Black
            )
            TextField(
                value = text.value,

                onValueChange = {s:String->text.value=s},
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = Color(0x60FFFFFF),
                    unfocusedIndicatorColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                ),
                modifier = Modifier
                    .border(width = 1.dp, color = Color.Transparent)
                    .weight(5f)
                    .clip(RoundedCornerShape(100))
            )
            Icon(
                    Icons.Outlined.Share,
            contentDescription = "partager",
            modifier = Modifier.size(50.dp).padding(start = 15.dp
            ),
            tint = Color.Black,

            )
        }

    }
}


