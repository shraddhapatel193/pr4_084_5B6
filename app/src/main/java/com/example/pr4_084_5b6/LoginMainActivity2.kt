package com.example.pr4_084_5b6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginMainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var sign_up2: Button
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_main2)
        sign_up2 = findViewById(R.id.l_signup)
        sign_up2.setOnClickListener {
            var intent = Intent(this,RegistrationMainActivity2::class.java)
            startActivity(intent)
        }

    }
}