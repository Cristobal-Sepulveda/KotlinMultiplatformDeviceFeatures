package com.example.composemultiplatformdevicefeatures.utils

import androidx.activity.ComponentActivity
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual class ImageCaptureFactory {
    @Composable
    actual fun createImageCapture(): ImageCapture {
        val activity = LocalContext.current as ComponentActivity
        val context = LocalContext.current
        return remember(activity, context) {
            ImageCapture(activity, context)
        }
    }
}