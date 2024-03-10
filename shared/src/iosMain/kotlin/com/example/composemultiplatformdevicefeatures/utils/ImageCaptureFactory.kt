package com.example.composemultiplatformdevicefeatures.utils

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual class ImageCaptureFactory {
    @Composable
    actual fun createImageCapture(): ImageCapture {
        return remember { ImageCapture() }
    }
}