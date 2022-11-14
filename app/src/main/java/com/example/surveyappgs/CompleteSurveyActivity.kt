package com.example.surveyappgs

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class CompleteSurveyActivity : AppCompatActivity() {

    private lateinit var nextButton: Button
    private lateinit var nameEditText: EditText
    private lateinit var phoneEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nextButton = findViewById(R.id.next_button_1)
        nameEditText = findViewById(R.id.name_edTx)
        phoneEditText = findViewById(R.id.phone_edTx)

        nextButton.setOnClickListener {
            if (nameEditText.text.toString().isEmpty()) {
                Toast.makeText(this, "Fill Name To Continue", Toast.LENGTH_SHORT).show()

            } else if (phoneEditText.text.toString().isEmpty()) {

                Toast.makeText(this, "Fill Phone Number To Continue", Toast.LENGTH_SHORT).show()
            } else {

                val nameText = nameEditText.text.toString()
                val phoneText = phoneEditText.text.toString()
                val resultText = StringBuilder().append(nameText).append(phoneText).toString()
                Toast.makeText(this, resultText, Toast.LENGTH_SHORT).show()
                val intent = Intent(this, SecondActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}