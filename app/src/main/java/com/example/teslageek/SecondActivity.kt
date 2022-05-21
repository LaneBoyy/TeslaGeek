package com.example.teslageek

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.RadioGroup
import com.example.teslageek.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivitySecondBinding.inflate(layoutInflater)
    }

    private var teslaModelName = ""
    private var teslaImage = 0
    private var activeType = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        teslaModelName = intent.getStringExtra("TextModelTesla").toString()
        teslaImage = intent.getIntExtra("ImgTesla", 0)
        binding.textNameTesla.text = teslaModelName
        binding.textTypeTesla.setText(R.string.textTypeStandard)
        binding.bigTeslaImage.setImageResource(teslaImage)

        setConfiguration()
        setRadioButtons()
        launchNextScreen()

    }

    private fun setRadioButtons() {
        binding.radioGroup.setOnCheckedChangeListener(object:RadioGroup.OnCheckedChangeListener {
            override fun onCheckedChanged(radioGroup: RadioGroup?, radioId: Int) {
                when (radioId) {
                    binding.radioButtonFirstConfig.id -> {
                        activeType = 1
                        setConfiguration()
                    }

                    binding.radioButtonSecondConfig.id -> {
                        activeType = 2
                        setConfiguration()
                    }

                    binding.radioButtonThirdConfig.id -> {
                        activeType = 3
                        setConfiguration()
                    }
                }
            }
        })
    }

    private fun setConfiguration() {
        var powerReserve = ""
        var maxSpeed = ""
        var acceleration0100 = ""
        var teslaType = ""
        when (teslaModelName) {
            "Model S" -> {
                binding.radioButtonFirstConfig.text = "Long Rage"
                binding.radioButtonSecondConfig.text = "Plaid"
                binding.radioButtonThirdConfig.visibility = View.GONE
                when (activeType) {
                    1 -> {
                        powerReserve = "663 km"
                        maxSpeed = "250 km/h"
                        acceleration0100 = "3.2 s"
                        teslaType = "Long Range"
                    }
                    2 -> {
                        powerReserve = "637 km"
                        maxSpeed = "322 km/h"
                        acceleration0100 = "2.1 s"
                        teslaType = "Plaid"
                    }
                }
            }
            "Model 3" -> {
                when (activeType) {
                    1 -> {
                        powerReserve = "491 km"
                        maxSpeed = "225 km/h"
                        acceleration0100 = "6.1 s"
                        teslaType = "Standard Plus"
                    }
                    2 -> {
                        powerReserve = "602 km"
                        maxSpeed = "233 km/h"
                        acceleration0100 = "4.4 s"
                        teslaType = "Long Range"
                    }
                    3 -> {
                        powerReserve = "547 km"
                        maxSpeed = "351 km/h"
                        acceleration0100 = "3.7 s"
                        teslaType = "Performance"
                    }
                }
            }
            "Model Y" -> {
                when (activeType) {
                    1 -> {
                        powerReserve = "393 km"
                        maxSpeed = "217 km/h"
                        acceleration0100 = "5.3 s"
                        teslaType = "Standard Plus"
                    }
                    2 -> {
                        powerReserve = "533 km"
                        maxSpeed = "217 km/h"
                        acceleration0100 = "5 s"
                        teslaType = "Long Range"
                    }
                    3 -> {
                        powerReserve = "514 km"
                        maxSpeed = "250 km/h"
                        acceleration0100 = "3.7 s"
                        teslaType = "Performance"
                    }
                }
            }
            "Model X" -> {
                binding.radioButtonFirstConfig.text = "Long Rage"
                binding.radioButtonSecondConfig.text = "Plaid"
                binding.radioButtonThirdConfig.visibility = View.GONE
                when (activeType) {
                    1 -> {
                        powerReserve = "580 km"
                        maxSpeed = "250 km/h"
                        acceleration0100 = "3.9 s"
                        teslaType = "Long Range"
                    }
                    2 -> {
                        powerReserve = "547 km"
                        maxSpeed = "262 km/h"
                        acceleration0100 = "2.6 s"
                        teslaType = "Plaid"
                    }
                }
            }

        }
        binding.PowerReserve.text = powerReserve
        binding.MaxSpeed.text = maxSpeed
        binding.Acceleration0100.text = acceleration0100
        binding.textTypeTesla.text = teslaType
    }

    private fun launchNextScreen() {
        binding.arrowNext.setOnClickListener {
            val intentToNext = Intent(this, WheelsAndColorActivity::class.java)
            intentToNext.putExtra("teslaName", teslaModelName)
            intentToNext.putExtra("teslaType", binding.textTypeTesla.text)
            startActivity(intentToNext)
        }
    }
}

