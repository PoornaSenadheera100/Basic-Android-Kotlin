package com.dreamsoft.kotlinbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LuckyDiceRoll : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lucky_dice_roll)

        val luckyNumber : EditText = findViewById(R.id.et_luckyNumber)
        val result : TextView = findViewById(R.id.tv_resultLuckyRoll)
        val btn_roll : Button = findViewById(R.id.btn_luckyRoll)

        btn_roll.setOnClickListener {
            val number : Int = (1..6).random()
            result.text = number.toString()
        }
    }
}