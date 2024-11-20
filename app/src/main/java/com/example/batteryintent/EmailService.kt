package com.example.batteryintent

import android.util.Log
import javax.inject.Inject

class EmailService @Inject constructor() {

    fun sendEmail(){
        Log.i("EmailService","Mail sent")
    }
}