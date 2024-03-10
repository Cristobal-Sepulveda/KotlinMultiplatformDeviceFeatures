package com.example.composemultiplatformdevicefeatures.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.composemultiplatformdevicefeatures.utils.ImageCapture

@Composable
fun HomeScreen(
    title: String,
    imageCapture: ImageCapture
) {
    var openCamera by remember { mutableStateOf(false) }

    if (openCamera) {
        imageCapture.takePicture()
        openCamera = false
    }

    Column {
        Text(text = title)
        Button(onClick = { openCamera = true }) {
            Text(text = "Button")
        }
    }
}
