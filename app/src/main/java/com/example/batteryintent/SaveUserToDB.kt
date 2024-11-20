package com.example.batteryintent

import android.util.Log
import javax.inject.Inject

class SaveUserToDB @Inject constructor(){
    fun saveUser(){
        Log.i("SaveUserToDB","Saving user...")
    }
}