package com.besmabakirci.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.besmabakirci.calculator.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var number1: Double? = null
    var number2: Double? = null
    var result: Double? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun summation(view: View) {
        number1 = binding.num1.text.toString().toDoubleOrNull()
        number2 = binding.num2.text.toString().toDoubleOrNull()

        if (number1 != null && number2 != null) {
            result = number1!! + number2!!
            binding.resultText.text = "Result: $result"
        } else {
            binding.resultText.text = "Please enter numbers!"
        }
    }

    fun division(view: View) {
        number1 = binding.num1.text.toString().toDoubleOrNull()
        number2 = binding.num2.text.toString().toDoubleOrNull()

        if (number1 != null && number2 != null) {
            result = number1!! / number2!!
            binding.resultText.text = "Result: $result"
        } else {
            binding.resultText.text = "Please enter numbers!"
        }
    }

    fun multiplication(view: View) {
        number1 = binding.num1.text.toString().toDoubleOrNull()
        number2 = binding.num2.text.toString().toDoubleOrNull()

        if (number1 != null && number2 != null) {
            result = number1!! * number2!!
            binding.resultText.text = "Result: $result"
        } else {
            binding.resultText.text = "Please enter numbers!"
        }
    }


    fun subtraction(view: View) {
        number1 = binding.num1.text.toString().toDoubleOrNull()
        number2 = binding.num2.text.toString().toDoubleOrNull()

        if (number1 != null && number2 != null) {
            result = number1!! - number2!!
            binding.resultText.text = "Result: $result"
        } else {
            binding.resultText.text = "Please enter numbers!"
        }
    }
}
