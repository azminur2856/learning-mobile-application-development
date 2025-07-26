package com.mobileappdev.userform

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var userName: EditText
    lateinit var age: EditText
    lateinit var email: EditText
    lateinit var password: EditText
    lateinit var phone: EditText
    lateinit var btn: Button
    lateinit var view: TextView
    lateinit var maleRB: RadioButton
    lateinit var femaleRB: RadioButton
    lateinit var cpp: CheckBox
    lateinit var cs: CheckBox
    lateinit var kotlin: CheckBox

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        userName = findViewById(R.id.userName)
        age = findViewById(R.id.age)
        email = findViewById(R.id.email)
        password = findViewById(R.id.password)
        phone = findViewById(R.id.phone)
        btn = findViewById(R.id.button)
        view = findViewById(R.id.textView)
        maleRB = findViewById(R.id.radioMale)
        femaleRB = findViewById(R.id.radioFemale)
        cpp = findViewById(R.id.checkBoxCPP)
        cs = findViewById(R.id.checkBoxCS)
        kotlin = findViewById(R.id.checkBoxCotlin)


        btn.setOnClickListener {
            var value = "Name: "+ userName.text.toString()
            value+= " \nAge: "+age.text.toString()
            value+= " \nEmail: "+email.text.toString()
            value+= " \nPassword: "+password.text.toString()
            value+= " \nPhone: "+phone.text.toString()
            if(maleRB.isChecked){
                value+= " \nGender: "+maleRB.text
            }
            if(femaleRB.isChecked){
                value+= " \nGender: "+femaleRB.text
            }
            value+=" \nCourses: "
            if(cpp.isChecked){
                value+=" ,"+ cpp.text.toString()
            }
            if(cs.isChecked){
                value+=" ,"+ cs.text.toString()
            }
            if(kotlin.isChecked){
                value+=" ,"+ kotlin.text.toString()
            }
            view.visibility=View.VISIBLE
            view.setText(value)
        }
    }
}