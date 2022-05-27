package com.example.teslageek

import android.annotation.SuppressLint
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.teslageek.databinding.ActivityEndBinding
import java.io.FileInputStream

class EndActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityEndBinding.inflate(layoutInflater)
    }

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val teslaResult = intent.getParcelableExtra<TeslaResult>("resultKey")!!

        with(teslaResult) {
            binding.teslaName.text = teslaName
            binding.teslaType.text = teslaType
            binding.fullNameTesla.text = ("$teslaName   $teslaType")
            binding.powerReserve.text = ("Дальность хода:  $powerReserve")
            binding.accelerate.text = ("Ускорение 0-100:  $acceleration")
            binding.maxSpeed.text = ("Макс. скорость:  $maxSpeed")
            binding.endColor.text = ("Цвет:  $colorName")
            binding.endWheels.text = ("Диски:  $wheelsName")

            if (teslaBitmap != null) {
                binding.teslaImage.setImageBitmap(teslaBitmap.getBitmapByName())
            }
        }
    }

    private fun String.getBitmapByName(): Bitmap? {
        try {
            val bitmap: Bitmap
            val inputStream: FileInputStream = openFileInput(this)
            bitmap = BitmapFactory.decodeStream(inputStream)
            inputStream.close()
            return bitmap
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return null
    }
}