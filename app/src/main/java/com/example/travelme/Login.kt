package com.example.travelme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val next1btn = findViewById<Button>(R.id.next1btn)
        next1btn.setOnClickListener {
            val intent = Intent(this,Home::class.java)
            startActivity(intent)
        }
    }
}