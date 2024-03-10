package com.example.composemultiplatformdevicefeatures

import android.app.Application
import com.example.composemultiplatformdevicefeatures.di.appModule
import org.koin.core.context.startKoin

class KoinInitializer: Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            modules(
                appModule()
            )
        }
    }
}