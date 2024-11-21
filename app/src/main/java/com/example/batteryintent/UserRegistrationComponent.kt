package com.example.batteryintent

import dagger.Component

@Component
interface UserRegistrationComponent {
    fun inject(mainActivity: MainActivity)
}