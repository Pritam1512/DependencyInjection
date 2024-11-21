package com.example.batteryintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    @Inject
    lateinit var emailService: EmailService

    @Inject
    lateinit var saveUserToDB: SaveUserToDB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userRegistrationComponent = DaggerUserRegistrationComponent.builder().build()
        userRegistrationComponent.inject(this)
        userRegistrationService.registerUser("pritam@gmail.com", "12345")

    }
}