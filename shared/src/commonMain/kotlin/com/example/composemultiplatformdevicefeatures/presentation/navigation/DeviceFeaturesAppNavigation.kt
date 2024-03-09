package com.example.composemultiplatformdevicefeatures.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.composemultiplatformdevicefeatures.ui.screens.HomeScreen
import moe.tlaster.precompose.navigation.NavHost
import moe.tlaster.precompose.navigation.Navigator
import moe.tlaster.precompose.navigation.transition.NavTransition

@Composable
fun DeviceFeaturesAppNavigation(
    navigator: Navigator,
    modifier: Modifier
) {
    NavHost(
        navigator = navigator,
        initialRoute = HomeScreen.route,
        modifier = modifier,
        navTransition = NavTransition()
    ) {
        scene(
            route = HomeScreen.route,
            navTransition = NavTransition(),
        ){
            HomeScreen(
                title = "Hello, Android!"
            )
        }
    }
}