package com.example.pr4_084_5b6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegistrationMainActivity2 : AppCompatActivity() {
    lateinit var btnlogin : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration_main2)
        btnlogin = findViewById(R.id.r_login_btn)
        btnlogin.setOnClickListener {
            var intent = Intent(this,LoginMainActivity2::class.java)
            startActivity(intent)
        }
    }
}