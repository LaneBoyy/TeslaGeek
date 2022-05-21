package com.example.teslageek

import android.content.Intent
import android.os.Bundle
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
            intent.putExtra("ImgTesla", R.drawable.tesla_s_white_2)
            startActivity(intent)
        }
    }

    private fun clickOnModel3() {
        binding.imageTesla3.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("TextModelTesla", "Model 3")
            intent.putExtra("ImgTesla", R.drawable.tesla_3_white_2)
            startActivity(intent)
        }
    }

    private fun clickOnModelX() {
        binding.imageTeslaX.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("TextModelTesla", "Model X")
            intent.putExtra("ImgTesla", R.drawable.tesla_x_white_2)
            startActivity(intent)
        }
    }

    private fun clickOnModelY() {
        binding.imageTeslaY.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("TextModelTesla", "Model Y")
            intent.putExtra("ImgTesla", R.drawable.tesla_y_white_2)
            startActivity(intent)
        }
    }
}