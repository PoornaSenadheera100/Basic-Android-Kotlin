package com.dreamsoft.kotlinbasics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class DiceRoller : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice_roller)

        val btn_roll : Button = findViewById(R.id.btn_roll)


        btn_roll.setOnClickListener {
            val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show()
            rollDice()
        }
    }

    private fun rollDice(){
        val dice = Dice(6)
        val tv_result : TextView = findViewById(R.id.tv_result)
        tv_result.text = dice.roll().toString()
    }

    public fun onClickBtnLuckyDiceRoll(view: View){
        val intent = Intent(this, LuckyDiceRoll::class.java)
        startActivity(intent)
    }
}

class Dice(val numOfSides : Int){
    fun roll() : Int {
        return (1..numOfSides).random()
    }
}