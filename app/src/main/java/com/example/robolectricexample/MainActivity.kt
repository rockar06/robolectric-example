package com.example.robolectricexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.robolectricexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupView()
    }

    private fun setupView() {
        updateCounterText()
        binding.btnIncreaseCounter.setOnClickListener {
            counter++
            updateCounterText()
        }
    }

    private fun updateCounterText() {
        binding.tvCounter.text = "$counter"
    }

}