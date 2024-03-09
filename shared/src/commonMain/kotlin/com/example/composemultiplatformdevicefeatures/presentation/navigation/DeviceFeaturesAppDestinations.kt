package com.example.composemultiplatformdevicefeatures.presentation.navigation


interface DeviceFeaturesAppDestination {
    val route: String
}

object HomeScreen : DeviceFeaturesAppDestination {
    override val route = "home"
}