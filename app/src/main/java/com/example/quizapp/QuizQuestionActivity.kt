package com.example.quizapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class QuizQuestionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_question)

        val questionsList = Constants.getQuestions()
        // test check how many questions it is in this app
        Log.i("Questions Size", "${questionsList.size}")
    }
}
