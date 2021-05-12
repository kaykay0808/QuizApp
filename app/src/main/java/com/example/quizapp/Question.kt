package com.example.quizapp
//in this section we created a class with questions (right click, -> new -> kotlin file class -> class chosen)

// we added data before class and change out curve bracket to parantes
data class Question (
    val id: Int,
    val question: String,
    val image: Int,

    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val optionFour: String,
    val correctAnswer: Int



)