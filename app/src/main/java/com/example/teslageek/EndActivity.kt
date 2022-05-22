package com.example.teslageek

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.teslageek.databinding.ActivityEndBinding
import com.example.teslageek.databinding.ActivityWheelsAndColorBinding

class EndActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityEndBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val intentToNext = intent
        val teslaName = intentToNext.getStringExtra("teslaName").toString()
        val teslaType = intentToNext.getStringExtra("teslaType").toString()
        binding.teslaName.text = teslaName
        binding.teslaType.text = teslaType
    }
}