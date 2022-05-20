package com.example.teslageek

import android.R
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.teslageek.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        clickOnModelS()
        clickOnModel3()
        clickOnModelX()
        clickOnModelY()
    }

    private fun clickOnModelS() {
        binding.imageTeslaS.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("TextModelTesla", "Model S")
            intent.putExtra("TextTypeTesla", "Plaid")
            //intent.putExtra("picTesla", R.drawable.models)
            startActivity(intent)
        }
    }

    private fun clickOnModel3() {
        binding.imageTesla3.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("TextModelTesla", "Model 3")
            intent.putExtra("TextTypeTesla", "Performance")
            //intent.putExtra("picTesla", R.drawable.model3)
            startActivity(intent)
        }
    }

    private fun clickOnModelX() {
        binding.imageTeslaX.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("TextModelTesla", "Model X")
            intent.putExtra("TextTypeTesla", "Long range")
            //intent.putExtra("picTesla", R.drawable.modelx)
            startActivity(intent)
        }
    }

    private fun clickOnModelY() {
        binding.imageTeslaY.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("TextModelTesla", "Model Y")
            intent.putExtra("TextTypeTesla", "Standart Plus")
            //intent.putExtra("picTesla", R.drawable.modely)
            startActivity(intent)
        }
    }
}