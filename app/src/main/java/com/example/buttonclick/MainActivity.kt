package com.example.buttonclick

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnvar:Button = findViewById(R.id.btn)

        btnvar.setOnClickListener(View.OnClickListener {
            Toast.makeText(this,"Button Clicked", Toast.LENGTH_LONG).show()
        })


    }


}