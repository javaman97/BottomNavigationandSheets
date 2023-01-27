package com.example.bottomnavigationsheets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.android.material.bottomsheet.BottomSheetDialog

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val btnShow=findViewById<Button>(R.id.button2)
        btnShow.setOnClickListener {
            val view: View = layoutInflater.inflate(R.layout.bottomsheets,null)
            val dialog=BottomSheetDialog(this)
            dialog.setContentView(view)
            dialog.show()
        }
    }
}