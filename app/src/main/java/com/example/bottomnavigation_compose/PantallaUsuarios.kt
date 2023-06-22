package com.example.bottomnavigation_compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PantallaUsuarios() {
    /*Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Red)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .align(Alignment.Center),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Pantalla Usuarios", fontSize = 20.sp, color = Color.White)
        }
    }*/
    Column() {
        Text(
            text = "Registros",
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(25.dp))


        Column() {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .fillMaxSize()
                    .size(width = 350.dp, height = 100.dp)
                    .background(color = Color.DarkGray)
                    .wrapContentSize(Alignment.Center)



            ) {
                Row() {
                    Text(text = "Img")
                    Text(text = "Sensor X dice:")
                    Text(text = "Hace N horas")
                }
            }
        }
    }
}