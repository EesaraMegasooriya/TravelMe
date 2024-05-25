package com.example.travelme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val viewbtn2 = findViewById<Button>(R.id.viewbtn2)
        viewbtn2.setOnClickListener {
            val intent = Intent(this,View::class.java)
            startActivity(intent)
        }
        val viewbtn3 = findViewById<Button>(R.id.viewbtn3)
        viewbtn3.setOnClickListener {
            val intent = Intent(this,View::class.java)
            startActivity(intent)
        }
        val viewbtn4 = findViewById<Button>(R.id.viewbtn5)
        viewbtn4.setOnClickListener {
            val intent = Intent(this,View::class.java)
            startActivity(intent)
        }
        val brwsbtn = findViewById<Button>(R.id.brwsbtn)
        brwsbtn.setOnClickListener {
            val intent=Intent(this,Browse::class.java)
            startActivity(intent)
        }
        val probtn = findViewById<Button>(R.id.probtn)
        probtn.setOnClickListener {
            val intent=Intent(this,Profile::class.java)
            startActivity(intent)
        }

    }
}