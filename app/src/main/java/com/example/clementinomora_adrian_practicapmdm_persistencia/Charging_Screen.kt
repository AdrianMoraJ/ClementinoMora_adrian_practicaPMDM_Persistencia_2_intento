package com.example.clementinomora_adrian_practicapmdm_persistencia

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class Charging_Screen : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_charging_screen) // Asegúrate de tener este archivo XML de diseño

        val time: Int = 3000
        Handler().postDelayed({
            startActivity(Intent(this@Charging_Screen, MainActivity::class.java))
            finish()
        }, time.toLong())

    }

}