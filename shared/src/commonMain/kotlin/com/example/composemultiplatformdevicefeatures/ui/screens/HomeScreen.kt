package com.example.composemultiplatformdevicefeatures.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun HomeScreen(
    title: String
) {
    Column{
        Text(text = title)
    }
}
