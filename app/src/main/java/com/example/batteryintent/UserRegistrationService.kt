package com.example.batteryintent

import android.util.Log
import javax.inject.Inject

class UserRegistrationService @Inject constructor(
    private val emailService: EmailService,
    private val saveUserToDB: SaveUserToDB) {

    fun registerUser(email:String,pass:String) {
        emailService.sendEmail()
        saveUserToDB.saveUser()
    }
}