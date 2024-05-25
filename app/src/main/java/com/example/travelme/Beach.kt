package com.example.travelme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Beach : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beach)

        val viewbtn3 = findViewById<Button>(R.id.viewbtn3)
        viewbtn3.setOnClickListener {
            val intent = Intent(this,View::class.java)
            startActivity(intent)
        }

        val viewbtn2 = findViewById<Button>(R.id.viewbtn2)
        viewbtn2.setOnClickListener {
            val intent = Intent(this,View::class.java)
            startActivity(intent)
        }

        val viewbtn5 = findViewById<Button>(R.id.viewbtn5)
        viewbtn5.setOnClickListener {
            val intent = Intent(this,View::class.java)
            startActivity(intent)
        }

        val button4 = findViewById<Button>(R.id.button4)
        button4.setOnClickListener {
            val intent = Intent(this,Home::class.java)
            startActivity(intent)
        }
    }
}