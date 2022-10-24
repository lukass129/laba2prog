package com.example.myapplication32

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        val button4 = findViewById<Button>(R.id.button4)
        val newvar = intent.getIntExtra("var", 8)
        Toast.makeText(this, "Result is $newvar", Toast.LENGTH_LONG).show()
        button4.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}