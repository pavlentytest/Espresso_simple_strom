package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button = findViewById(R.id.btn_login)
        btn.setOnClickListener {
           login()
        }
    }

    fun login() {
        val intent = Intent( applicationContext, LoginActivity::class.java)
        startActivity(intent)
    }
}