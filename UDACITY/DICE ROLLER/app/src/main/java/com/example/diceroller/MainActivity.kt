package com.example.diceroller

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.ComponentActivity
import com.example.diceroller.databinding.LayoutBinding
import kotlin.random.Random as Random

class MainActivity : ComponentActivity() {
    private lateinit var binding: LayoutBinding
    lateinit var diceImage: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rollButton.text = "Presionar para girar!"
        binding.rollButton.setOnClickListener {
            rollDice()
        }

        diceImage = binding.diceImage

    }

    private fun rollDice() {
        val randomInt = Random.nextInt(6) + 1
        val drawableResource = when (randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
    }
}
