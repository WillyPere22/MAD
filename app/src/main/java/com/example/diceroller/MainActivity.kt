package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    // Declare a private member variable to hold the randomly generated value, initialized to 1
    private var rolledValue = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the Button and TextView elements from the layout
        val toastButton = findViewById<Button>(R.id.button_toast)
        val countTextView = findViewById<TextView>(R.id.textview_count)

        // Set a click listener for the Toast button
        toastButton.setOnClickListener {
            // Display a short Toast message
            Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT).show()
        }
    }

    // Method to handle dice rolling
    fun rollingDice() {
        // Use Kotlin's random number generator to return an integer value from 1 to 6
        rolledValue = Random.nextInt(1, 7)

        // Find the TextView and pass the randomly generated value to display it
        val countTextView = findViewById<TextView>(R.id.textview_count)
        countTextView.text = rolledValue.toString()
    }
}
