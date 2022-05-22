package com.example.teslageek

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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val teslaName = intent.getStringExtra("teslaName").toString()
        val teslaType = intent.getStringExtra("teslaType").toString()
        val teslaBitmap = intent.getStringExtra("teslaBitmap")?.getBitmapByName()
        binding.teslaName.text = teslaName
        binding.teslaType.text = teslaType
        if (teslaBitmap != null) {
            binding.teslaImage.setImageBitmap(teslaBitmap)
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