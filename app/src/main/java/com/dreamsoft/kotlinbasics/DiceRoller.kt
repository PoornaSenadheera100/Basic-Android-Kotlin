package com.dreamsoft.kotlinbasics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
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
        val img_dice : ImageView = findViewById(R.id.img_diceDiceRoller)
        val num = dice.roll()
        if(num == 1){
            img_dice.setImageResource(R.drawable.dice_1)
        }
        else if (num == 2){
            img_dice.setImageResource(R.drawable.dice_2)
        }
        else if (num == 3){
            img_dice.setImageResource(R.drawable.dice_3)
        }
        else if (num == 4){
            img_dice.setImageResource(R.drawable.dice_4)
        }
        else if (num == 5){
            img_dice.setImageResource(R.drawable.dice_5)
        }
        else{
            img_dice.setImageResource(R.drawable.dice_6)
        }


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