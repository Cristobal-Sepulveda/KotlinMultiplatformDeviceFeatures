package com.example.composemultiplatformdevicefeatures.utils

import androidx.compose.runtime.Composable

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
expect class ImageCaptureFactory() {

    @Composable
    fun createImageCapture(): ImageCapture
}