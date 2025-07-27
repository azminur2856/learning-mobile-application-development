package com.mobileappdev.labtaskviewdesign

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
    lateinit var name: EditText
    lateinit var id: EditText
    lateinit var cgpa: EditText
    lateinit var email: EditText
    lateinit var cc: EditText
    lateinit var cse: RadioButton
    lateinit var coe: RadioButton
    lateinit var eee: RadioButton
    lateinit var cpp: CheckBox
    lateinit var cs: CheckBox
    lateinit var kotlin: CheckBox
    lateinit var btnSubmit: Button
    lateinit var view: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        name = findViewById<EditText>(R.id.nameBox)
        id = findViewById<EditText>(R.id.idBox)
        cgpa = findViewById<EditText>(R.id.cgpaBox)
        email = findViewById<EditText>(R.id.emailBox)
        cc = findViewById<EditText>(R.id.ccBox)
        cse = findViewById<RadioButton>(R.id.radioButtonCse)
        coe = findViewById<RadioButton>(R.id.radioButtonCoe)
        eee = findViewById<RadioButton>(R.id.radioButtonEee)
        cpp = findViewById<CheckBox>(R.id.checkBoxCpp)
        cs = findViewById<CheckBox>(R.id.checkBoxCs)
        kotlin = findViewById<CheckBox>(R.id.checkBoxKotlin)
        btnSubmit =findViewById<Button>(R.id.button)
        view = findViewById<TextView>(R.id.textView)

        btnSubmit.setOnClickListener { it: View? ->
            var value = "Name: "+ name.text.toString()
            value+= " \nStudent ID: "+id.text.toString()
            value+= " \nCGPA: "+cgpa.text.toString()
            value+= " \nEmail: "+email.text.toString()
            value+= " \nCompleted Credit: "+cc.text.toString()
            if(cse.isChecked){
                value+= " \nDepartment: "+cse.text
            }
            if(coe.isChecked){
                value+= " \nDepartment: "+coe.text
            }
            if(eee.isChecked){
                value+= " \nDepartment: "+eee.text
            }
            value+=" \nFavorite Language: "
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
