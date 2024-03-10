package com.example.composemultiplatformdevicefeatures.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.composemultiplatformdevicefeatures.ui.screens.HomeScreen
import com.example.composemultiplatformdevicefeatures.utils.ImageCapture
import com.example.composemultiplatformdevicefeatures.utils.ImageCaptureFactory
import moe.tlaster.precompose.koin.koinViewModel
import moe.tlaster.precompose.navigation.NavHost
import moe.tlaster.precompose.navigation.Navigator
import moe.tlaster.precompose.navigation.transition.NavTransition
import org.koin.compose.koinInject

@Composable
fun DeviceFeaturesAppNavigation(
    navigator: Navigator,
    modifier: Modifier
) {
    val imageCaptureFactory: ImageCaptureFactory = koinInject()
    val imageCapture: ImageCapture = imageCaptureFactory.createImageCapture()

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
                title = "Hello, Android!".uppercase(),
                imageCapture = imageCapture
            )
        }
    }
}