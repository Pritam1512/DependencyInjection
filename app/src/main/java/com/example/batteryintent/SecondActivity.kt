package com.example.batteryintent

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.batteryintent.databinding.SecondActivityLayoutBinding

class SecondActivity : Activity() {
    private lateinit var secondActivityBinding: SecondActivityLayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        secondActivityBinding = SecondActivityLayoutBinding.inflate(layoutInflater)
        setContentView(secondActivityBinding.root)

        secondActivityBinding.button.setOnClickListener{
            val currentBatteryValue = MySharedPreferences.getSharedValue(this)
            secondActivityBinding.textView.text = currentBatteryValue.toString()
        }
    }
}