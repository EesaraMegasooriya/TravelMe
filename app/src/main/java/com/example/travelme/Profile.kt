package com.example.travelme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val logout = findViewById<Button>(R.id.logout)
        logout.setOnClickListener {
            val intent = Intent(this,Login::class.java)
            startActivity(intent)
        }
        val homepro = findViewById<Button>(R.id.homepro)
        homepro.setOnClickListener {
            val intent = Intent(this,Home::class.java)
            startActivity(intent)
        }

    }
}