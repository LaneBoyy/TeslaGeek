package com.example.teslageek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.teslageek.databinding.ActivityWheelsAndColorBinding

class WheelsAndColorActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityWheelsAndColorBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val intentToNext = intent
        val teslaModelName2 = intentToNext.getStringExtra("teslaName").toString()
        val teslaTypeName2 = intentToNext.getStringExtra("teslaType").toString()
        binding.teslaName.text = teslaModelName2
        binding.teslaType.text = teslaTypeName2

        when (teslaModelName2) {
            "Model S" -> {
                binding.teslaImage.setImageResource(R.drawable.teslaswhite2)
                binding.wheel1.setBackgroundResource(R.drawable.wheelsmodels19r)
                binding.wheel2.setBackgroundResource(R.drawable.wheelsmodels21r)
                binding.wheelName.setText(R.string.wheelsModelS21)
            }
            "Model 3" -> {
                binding.teslaImage.setImageResource(R.drawable.tesla3white2)
                binding.wheel1.setBackgroundResource(R.drawable.wheelsmodel318r)
                binding.wheel2.setBackgroundResource(R.drawable.wheelsmodel319r)
                binding.wheel3.setBackgroundResource(R.drawable.wheelsmodel320r)
                binding.wheelName.setText(R.string.wheelsModel319)
            }
            "Model X" -> {
                binding.teslaImage.setImageResource(R.drawable.teslaxwhite2)
                binding.wheel1.setBackgroundResource(R.drawable.wheelsmodelx20r)
                binding.wheel2.setBackgroundResource(R.drawable.wheelsmodelx22r)
                binding.wheelName.setText(R.string.wheelsModelX22)
            }
            "Model Y" -> {
                binding.teslaImage.setImageResource(R.drawable.teslaywhite2)
                binding.wheel1.setBackgroundResource(R.drawable.wheelsmodely19r)
                binding.wheel2.setBackgroundResource(R.drawable.wheelsmodely20r)
                binding.wheel3.setBackgroundResource(R.drawable.wheelsmodely21r)
                binding.wheelName.setText(R.string.wheelsModelY20)
            }
        }

        clickOnWhite()
        clickOnGrey()
        clickOnBlue()
        clickOnBlack()
        clickOnRed()
        clickOnWheel1()
        clickOnWheel2()
        clickOnWheel3()
    }

    private fun clickOnWhite() {
        binding.white.setOnClickListener {
            binding.colorName.setText(R.string.white)
            when (binding.teslaName.text) {
                "Model S" -> binding.teslaImage.setImageResource(R.drawable.teslaswhite2)
                "Model 3" -> binding.teslaImage.setImageResource(R.drawable.tesla3white2)
                "Model X" -> binding.teslaImage.setImageResource(R.drawable.teslaxwhite2)
                "Model Y" -> binding.teslaImage.setImageResource(R.drawable.teslaywhite2)
            }
        }
    }

    private fun clickOnGrey() {
        binding.grey.setOnClickListener {
            binding.colorName.setText(R.string.grey)
            when (binding.teslaName.text) {
                "Model S" -> binding.teslaImage.setImageResource(R.drawable.teslasgrey2)
                "Model 3" -> binding.teslaImage.setImageResource(R.drawable.tesla3grey2)
                "Model X" -> binding.teslaImage.setImageResource(R.drawable.teslaxgrey2)
                "Model Y" -> binding.teslaImage.setImageResource(R.drawable.teslaygrey2)
            }
        }
    }

    private fun clickOnBlue() {
        binding.blue.setOnClickListener {
            binding.colorName.setText(R.string.blue)
            when (binding.teslaName.text) {
                "Model S" -> binding.teslaImage.setImageResource(R.drawable.teslasblue2)
                "Model 3" -> binding.teslaImage.setImageResource(R.drawable.tesla3blue2)
                "Model X" -> binding.teslaImage.setImageResource(R.drawable.teslaxblue2)
                "Model Y" -> binding.teslaImage.setImageResource(R.drawable.teslayblue2)
            }
        }
    }

    private fun clickOnBlack() {
        binding.black.setOnClickListener {
            binding.colorName.setText(R.string.black)
            when (binding.teslaName.text) {
                "Model S" -> binding.teslaImage.setImageResource(R.drawable.tesla_s_black_2)
                "Model 3" -> binding.teslaImage.setImageResource(R.drawable.tesla_3_black_2)
                "Model X" -> binding.teslaImage.setImageResource(R.drawable.teslaxblack2)
                "Model Y" -> binding.teslaImage.setImageResource(R.drawable.teslayblack2)
            }
        }
    }

    private fun clickOnRed() {
        binding.red.setOnClickListener {
            binding.colorName.setText(R.string.red)
            when (binding.teslaName.text) {
                "Model S" -> binding.teslaImage.setImageResource(R.drawable.teslasred2)
                "Model 3" -> binding.teslaImage.setImageResource(R.drawable.tesla3red2)
                "Model X" -> binding.teslaImage.setImageResource(R.drawable.teslaxred2)
                "Model Y" -> binding.teslaImage.setImageResource(R.drawable.teslayred2)
            }
        }
    }

    private fun clickOnWheel1() {
        binding.wheel1.setOnClickListener {
            when (binding.teslaName.text) {
                "Model S" -> {
                    binding.wheelName.setText(R.string.wheelsModelS19)
                }
                "Model 3" -> {
                    binding.wheelName.setText(R.string.wheelsModel318)
                }
                "Model X" -> {
                    binding.wheelName.setText(R.string.wheelsModelX20)
                }
                "Model Y" -> {
                    binding.wheelName.setText(R.string.wheelsModelY19)
                }
            }
        }
    }

    private fun clickOnWheel2() {
        binding.wheel2.setOnClickListener {
            when (binding.teslaName.text) {
                "Model S" -> {
                    binding.wheelName.setText(R.string.wheelsModelS21)
                }
                "Model 3" -> {
                    binding.wheelName.setText(R.string.wheelsModel319)
                }
                "Model X" -> {
                    binding.wheelName.setText(R.string.wheelsModelX22)
                }
                "Model Y" -> {
                    binding.wheelName.setText(R.string.wheelsModelY19)
                }
            }
        }
    }

    private fun clickOnWheel3() {
        binding.wheel3.setOnClickListener {
            when (binding.teslaName.text) {
                "Model S" -> {
                    binding.wheelName.setText(R.string.wheelsModelS21)
                }
                "Model 3" -> {
                    binding.wheelName.setText(R.string.wheelsModel320)
                }
                "Model X" -> {
                    binding.wheelName.setText(R.string.wheelsModelX22)
                }
                "Model Y" -> {
                    binding.wheelName.setText(R.string.wheelsModelY21)
                }
            }
        }
    }
}