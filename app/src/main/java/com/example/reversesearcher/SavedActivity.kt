package com.example.reversesearcher

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SavedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saved)
        val resultsButton = findViewById<Button>(R.id.resultsButton)
        resultsButton.setOnClickListener{
            val intent = Intent(this, ResultsActivity::class.java)
            startActivity(intent)
        }

        val savedButton = findViewById<Button>(R.id.savedButton)
        savedButton.setOnClickListener{
            val intent = Intent(this, SavedActivity::class.java)
            startActivity(intent)
        }

        val selectButton = findViewById<Button>(R.id.SelectButton)
        selectButton.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}