package com.example.project2525

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)

        val btnLogin : Button = findViewById(R.id.buttonLogin)

        btnLogin.setOnClickListener{
            val intent = intent (this, HomeActivity2::class.java)
            startActivities(intent)
        }
    }

}