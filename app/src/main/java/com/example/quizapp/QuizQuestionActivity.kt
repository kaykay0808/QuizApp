package com.example.quizapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.quizapp.databinding.ActivityMainBinding
import com.example.quizapp.databinding.ActivityQuizQuestionBinding

class QuizQuestionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityQuizQuestionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizQuestionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val questionsList = Constants.getQuestions()
        // test check how many questions it is in this app
        Log.i("Questions Size", "${questionsList.size}")

        val currentPosition = 1
        val question: Question? = questionsList[currentPosition -1]

        binding.progressBar.progress = currentPosition
        binding.tvProgress.text ="$currentPosition" + "/" + binding.progressBar.max

        binding.tvQuestion.text = question!!.question

        // This is how we set image resources
        binding.ivImage.setImageResource(question.image)

        binding.tvOptionOne.text = question.optionOne
        binding.tvOptionTwo.text = question.optionTwo
        binding.tvOptionThree.text = question.optionThree
        binding.tvOptionFour.text = question.optionFour

    }
}
