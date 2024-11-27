package com.example.batteryintent

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.batteryintent.databinding.ActivityMainBinding
import javax.inject.Inject


class MainActivity : AppCompatActivity() {
    private lateinit var mainBinding: ActivityMainBinding

    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    @Inject
    lateinit var emailService: EmailService

    @Inject
    lateinit var saveUserToDB: SaveUserToDB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        mainBinding.button.setOnClickListener{
            getBatteryValue(this)
        }
        mainBinding.button2.setOnClickListener{
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }
        mainBinding.button3.setOnClickListener{
            val rnds = (0..10).random()
            MySharedPreferences.updateShareValue(this,rnds)
        }

        val userRegistrationComponent = DaggerUserRegistrationComponent.builder().build()
        userRegistrationComponent.inject(this)
        userRegistrationService.registerUser("pritam@gmail.com", "12345")

    }

    private fun getBatteryValue(context: Context) {
        mainBinding.textView.text = MySharedPreferences.getSharedValue(context).toString()
    }
}