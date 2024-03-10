package com.example.composemultiplatformdevicefeatures.utils

import android.Manifest
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.provider.MediaStore
import androidx.core.app.ActivityCompat
import androidx.core.app.ComponentActivity
import androidx.core.content.ContextCompat

private const val CAMERA_PERMISSION = Manifest.permission.CAMERA
private const val REQUEST_CODE_PERMISSIONS = 10

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual class ImageCapture(
    private val activity: ComponentActivity,
    private val context: Context
){
    actual fun takePicture() {
        val cameraPermissionGranted = ContextCompat
            .checkSelfPermission(context, CAMERA_PERMISSION) == PackageManager.PERMISSION_GRANTED

        when (cameraPermissionGranted) {
            true -> {
                openCamera()
            }

            false -> {
                ActivityCompat.requestPermissions(
                    activity,
                    arrayOf(CAMERA_PERMISSION),
                    REQUEST_CODE_PERMISSIONS
                )
            }
        }
    }
    private fun openCamera() {
        val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        val isCameraAvailable = takePictureIntent.resolveActivity(context.packageManager)
        if (isCameraAvailable == null) {
            println("no camera app is available")
        } else {
            activity.startActivityForResult(takePictureIntent, 1)
        }
    }
}



