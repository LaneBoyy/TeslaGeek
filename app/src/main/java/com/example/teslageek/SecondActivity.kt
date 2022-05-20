package com.example.teslageek

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.teslageek.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivitySecondBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val intent = intent
        val teslaModelName = intent.getStringExtra("TextModelTesla").toString()
        binding.textNameTesla.text = teslaModelName
        binding.textTypeTesla.setText(R.string.textTypeStandard)

        when (teslaModelName) {
            "Model S" -> binding.bigTeslaImage.setImageResource(R.drawable.teslaswhite2)
            "Model 3" -> binding.bigTeslaImage.setImageResource(R.drawable.tesla3white2)
            "Model X" -> binding.bigTeslaImage.setImageResource(R.drawable.teslaxwhite2)
            "Model Y" -> binding.bigTeslaImage.setImageResource(R.drawable.teslaywhite2)
        }

        when (teslaModelName) {
            "Model S" -> {
                binding.PowerReserve.text = "450 km"
                binding.MaxSpeed.text = "250 km/h"
                binding.Acceleration0100.text = "4.2 s"
            }
            "Model 3" -> {
                binding.PowerReserve.text = "491 km"
                binding.MaxSpeed.text = "225 km/h"
                binding.Acceleration0100.text = "6.1 s"
            }
            "Model Y" -> {
                binding.PowerReserve.text = "393 km"
                binding.MaxSpeed.text = "217 km/h"
                binding.Acceleration0100.text = "5.3 s"
            }
            "Model X" -> {
                binding.PowerReserve.text = "411 km"
                binding.MaxSpeed.text = "250 km/h"
                binding.Acceleration0100.text = "4.6 s"
            }
        }

        clickOnStandardPlus()
        clickOnLongRange()
        clickOnPerformance()

        binding.arrowNext.setOnClickListener {
            val intentToNext = Intent(this, WheelsAndColorActivity::class.java)
            intentToNext.putExtra("teslaName", teslaModelName)
            intentToNext.putExtra("teslaType", binding.textTypeTesla.text)
            startActivity(intentToNext)
        }

    }

    private fun clickOnStandardPlus() {
        binding.radioButtonStandartPlus.setOnClickListener {
            binding.textTypeTesla.setText(R.string.textTypeStandard)
            when (binding.textNameTesla.text) {
                "Model S" -> {
                    binding.PowerReserve.text = "450 km"
                    binding.MaxSpeed.text = "250 km/h"
                    binding.Acceleration0100.text = "4.2 s"
                }
                "Model 3" -> {
                    binding.PowerReserve.text = "491 km"
                    binding.MaxSpeed.text = "225 km/h"
                    binding.Acceleration0100.text = "6.1 s"
                }
                "Model Y" -> {
                    binding.PowerReserve.text = "393 km"
                    binding.MaxSpeed.text = "217 km/h"
                    binding.Acceleration0100.text = "5.3 s"
                }
                "Model X" -> {
                    binding.PowerReserve.text = "411 km"
                    binding.MaxSpeed.text = "250 km/h"
                    binding.Acceleration0100.text = "4.6 s"
                }
            }
        }
    }

    private fun clickOnLongRange() {
        binding.radioButtonLongRange.setOnClickListener {
            binding.textTypeTesla.setText(R.string.textTypeLongRange)
            when (binding.textNameTesla.text) {
                "Model S" -> {
                    binding.PowerReserve.text = "663 km"
                    binding.MaxSpeed.text = "250 km/h"
                    binding.Acceleration0100.text = "3.2 s"
                }
                "Model 3" -> {
                    binding.PowerReserve.text = "602 km"
                    binding.MaxSpeed.text = "233 km/h"
                    binding.Acceleration0100.text = "4.4 s"
                }
                "Model Y" -> {
                    binding.PowerReserve.text = "533 km"
                    binding.MaxSpeed.text = "217 km/h"
                    binding.Acceleration0100.text = "5 s"
                }
                "Model X" -> {
                    binding.PowerReserve.text = "580 km"
                    binding.MaxSpeed.text = "250 km/h"
                    binding.Acceleration0100.text = "3.9 s"
                }
            }
        }
    }

    private fun clickOnPerformance() {
        binding.radioButtonPerformance.setOnClickListener {
            binding.textTypeTesla.setText(R.string.textTypePerformance)
            when (binding.textNameTesla.text) {
                "Model S" -> {
                    binding.PowerReserve.text = "637 km"
                    binding.MaxSpeed.text = "322 km/h"
                    binding.Acceleration0100.text = "2.1 s"
                }
                "Model 3" -> {
                    binding.PowerReserve.text = "547 km"
                    binding.MaxSpeed.text = "261 km/h"
                    binding.Acceleration0100.text = "3.3 s"
                }
                "Model Y" -> {
                    binding.PowerReserve.text = "514 km"
                    binding.MaxSpeed.text = "250 km/h"
                    binding.Acceleration0100.text = "3.7 s"
                }
                "Model X" -> {
                    binding.PowerReserve.text = "547 km"
                    binding.MaxSpeed.text = "262 km/h"
                    binding.Acceleration0100.text = "2.6 s"
                }
            }

        }
    }
}

