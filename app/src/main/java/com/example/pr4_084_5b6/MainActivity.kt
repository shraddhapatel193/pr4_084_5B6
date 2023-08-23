
package com.example.pr4_084_5b6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val tag="MainActivity"
        lateinit var sing_up1: Button
        lateinit var login_btn1:Button

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        login_btn1 = findViewById(R.id.btnlogin)
        login_btn1.setOnClickListener {
            val intent = Intent(this,LoginMainActivity2::class.java)
            startActivity(intent)
        }
        sing_up1 = findViewById(R.id.btnsignup)
        sing_up1.setOnClickListener {
            val intent = Intent(this,RegistrationMainActivity2::class.java)
            startActivity(intent)
        }


    }
}