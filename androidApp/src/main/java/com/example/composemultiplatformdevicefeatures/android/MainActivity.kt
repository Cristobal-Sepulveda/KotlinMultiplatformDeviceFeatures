package com.example.composemultiplatformdevicefeatures.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composemultiplatformdevicefeatures.DeviceFeaturesApp
import com.example.composemultiplatformdevicefeatures.ui.screens.HomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DeviceFeaturesApp(
                darkTheme = isSystemInDarkTheme(),
                dynamicColor = true
            )
        }
    }
}
