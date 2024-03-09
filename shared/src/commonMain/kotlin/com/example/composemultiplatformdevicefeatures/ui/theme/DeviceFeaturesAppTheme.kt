package com.example.composemultiplatformdevicefeatures.ui.theme

import androidx.compose.runtime.Composable

@Composable
expect fun DeviceFeaturesAppTheme(
    darkTheme: Boolean,
    dynamicColor: Boolean,
    content: @Composable () -> Unit
)