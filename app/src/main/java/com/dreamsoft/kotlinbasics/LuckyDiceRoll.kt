package com.dreamsoft.kotlinbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LuckyDiceRoll : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lucky_dice_roll)

        val luckyNumber : EditText = findViewById(R.id.et_luckyNumber)
        val result : TextView = findViewById(R.id.tv_resultLuckyRoll)
        val btn_roll : Button = findViewById(R.id.btn_luckyRoll)

        btn_roll.setOnClickListener {
            if(luckyNumber.text.isEmpty()){
                luckyNumber.setError("Enter the Lucky Number")
            }
            else if(Integer.parseInt(luckyNumber.text.toString()) > 6){
                luckyNumber.setError("Enter a number between 1 to 6")
            }
            else{
                val number : Int = (1..6).random()
                result.text = number.toString()

                if(number == Integer.parseInt(luckyNumber.text.toString())){
                    Toast.makeText(this, "You're Lucky!!!", Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(this, "Try Again...", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}