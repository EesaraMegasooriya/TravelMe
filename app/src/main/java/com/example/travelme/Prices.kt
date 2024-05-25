package com.example.travelme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Prices : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prices)

        val hmbtn = findViewById<Button>(R.id.hmbtn)
        hmbtn.setOnClickListener {
            val intent = Intent(this,Home::class.java)
            startActivity(intent)
        }

    }

    }