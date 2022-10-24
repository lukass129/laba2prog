package com.example.myapplication32

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val edit1 = findViewById<TextView>(R.id.textView)
        val edit2 = findViewById<TextView>(R.id.textView2)
        button.setOnClickListener {
            if(edit2.text.toString()!="" && edit1.text.toString()!=""){
                val no1 = edit1.text.toString().toInt()
                val no2 = edit2.text.toString().toInt()
                val sum = no1 + no2
                val intent = Intent(this, Activity2::class.java)
                intent.putExtra("var", sum)
                startActivity(intent)
                //Toast.makeText(this, "Sum is $sum", Toast.LENGTH_LONG).show()
            } else{
                Toast.makeText(this, "no", Toast.LENGTH_LONG).show()
            }
        }
        button1.setOnClickListener {
            if(edit2.text.toString()!="" && edit1.text.toString()!=""){
                val no1 = edit1.text.toString().toInt()
                val no2 = edit2.text.toString().toInt()
                val min = no1 - no2
                val intent = Intent(this, Activity2::class.java)
                intent.putExtra("var", min)
                startActivity(intent)
                //Toast.makeText(this, "Min is $min", Toast.LENGTH_LONG).show()
            } else{
                Toast.makeText(this, "no", Toast.LENGTH_LONG).show()
            }
        }
        button2.setOnClickListener {
            if(edit2.text.toString()!="" && edit1.text.toString()!=""){
                val no1 = edit1.text.toString().toInt()
                val no2 = edit2.text.toString().toInt()
                val umn = no1 * no2
                val intent = Intent(this, Activity2::class.java)
                intent.putExtra("var", umn)
                startActivity(intent)
                //Toast.makeText(this, "Min is $umn", Toast.LENGTH_LONG).show()
            } else{
                Toast.makeText(this, "no", Toast.LENGTH_LONG).show()
            }

        }
        button3.setOnClickListener {
            if(edit2.text.toString()!="" && edit1.text.toString()!=""){
                edit2.text = ""
                edit1.text = ""
            } else{
                Toast.makeText(this, "no", Toast.LENGTH_LONG).show()
            }
    }
}
}