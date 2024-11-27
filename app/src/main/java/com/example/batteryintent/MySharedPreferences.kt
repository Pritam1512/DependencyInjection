package com.example.batteryintent

import android.content.Context
import android.util.Log

object MySharedPreferences {

    private const val TAG = "MySharedPreferences"
    private const val SHARED_PREF_NAME = "BatteryIntent"
    private const val PREFERENCE_KEY = "battery_level"

    fun getSharedValue(context: Context) :Int{
        val getLastBatteryValue = context.getSharedPreferences(SHARED_PREF_NAME,Context.MODE_PRIVATE)
            .getInt(PREFERENCE_KEY, 0)
        Log.i(TAG,"Get Shared Value $getLastBatteryValue")
        return getLastBatteryValue
    }

    fun updateShareValue(context: Context, batteryLevel: Int){
        val sharedPreferences = context.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putInt(PREFERENCE_KEY, batteryLevel)
        Log.i(TAG, "Update Shared Value $batteryLevel")
        editor.apply()
    }
}