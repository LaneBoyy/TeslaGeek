package com.example.teslageek

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class TeslaResult(
    val teslaName: String,
    val teslaType: String,
    val powerReserve: String,
    val acceleration: String,
    val maxSpeed: String,
    val colorName: String,
    val wheelsName: String,
    val teslaBitmap: String?
): Parcelable