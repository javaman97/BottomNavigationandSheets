package com.example.bottomnavigationsheets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var secondButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        secondButton=findViewById(R.id.button)
        secondButton.setOnClickListener {
            val intent= Intent(this,SecondActivity::class.java)
            startActivity(intent)
            }
    }
}