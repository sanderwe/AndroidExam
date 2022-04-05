package com.example.reversesearcher

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private lateinit var selectButton: Button
    private lateinit var imageView: ImageView


    companion object {
        val IMAGE_REQUEST_CODE = 1_000
    }




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        

        setContentView(R.layout.activity_main)

        selectButton = findViewById(R.id.selectImageButton)
        imageView = findViewById(R.id.imageView)

        selectButton.setOnClickListener{
            pickImageFromGallery()

        }

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

    private fun pickImageFromGallery() {
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"
        startActivityForResult(intent, IMAGE_REQUEST_CODE)
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == IMAGE_REQUEST_CODE && resultCode == RESULT_OK) {
            imageView.setImageURI(data?.data)
        }

    }
}
