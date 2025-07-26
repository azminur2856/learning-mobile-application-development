package com.mobileappdev.userinterfacedesign

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    //var textView: TextView?=null //Null safety feature
    lateinit var textView: TextView
    lateinit var btn: Button
    lateinit var textField: EditText
    lateinit var textView2: TextView
    lateinit var btn2: Button

    @SuppressLint("SetTextI18n", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        textView = findViewById<TextView>(R.id.tv1)
        btn = findViewById(R.id.btn1)

        btn.setOnClickListener {
            textView.setText("Hi There")
        }

        textField = findViewById(R.id.et1)
        textView2 =findViewById(R.id.tv2)
        btn2 = findViewById(R.id.btn2)

        btn2.setOnClickListener {
            val input = textField.text.toString()
            textView2.visibility= View.VISIBLE
            textView2.setText(input)

        }
    }
}