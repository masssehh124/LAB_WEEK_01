package com.example.lab_week_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var tvName: TextView
    private lateinit var tvError: TextView
    private lateinit var etName: EditText
    private lateinit var etStudentNumber: EditText
    private lateinit var btnSubmit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvName = findViewById(R.id.tvName)
        tvError = findViewById(R.id.tvError)
        etName = findViewById(R.id.etName)
        etStudentNumber = findViewById(R.id.etStudentNumber)
        btnSubmit = findViewById(R.id.btnSubmit)

        btnSubmit.setOnClickListener {
            val name = etName.text.toString().trim()
            val studentNumber = etStudentNumber.text.toString().trim()

            if (studentNumber.length != 11) {
                tvError.text = "Student number has to be 11 digits long"
                tvError.visibility = View.VISIBLE
            } else {
                tvError.visibility = View.GONE
                tvName.text = "My name is: $name\nStudent number: $studentNumber"
            }
        }
    }
}