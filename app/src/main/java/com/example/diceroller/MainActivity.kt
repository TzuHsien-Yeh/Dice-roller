package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlin.random.Random
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {  rollDice() }

        val countButton: Button = findViewById(R.id.count_button)
        countButton.setOnClickListener { countUp() }

        val resetButton: Button = findViewById(R.id.reset_button)
        resetButton.setOnClickListener { reset() }
    }

    private fun rollDice() {
        val randomInt = (1..6).random()
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()
    }

//    click listener for the countUp button.
    private fun countUp(){
        val resultText: TextView = findViewById(R.id.result_text)

    // If text is the default "Hello World!" set that text to 1.
    if(resultText.text == "A dice"){
        resultText.text = "1"
    }else{
    // Otherwise, increment the number up to 6.
    // The text value in resultText.text is an instance of the CharSequence class;
    // it needs to be converted to a String object before it can be converted to an int.
    var resultInt = resultText.text.toString().toInt()

        if (resultInt < 6){
            resultInt++
            resultText.text = resultInt.toString()
        }
    }
    }

    private fun reset(){
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = "0"
    }
}