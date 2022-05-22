package com.example.teslageek

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.graphics.drawable.toBitmap
import androidx.core.view.drawToBitmap
import com.example.teslageek.databinding.ActivityWheelsAndColorBinding
import java.io.ByteArrayOutputStream

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
                binding.teslaImage.setImageResource(R.drawable.tesla_s_white_2)
                binding.wheel1.setBackgroundResource(R.drawable.wheels_model_s_19r)
                binding.wheel2.setBackgroundResource(R.drawable.wheels_model_s_21r)
                binding.wheelName.setText(R.string.wheels_Model_S_21)
                binding.wheel3.visibility = View.GONE
            }
            "Model 3" -> {
                binding.teslaImage.setImageResource(R.drawable.tesla_3_white_2)
                binding.wheel1.setBackgroundResource(R.drawable.wheels_model_3_18r)
                binding.wheel2.setBackgroundResource(R.drawable.wheels_model_3_19r)
                binding.wheel3.setBackgroundResource(R.drawable.wheels_model_3_20r)
                binding.wheelName.setText(R.string.wheels_Model_3_19)
            }
            "Model X" -> {
                binding.teslaImage.setImageResource(R.drawable.tesla_x_white_2)
                binding.wheel1.setBackgroundResource(R.drawable.wheels_model_x_20r)
                binding.wheel2.setBackgroundResource(R.drawable.wheels_model_x_22r)
                binding.wheelName.setText(R.string.wheels_Model_X_22)
                binding.wheel3.visibility = View.GONE
            }
            "Model Y" -> {
                binding.teslaImage.setImageResource(R.drawable.tesla_y_white_2)
                binding.wheel1.setBackgroundResource(R.drawable.wheels_model_y_19r)
                binding.wheel2.setBackgroundResource(R.drawable.wheels_model_y_20r)
                binding.wheel3.setBackgroundResource(R.drawable.wheels_model_y_21r)
                binding.wheelName.setText(R.string.wheels_Model_Y_20)
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
        clickOnArrow()
    }

    private fun clickOnWhite() {
        binding.white.setOnClickListener {
            binding.colorName.setText(R.string.white)
            when (binding.teslaName.text) {
                "Model S" -> when (binding.wheelName.text) {
                    "19r Tempest Wheels" -> binding.teslaImage.setImageResource(R.drawable.tesla_s_white_1)
                    "21r Arachnid Wheels" -> binding.teslaImage.setImageResource(R.drawable.tesla_s_white_2)
                }
                "Model 3" -> when (binding.wheelName.text) {
                    "18r Aero Wheels" -> binding.teslaImage.setImageResource(R.drawable.tesla_3_white_1)
                    "19r Sport Wheels" -> binding.teslaImage.setImageResource(R.drawable.tesla_3_white_2)
                    "20r Überturbine Wheels" -> binding.teslaImage.setImageResource(R.drawable.tesla_3_white_3)
                }
                "Model X" -> when (binding.wheelName.text) {
                    "20r Cyberstream Wheels" -> binding.teslaImage.setImageResource(R.drawable.tesla_x_white_1)
                    "22r Turbine Wheels" -> binding.teslaImage.setImageResource(R.drawable.tesla_x_white_2)
                }
                "Model Y" -> when (binding.wheelName.text) {
                    "19r Gemini Wheels" -> binding.teslaImage.setImageResource(R.drawable.tesla_y_white_1)
                    "20r Induction Wheels" -> binding.teslaImage.setImageResource(R.drawable.tesla_y_white_2)
                    "21r Überturbine Wheels" -> binding.teslaImage.setImageResource(R.drawable.tesla_y_white_3)
                }
            }
        }
    }

    private fun clickOnGrey() {
        binding.grey.setOnClickListener {
            binding.colorName.setText(R.string.grey)
            when (binding.teslaName.text) {
                "Model S" -> when (binding.wheelName.text) {
                    "19r Tempest Wheels" -> binding.teslaImage.setImageResource(R.drawable.tesla_s_grey_1)
                    "21r Arachnid Wheels" -> binding.teslaImage.setImageResource(R.drawable.tesla_s_grey_2)
                }
                "Model 3" -> when (binding.wheelName.text) {
                    "18r Aero Wheels" -> binding.teslaImage.setImageResource(R.drawable.tesla_3_grey_1)
                    "19r Sport Wheels" -> binding.teslaImage.setImageResource(R.drawable.tesla_3_grey_2)
                    "20r Überturbine Wheels" -> binding.teslaImage.setImageResource(R.drawable.tesla_3_grey_3)
                }
                "Model X" -> when (binding.wheelName.text) {
                    "20r Cyberstream Wheels" -> binding.teslaImage.setImageResource(R.drawable.tesla_x_grey_1)
                    "22r Turbine Wheels" -> binding.teslaImage.setImageResource(R.drawable.tesla_x_grey_2)
                }
                "Model Y" -> when (binding.wheelName.text) {
                    "19r Gemini Wheels" -> binding.teslaImage.setImageResource(R.drawable.tesla_y_grey_1)
                    "20r Induction Wheels" -> binding.teslaImage.setImageResource(R.drawable.tesla_y_grey_2)
                    "21r Überturbine Wheels" -> binding.teslaImage.setImageResource(R.drawable.tesla_y_grey_3)
                }
            }
        }
    }

    private fun clickOnBlue() {
        binding.blue.setOnClickListener {
            binding.colorName.setText(R.string.blue)
            when (binding.teslaName.text) {
                "Model S" -> when (binding.wheelName.text) {
                    "19r Tempest Wheels" -> binding.teslaImage.setImageResource(R.drawable.tesla_s_blue_1)
                    "21r Arachnid Wheels" -> binding.teslaImage.setImageResource(R.drawable.tesla_s_blue_2)
                }
                "Model 3" -> when (binding.wheelName.text) {
                    "18r Aero Wheels" -> binding.teslaImage.setImageResource(R.drawable.tesla_3_blue_1)
                    "19r Sport Wheels" -> binding.teslaImage.setImageResource(R.drawable.tesla_3_blue_2)
                    "20r Überturbine Wheels" -> binding.teslaImage.setImageResource(R.drawable.tesla_3_blue_3)
                }
                "Model X" -> when (binding.wheelName.text) {
                    "20r Cyberstream Wheels" -> binding.teslaImage.setImageResource(R.drawable.tesla_x_blue_1)
                    "22r Turbine Wheels" -> binding.teslaImage.setImageResource(R.drawable.tesla_x_blue_2)
                }
                "Model Y" -> when (binding.wheelName.text) {
                    "19r Gemini Wheels" -> binding.teslaImage.setImageResource(R.drawable.tesla_y_blue_1)
                    "20r Induction Wheels" -> binding.teslaImage.setImageResource(R.drawable.tesla_y_blue_2)
                    "21r Überturbine Wheels" -> binding.teslaImage.setImageResource(R.drawable.tesla_y_blue_3)
                }
            }
        }
    }

    private fun clickOnBlack() {
        binding.black.setOnClickListener {
            binding.colorName.setText(R.string.black)
            when (binding.teslaName.text) {
                "Model S" -> when (binding.wheelName.text) {
                    "19r Tempest Wheels" -> binding.teslaImage.setImageResource(R.drawable.tesla_s_black_1)
                    "21r Arachnid Wheels" -> binding.teslaImage.setImageResource(R.drawable.tesla_s_black_2)
                }
                "Model 3" -> when (binding.wheelName.text) {
                    "18r Aero Wheels" -> binding.teslaImage.setImageResource(R.drawable.tesla_3_black_1)
                    "19r Sport Wheels" -> binding.teslaImage.setImageResource(R.drawable.tesla_3_black_2)
                    "20r Überturbine Wheels" -> binding.teslaImage.setImageResource(R.drawable.tesla_3_black_3)
                }
                "Model X" -> when (binding.wheelName.text) {
                    "20r Cyberstream Wheels" -> binding.teslaImage.setImageResource(R.drawable.tesla_x_black_1)
                    "22r Turbine Wheels" -> binding.teslaImage.setImageResource(R.drawable.tesla_x_black_2)
                }
                "Model Y" -> when (binding.wheelName.text) {
                    "19r Gemini Wheels" -> binding.teslaImage.setImageResource(R.drawable.tesla_y_black_1)
                    "20r Induction Wheels" -> binding.teslaImage.setImageResource(R.drawable.tesla_y_black_2)
                    "21r Überturbine Wheels" -> binding.teslaImage.setImageResource(R.drawable.tesla_y_black_3)
                }
            }
        }
    }

    private fun clickOnRed() {
        binding.red.setOnClickListener {
            binding.colorName.setText(R.string.red)
            when (binding.teslaName.text) {
                "Model S" -> when (binding.wheelName.text) {
                    "19r Tempest Wheels" -> binding.teslaImage.setImageResource(R.drawable.tesla_s_red_1)
                    "21r Arachnid Wheels" -> binding.teslaImage.setImageResource(R.drawable.tesla_s_red_2)
                }
                "Model 3" -> when (binding.wheelName.text) {
                    "18r Aero Wheels" -> binding.teslaImage.setImageResource(R.drawable.tesla_3_red_1)
                    "19r Sport Wheels" -> binding.teslaImage.setImageResource(R.drawable.tesla_3_red_2)
                    "20r Überturbine Wheels" -> binding.teslaImage.setImageResource(R.drawable.tesla_3_red_3)
                }
                "Model X" -> when (binding.wheelName.text) {
                    "20r Cyberstream Wheels" -> binding.teslaImage.setImageResource(R.drawable.tesla_x_red_1)
                    "22r Turbine Wheels" -> binding.teslaImage.setImageResource(R.drawable.tesla_x_red_2)
                }
                "Model Y" -> when (binding.wheelName.text) {
                    "19r Gemini Wheels" -> binding.teslaImage.setImageResource(R.drawable.tesla_y_red_1)
                    "20r Induction Wheels" -> binding.teslaImage.setImageResource(R.drawable.tesla_y_red_2)
                    "21r Überturbine Wheels" -> binding.teslaImage.setImageResource(R.drawable.tesla_y_red_3)
                }
            }
        }
    }

    private fun clickOnWheel1() {
        binding.wheel1.setOnClickListener {
            when (binding.teslaName.text) {
                "Model S" -> {
                    binding.wheelName.setText(R.string.wheels_Model_S_19)
                    when (binding.colorName.text) {
                        "Pearl White Multi-Coat" -> binding.teslaImage.setImageResource(R.drawable.tesla_s_white_1)
                        "Midnight Silver Metallic" -> binding.teslaImage.setImageResource(R.drawable.tesla_s_grey_1)
                        "Deep Blue Metallic" -> binding.teslaImage.setImageResource(R.drawable.tesla_s_blue_1)
                        "Solid Black" -> binding.teslaImage.setImageResource(R.drawable.tesla_s_black_1)
                        "Red Multi-Coat" -> binding.teslaImage.setImageResource(R.drawable.tesla_s_red_1)
                    }
                }
                "Model 3" -> {
                    binding.wheelName.setText(R.string.wheels_Model_3_18)
                    when (binding.colorName.text) {
                        "Pearl White Multi-Coat" -> binding.teslaImage.setImageResource(R.drawable.tesla_3_white_1)
                        "Midnight Silver Metallic" -> binding.teslaImage.setImageResource(R.drawable.tesla_3_grey_1)
                        "Deep Blue Metallic" -> binding.teslaImage.setImageResource(R.drawable.tesla_3_blue_1)
                        "Solid Black" -> binding.teslaImage.setImageResource(R.drawable.tesla_3_black_1)
                        "Red Multi-Coat" -> binding.teslaImage.setImageResource(R.drawable.tesla_3_red_1)
                    }
                }
                "Model X" -> {
                    binding.wheelName.setText(R.string.wheels_Model_X_20)
                    when (binding.colorName.text) {
                        "Pearl White Multi-Coat" -> binding.teslaImage.setImageResource(R.drawable.tesla_x_white_1)
                        "Midnight Silver Metallic" -> binding.teslaImage.setImageResource(R.drawable.tesla_x_grey_1)
                        "Deep Blue Metallic" -> binding.teslaImage.setImageResource(R.drawable.tesla_x_blue_1)
                        "Solid Black" -> binding.teslaImage.setImageResource(R.drawable.tesla_x_black_1)
                        "Red Multi-Coat" -> binding.teslaImage.setImageResource(R.drawable.tesla_x_red_1)
                    }
                }
                "Model Y" -> {
                    binding.wheelName.setText(R.string.wheels_Model_Y_19)
                    when (binding.colorName.text) {
                        "Pearl White Multi-Coat" -> binding.teslaImage.setImageResource(R.drawable.tesla_y_white_1)
                        "Midnight Silver Metallic" -> binding.teslaImage.setImageResource(R.drawable.tesla_y_grey_1)
                        "Deep Blue Metallic" -> binding.teslaImage.setImageResource(R.drawable.tesla_y_blue_1)
                        "Solid Black" -> binding.teslaImage.setImageResource(R.drawable.tesla_y_black_1)
                        "Red Multi-Coat" -> binding.teslaImage.setImageResource(R.drawable.tesla_y_red_1)
                    }
                }
            }
        }
    }

    private fun clickOnWheel2() {
        binding.wheel2.setOnClickListener {
            when (binding.teslaName.text) {
                "Model S" -> {
                    binding.wheelName.setText(R.string.wheels_Model_S_21)
                    when (binding.colorName.text) {
                        "Pearl White Multi-Coat" -> binding.teslaImage.setImageResource(R.drawable.tesla_s_white_2)
                        "Midnight Silver Metallic" -> binding.teslaImage.setImageResource(R.drawable.tesla_s_grey_2)
                        "Deep Blue Metallic" -> binding.teslaImage.setImageResource(R.drawable.tesla_s_blue_2)
                        "Solid Black" -> binding.teslaImage.setImageResource(R.drawable.tesla_s_black_2)
                        "Red Multi-Coat" -> binding.teslaImage.setImageResource(R.drawable.tesla_s_red_2)
                    }
                }
                "Model 3" -> {
                    binding.wheelName.setText(R.string.wheels_Model_3_19)
                    when (binding.colorName.text) {
                        "Pearl White Multi-Coat" -> binding.teslaImage.setImageResource(R.drawable.tesla_3_white_2)
                        "Midnight Silver Metallic" -> binding.teslaImage.setImageResource(R.drawable.tesla_3_grey_2)
                        "Deep Blue Metallic" -> binding.teslaImage.setImageResource(R.drawable.tesla_3_blue_2)
                        "Solid Black" -> binding.teslaImage.setImageResource(R.drawable.tesla_3_black_2)
                        "Red Multi-Coat" -> binding.teslaImage.setImageResource(R.drawable.tesla_3_red_2)
                    }
                }
                "Model X" -> {
                    binding.wheelName.setText(R.string.wheels_Model_X_22)
                    when (binding.colorName.text) {
                        "Pearl White Multi-Coat" -> binding.teslaImage.setImageResource(R.drawable.tesla_x_white_2)
                        "Midnight Silver Metallic" -> binding.teslaImage.setImageResource(R.drawable.tesla_x_grey_2)
                        "Deep Blue Metallic" -> binding.teslaImage.setImageResource(R.drawable.tesla_x_blue_2)
                        "Solid Black" -> binding.teslaImage.setImageResource(R.drawable.tesla_x_black_2)
                        "Red Multi-Coat" -> binding.teslaImage.setImageResource(R.drawable.tesla_x_red_2)
                    }
                }
                "Model Y" -> {
                    binding.wheelName.setText(R.string.wheels_Model_Y_20)
                    when (binding.colorName.text) {
                        "Pearl White Multi-Coat" -> binding.teslaImage.setImageResource(R.drawable.tesla_y_white_2)
                        "Midnight Silver Metallic" -> binding.teslaImage.setImageResource(R.drawable.tesla_y_grey_2)
                        "Deep Blue Metallic" -> binding.teslaImage.setImageResource(R.drawable.tesla_y_blue_2)
                        "Solid Black" -> binding.teslaImage.setImageResource(R.drawable.tesla_y_black_2)
                        "Red Multi-Coat" -> binding.teslaImage.setImageResource(R.drawable.tesla_y_red_2)
                    }
                }
            }
        }
    }

    private fun clickOnWheel3() {
        binding.wheel3.setOnClickListener {
            when (binding.teslaName.text) {
                "Model 3" -> {
                    binding.wheelName.setText(R.string.wheels_Model_3_20)
                    when (binding.colorName.text) {
                        "Pearl White Multi-Coat" -> binding.teslaImage.setImageResource(R.drawable.tesla_3_white_3)
                        "Midnight Silver Metallic" -> binding.teslaImage.setImageResource(R.drawable.tesla_3_grey_3)
                        "Deep Blue Metallic" -> binding.teslaImage.setImageResource(R.drawable.tesla_3_blue_3)
                        "Solid Black" -> binding.teslaImage.setImageResource(R.drawable.tesla_3_black_3)
                        "Red Multi-Coat" -> binding.teslaImage.setImageResource(R.drawable.tesla_3_red_3)
                    }
                }
                "Model Y" -> {
                    binding.wheelName.setText(R.string.wheels_Model_Y_21)
                    when (binding.colorName.text) {
                        "Pearl White Multi-Coat" -> binding.teslaImage.setImageResource(R.drawable.tesla_y_white_3)
                        "Midnight Silver Metallic" -> binding.teslaImage.setImageResource(R.drawable.tesla_y_grey_3)
                        "Deep Blue Metallic" -> binding.teslaImage.setImageResource(R.drawable.tesla_y_blue_3)
                        "Solid Black" -> binding.teslaImage.setImageResource(R.drawable.tesla_y_black_3)
                        "Red Multi-Coat" -> binding.teslaImage.setImageResource(R.drawable.tesla_y_red_3)
                    }
                }
            }
        }
    }

    private fun clickOnArrow(){
        binding.arrowNext.setOnClickListener {
            val intent = Intent(this, EndActivity::class.java)
            intent.putExtra("teslaName", binding.teslaName.text)
            intent.putExtra("teslaType", binding.teslaType.text)
            startActivity(intent)
        }
    }
}
