package com.example.calculator_ex3


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.calculator_ex3.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstNumber = findViewById<EditText>(R.id.editTextNumber)
        val secondNumber = findViewById<EditText>(R.id.editTextNumber2)
        val resultTextView = findViewById<TextView>(R.id.textView3)

        val addButton = findViewById<Button>(R.id.button)
        val subtractButton = findViewById<Button>(R.id.button1)
        val multiplyButton = findViewById<Button>(R.id.button2)
        val divideButton = findViewById<Button>(R.id.button3)

        addButton.setOnClickListener {
            val num1 = firstNumber.text.toString().toDoubleOrNull()
            val num2 = secondNumber.text.toString().toDoubleOrNull()

            if (num1 != null && num2 != null) {
                val result = num1 + num2
                resultTextView.text = result.toString()
            } else {
                resultTextView.text = "Invalid Input"
            }
        }

        subtractButton.setOnClickListener {
            val num1 = firstNumber.text.toString().toDoubleOrNull()
            val num2 = secondNumber.text.toString().toDoubleOrNull()

            if (num1 != null && num2 != null) {
                val result = num1 - num2
                resultTextView.text = result.toString()
            } else {
                resultTextView.text = "Invalid Input"
            }
        }

        multiplyButton.setOnClickListener {
            val num1 = firstNumber.text.toString().toDoubleOrNull()
            val num2 = secondNumber.text.toString().toDoubleOrNull()

            if (num1 != null && num2 != null) {
                val result = num1 * num2
                resultTextView.text = result.toString()
            } else {
                resultTextView.text = "Invalid Input"
            }
        }

        divideButton.setOnClickListener {
            val num1 = firstNumber.text.toString().toDoubleOrNull()
            val num2 = secondNumber.text.toString().toDoubleOrNull()

            if (num1 != null && num2 != null) {
                if (num2 != 0.0) {
                    val result = num1 / num2
                    resultTextView.text = result.toString()
                } else {
                    resultTextView.text = "Cannot divide by zero"
                }
            } else {
                resultTextView.text = "Invalid Input"
            }
        }
    }
}
