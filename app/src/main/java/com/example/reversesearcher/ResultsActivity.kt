package com.example.reversesearcher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ResultsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results)

        val actionBar = supportActionBar


            actionBar!!.title ="Second activity"

        actionBar.setDisplayHomeAsUpEnabled(true)


    }
}