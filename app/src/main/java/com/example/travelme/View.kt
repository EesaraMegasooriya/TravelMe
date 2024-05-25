package com.example.travelme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class View : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view)

        val button7 = findViewById<Button>(R.id.hmbtn)
        button7.setOnClickListener {
            val intent = Intent(this,Prices::class.java)
            startActivity(intent)
        }

    }
}