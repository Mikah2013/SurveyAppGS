package com.example.surveyappgs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class WelcomeActivity : AppCompatActivity() {

    private lateinit var createSurveyButton: Button
    private lateinit var completeSurveyButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        createSurveyButton = findViewById(R.id.create_survey_button)
        completeSurveyButton = findViewById(R.id.complete_survey_button)

        createSurveyButton.setOnClickListener {

            val intent = Intent(this, CreateSurveyActivity::class.java)
            startActivity(intent)
        }

        completeSurveyButton.setOnClickListener {

            val intent = Intent(this, CompleteSurveyActivity::class.java)
            startActivity(intent)
        }

    }
}