package com.example.travelme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Browse : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_browse)

        val viewbtn5 = findViewById<Button>(R.id.viewbtn5)
        viewbtn5.setOnClickListener {
            val intent = Intent(this,Beach::class.java)
            startActivity(intent)
        }

        val viewbtn2 = findViewById<Button>(R.id.viewbtn2)
        viewbtn2.setOnClickListener {
            val intent = Intent(this,Mountains::class.java)
            startActivity(intent)
        }
        val viewbtn3 = findViewById<Button>(R.id.viewbtn3)
        viewbtn3.setOnClickListener {
            val intent = Intent(this,Forest::class.java)
            startActivity(intent)
        }
        val viewbtn4 = findViewById<Button>(R.id.viewbtn4)
        viewbtn4.setOnClickListener {
            val intent = Intent(this,CountrySide::class.java)
            startActivity(intent)
        }
    }
}