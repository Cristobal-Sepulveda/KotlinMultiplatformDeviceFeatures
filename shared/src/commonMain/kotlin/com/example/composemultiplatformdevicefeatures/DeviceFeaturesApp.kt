package com.example.composemultiplatformdevicefeatures

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.composemultiplatformdevicefeatures.presentation.navigation.DeviceFeaturesAppNavigation
import com.example.composemultiplatformdevicefeatures.ui.theme.DeviceFeaturesAppTheme
import moe.tlaster.precompose.navigation.rememberNavigator

@Composable
fun DeviceFeaturesApp(
    darkTheme: Boolean,
    dynamicColor: Boolean,
) {
    DeviceFeaturesAppTheme(
        darkTheme = darkTheme,
        dynamicColor = dynamicColor
    ) {
        val navigator = rememberNavigator()

        Scaffold { innerPadding ->
            DeviceFeaturesAppNavigation(
                navigator = navigator,
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
}