package com.example.myunitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_weightconverter.*


class WeightConverter : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weightconverter)

        kiloToPoundBtn.setOnClickListener {
            ConvertFromKiloToPounds()
            Toast.makeText(this,"Kilogram to Pound Converted!",Toast.LENGTH_SHORT).show()
        }

        kiloToGramBtn.setOnClickListener {
            ConvertFromKiloToGrams()
            Toast.makeText(this,"Kilogram to Gram Converted!",Toast.LENGTH_SHORT).show()
        }

        poundTogramBtn.setOnClickListener {
            ConvertFromPoundToGrams()
            Toast.makeText(this,"Pound to Gram Converted!",Toast.LENGTH_SHORT).show()
        }

        tonToKiloBtn.setOnClickListener {
            ConvertFromTonToKilo()
            Toast.makeText(this,"Ton to Kilogram Converted!",Toast.LENGTH_SHORT).show()
        }
    }

        fun ConvertFromKiloToPounds() {
            val input = editText.text.toString()          //Extracting from edit text
            var kilo: Double? = input.toDouble()          //Kotlin convert String to Double
            var pounds = kilo?.times(2.20)          //converting kilo to pounds
            textViewConverted.setText("In pounds : " + pounds)
        }

        fun ConvertFromKiloToGrams() {
            val input = editText.text.toString()
            var kilo: Double? = input.toDouble()
            var grams = kilo?.times(1000)
            textViewConverted.setText("In grams : " + grams)
        }

        fun ConvertFromPoundToGrams() {
            val input = editText.text.toString()
            var pound: Double? = input.toDouble()
            var grams = pound?.times(453.59)
            textViewConverted.setText("In grams : " + grams)
        }

        fun ConvertFromTonToKilo(){
            val input = editText.text.toString()
            var ton: Double? = input.toDouble()
            var kilo = ton?.times(907.18)
            textViewConverted.setText("In kilograms : " + kilo)
        }

}


