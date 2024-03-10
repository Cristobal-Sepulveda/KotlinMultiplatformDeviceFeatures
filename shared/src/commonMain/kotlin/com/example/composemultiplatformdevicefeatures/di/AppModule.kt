package com.example.composemultiplatformdevicefeatures.di

import com.example.composemultiplatformdevicefeatures.utils.ImageCaptureFactory
import org.koin.dsl.module

val sharedModule = module {
    single { ImageCaptureFactory() }
}

fun appModule() = listOf(sharedModule)