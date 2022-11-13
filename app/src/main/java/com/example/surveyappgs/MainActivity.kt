package com.example.surveyappgs

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

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
            if (nameEditText.text.toString().isEmpty() || phoneEditText.text.toString().isEmpty()) {
                Toast.makeText(this, R.string.clicked, Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, nameEditText.text.toString(), Toast.LENGTH_SHORT).show()
            }
        }
    }
}