package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var firstNumber: EditText? = null
    var secondNumber: EditText? = null
    var btnSomme : Button? = null
    var result: TextView? = null
    var numersPrimes: String = "";


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        firstNumber = findViewById(R.id.firstNumber) as EditText;
        secondNumber = findViewById(R.id.secondNumber) as EditText;
        btnSomme = findViewById(R.id.btnCalculate) as Button;
        result = findViewById(R.id.tvResult) as TextView;

        btnSomme?.setOnClickListener {
            var valueMinNumber = firstNumber!!.text.toString().toInt();
            var valueMaxNumber = secondNumber!!.text.toString().toInt();

            val mainServices = MainServices()
            numersPrimes = mainServices.getPrimesNumber(valueMinNumber, valueMaxNumber);
            result!!.setText(numersPrimes);
        }

    }
}