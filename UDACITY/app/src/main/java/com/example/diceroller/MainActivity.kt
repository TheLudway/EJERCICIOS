package com.example.diceroller

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.diceroller.R.layout
import com.example.diceroller.databinding.LayoutBinding
import com.example.diceroller.ui.theme.DiceRollerTheme
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
