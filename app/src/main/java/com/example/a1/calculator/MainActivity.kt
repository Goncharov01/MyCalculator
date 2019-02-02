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
        val edit1 = findViewById<EditText>(R.id.edit1)
        val edit2 = findViewById<EditText>(R.id.edit2)
        val btnadd = findViewById<Button>(R.id.btnadd)
        val result = findViewById<TextView>(R.id.result)
        val btnminus = findViewById<Button>(R.id.btnminus)
        val button4 = findViewById<Button>(R.id.button4)
        val btndiv=findViewById<Button>(R.id.btndiv)
        // Hello
        btnadd.setOnClickListener {
            val q: String = edit1.text.toString()
            val w: String = edit2.text.toString()

            if (edit1.text.isEmpty() || edit2.text.isEmpty()) {
                Toast.makeText(applicationContext, "Enter The Value", Toast.LENGTH_SHORT).show()
            } else {
                val c = q.toInt()
                val d = w.toInt()
                val e = c + d
                result.setText(e.toString())
            }
        }

        btnminus.setOnClickListener {
            val q: String = edit1.text.toString()
            val w: String = edit2.text.toString()

            if (edit1.text.isEmpty() || edit2.text.isEmpty()) {
                Toast.makeText(applicationContext, "Enter the Value", Toast.LENGTH_SHORT).show()
            } else {
                val e = q.toInt()
                val r = w.toInt()
                val t = e - r
                result.setText(t.toString())
            }

        }
        button4.setOnClickListener {
            val q: String = edit1.text.toString()
            val w: String = edit2.text.toString()

            if (edit1.text.isEmpty() || edit2.text.isEmpty()) {
                Toast.makeText(applicationContext, "Enter the Value", Toast.LENGTH_SHORT).show()
            } else {
                val e = q.toInt()
                val r = w.toInt()
                val t = e * r
                result.setText(t.toString())
            }

        }

        btndiv.setOnClickListener{
            val q: String = edit1.text.toString()
            val w: String = edit2.text.toString()




            if (edit1.text.isEmpty() || edit2.text.isEmpty()) {
                Toast.makeText(applicationContext, "Enter the Value", Toast.LENGTH_SHORT).show()
            } else {
                if(w.toInt() !=0){
                    val e = q.toInt()
                    val r = w.toInt()
                    val t = e / r
                    result.setText(t.toString())
                }  else {Toast.makeText(applicationContext,"It is impossible to divide by zero", Toast.LENGTH_LONG).show()
                } }
        }

    }
}

