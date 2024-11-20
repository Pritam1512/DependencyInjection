package com.example.batteryintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userRegistrationService = DaggerUserRegistrationComponent.builder().build()
        userRegistrationService.getUserRegistrationService().registerUser("pritam@gmail.com","12345")
    }
}