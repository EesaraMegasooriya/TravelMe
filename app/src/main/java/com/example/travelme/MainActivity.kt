package com.example.travelme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val letsgobtn = findViewById<Button>(R.id.letsgobtn)
        letsgobtn.setOnClickListener {
            val intent = Intent(this,Next1::class.java)
            startActivity(intent)
        }

    }
}