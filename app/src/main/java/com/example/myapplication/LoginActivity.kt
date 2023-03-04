package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val usernameEditText: EditText = findViewById(R.id.et_username)
        val passwordEditText: EditText = findViewById(R.id.et_password)
        val submitButton: Button = findViewById(R.id.btn_submit)
        val loginTitleTextView: TextView = findViewById(R.id.tv_login)

        submitButton.setOnClickListener {
            if (usernameEditText.text.toString() == "login" &&
                passwordEditText.text.toString() == "12345") {
                loginTitleTextView.text = "Success"
            } else {
                loginTitleTextView.text = "Failure"
            }
        }
    }
}