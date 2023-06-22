package com.example.bottomnavigation_compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp


@Composable
fun PantallaInicio() {
    /*Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Blue)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .align(Alignment.Center),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Pantalla Inicio", fontSize = 20.sp, color = Color.White)
        }
    }*/
    var fecha by remember { mutableStateOf("") }
    var altitud by remember { mutableStateOf("") }
    var profundidad by remember { mutableStateOf("") }
    var presion by remember { mutableStateOf("") }
    var temperatura by remember { mutableStateOf("") }



    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.LightGray)
    )
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
    ) {
        Text(
            text = "Ingreso de datos",
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(25.dp))

        OutlinedTextField(
            value = fecha,
            onValueChange = { fecha = it },
            label = { Text("Fecha") }
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = altitud,
            onValueChange = { altitud = it },
            label = { Text("Altitud") }
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = profundidad,
            onValueChange = { profundidad = it },
            label = { Text("Profundidad") }
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = presion,
            onValueChange = { presion = it },
            label = { Text("Presion") }
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = temperatura,
            onValueChange = { temperatura = it },
            label = { Text("Temperatura") }
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { /* Acción al hacer clic en el botón */ },
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Text("Enviar")
        }
    }
}