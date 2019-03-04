package com.example.a1.myalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.a1.calculator.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val numberFieldFirst = findViewById<EditText>(R.id.numberFieldFirst)
        val numberFieldSecond = findViewById<EditText>(R.id.numberFieldSecond)
        val btnadd = findViewById<Button>(R.id.btnadd)
        val result = findViewById<TextView>(R.id.result)
        val btnminus = findViewById<Button>(R.id.btnminus)
        val btnmulti = findViewById<Button>(R.id.btnmulti)
        val btndiv = findViewById<Button>(R.id.btndiv)

        btnadd.setOnClickListener {
            val firstNumber: String = numberFieldFirst.text.toString()
            val secondNumber: String = numberFieldSecond.text.toString()

            if (numberFieldFirst.text.isEmpty() || numberFieldSecond.text.isEmpty()) {
                Toast.makeText(applicationContext, "Enter The Value", Toast.LENGTH_SHORT).show()
            } else {
                result.text = (firstNumber.toInt() + secondNumber.toInt()).toString()
            }
        }

        btnminus.setOnClickListener {
            val firstNumber: String = numberFieldFirst.text.toString()
            val secondNumber: String = numberFieldSecond.text.toString()

            if (numberFieldFirst.text.isEmpty() || numberFieldSecond.text.isEmpty()) {
                Toast.makeText(applicationContext, "Enter the Value", Toast.LENGTH_SHORT).show()
            } else {
                result.text = (firstNumber.toInt() - secondNumber.toInt()).toString()
            }
        }

        btnmulti.setOnClickListener {
            val firstNumber: String = numberFieldFirst.text.toString()
            val secondNumber: String = numberFieldSecond.text.toString()

            if (numberFieldFirst.text.isEmpty() || numberFieldSecond.text.isEmpty()) {
                Toast.makeText(applicationContext, "Enter the Value", Toast.LENGTH_SHORT).show()
            } else {
                result.text = (firstNumber.toInt() * secondNumber.toInt()).toString()
            }

        }

        btndiv.setOnClickListener {
            val firstNumber: String = numberFieldFirst.text.toString()
            val secondNumber: String = numberFieldSecond.text.toString()

            if (numberFieldFirst.text.isEmpty() || numberFieldSecond.text.isEmpty()) {
                Toast.makeText(applicationContext, "Enter the Value", Toast.LENGTH_SHORT).show()
            } else {
                if (secondNumber.toInt() != 0) {
                    result.text = (firstNumber.toInt() * secondNumber.toInt()).toString()
                } else {
                    Toast.makeText(applicationContext, "It is impossible to divide by zero", Toast.LENGTH_LONG).show()
                }
            }
        }

    }
}

