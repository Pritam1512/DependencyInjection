package com.example.batteryintent

import dagger.Component

@Component
interface UserRegistrationComponent {
    fun getUserRegistrationService() : UserRegistrationService
    fun getEmailService() : EmailService
}