package com.example.reversesearcher

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val resultsButton = findViewById<Button>(R.id.resultsButton)
        resultsButton.setOnClickListener{
            val intent = Intent(this, ResultsActivity)
        }
    }
}