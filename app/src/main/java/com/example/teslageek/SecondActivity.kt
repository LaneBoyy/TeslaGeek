package com.example.teslageek

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.RadioGroup
import com.example.teslageek.databinding.ActivitySecondBinding
import java.io.Serializable

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

//        data class TransferData(
//            var powerReserve1: String? = binding.PowerReserve.text as String,
//            var accelerate1: String? = binding.Acceleration0100.text as String,
//            var maxSpeed1: String? = binding.MaxSpeed.text as String
//        ) : Serializable
//
//        val transferData = TransferData()
//        val intent = Intent(this, EndActivity::class.java)
//        intent.putExtra("DataIntent", transferData as Serializable)

    }

    private fun setRadioButtons() {
        binding.radioGroup.setOnCheckedChangeListener(object : RadioGroup.OnCheckedChangeListener {
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
                binding.radioButtonFirstConfig.text = "Long  Range"
                binding.radioButtonSecondConfig.text = "Plaid"
                binding.radioButtonThirdConfig.visibility = View.GONE
                when (activeType) {
                    1 -> {
                        powerReserve = "652 km"
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
                        maxSpeed = "261 km/h"
                        acceleration0100 = "3.3 s"
                        teslaType = "Performance"
                    }
                }
            }
            "Model Y" -> {
                binding.radioButtonFirstConfig.text = "Long Range"
                binding.radioButtonSecondConfig.text = "Performance"
                binding.radioButtonThirdConfig.visibility = View.GONE
                when (activeType) {
                    1 -> {
                        powerReserve = "533 km"
                        maxSpeed = "217 km/h"
                        acceleration0100 = "5.0 s"
                        teslaType = "Long Range"
                    }
                    2 -> {
                        powerReserve = "514 km"
                        maxSpeed = "250 km/h"
                        acceleration0100 = "3.7 s"
                        teslaType = "Performance"
                    }
                }
            }
            "Model X" -> {
                binding.radioButtonFirstConfig.text = "Long Range"
                binding.radioButtonSecondConfig.text = "Plaid"
                binding.radioButtonThirdConfig.visibility = View.GONE
                when (activeType) {
                    1 -> {
                        powerReserve = "560 km"
                        maxSpeed = "250 km/h"
                        acceleration0100 = "3.9 s"
                        teslaType = "Long Range"
                    }
                    2 -> {
                        powerReserve = "536 km"
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
            val intent = Intent(this, WheelsAndColorActivity::class.java)
            intent.putExtra("teslaName", teslaModelName)
            intent.putExtra("teslaType", binding.textTypeTesla.text)
            intent.putExtra("powerReserve", binding.PowerReserve.text.toString())
            intent.putExtra("acceleration", binding.Acceleration0100.text.toString())
            intent.putExtra("maxSpeed", binding.MaxSpeed.text.toString())
            startActivity(intent)
        }
    }
}

