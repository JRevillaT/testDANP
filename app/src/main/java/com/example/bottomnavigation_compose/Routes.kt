package com.example.bottomnavigation_compose

sealed class Routes (val titulo: String, val icon: Int, val route: String) {
    object PantallaInicio: Routes("Inicio", R.drawable.icon_home, "inicio")
    object PantallaUsuarios: Routes("Registros", R.drawable.icon_user, "registros")
}