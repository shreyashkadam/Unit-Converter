package com.example.myunitconverter

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_lengthconverter.*
import kotlinx.android.synthetic.main.activity_lengthconverter.editText
import kotlinx.android.synthetic.main.activity_lengthconverter.textViewConverted

class LengthConverter : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lengthconverter)

        kilometerToMeterBtn.setOnClickListener {
            ConvertKiloMeterToMeter()
            Toast.makeText(this,"Kilometer to Meter Converted!", Toast.LENGTH_SHORT).show()
        }

        meterToCentimeterBtn.setOnClickListener {
            ConvertMeterToCentimeter()
            Toast.makeText(this,"Meter to Centimeter Converted!",Toast.LENGTH_SHORT).show()
        }

        centimeterToMillimeterBtn.setOnClickListener {
            ConvertCentimeterToMillimeter()
            Toast.makeText(this,"Centimeter To Millimeter Converted!",Toast.LENGTH_SHORT).show()
        }

        footToInchBtn.setOnClickListener {
            ConvertFootToInch()
            Toast.makeText(this,"Foot To Inch Converted!",Toast.LENGTH_SHORT).show()
        }

        inchToFootBtn.setOnClickListener {
            ConvertInchToFoot()
            Toast.makeText(this,"Inch To Foot Converted!",Toast.LENGTH_SHORT).show()
        }

    }

    fun ConvertKiloMeterToMeter(){
        val input = editText.text.toString()
        var kilometer: Double? = input.toDouble()
        var meter = kilometer?.times(1000)
        textViewConverted.setText("In meters : " + meter)
    }

    fun  ConvertMeterToCentimeter(){
        val input = editText.text.toString()
        var meter: Double? = input.toDouble()
        var centimeter = meter?.times(100)
        textViewConverted.setText("In centimeters : " + centimeter)
    }

    fun ConvertCentimeterToMillimeter(){
        val input = editText.text.toString()
        var centimeter: Double? = input.toDouble()
        var millimeter = centimeter?.times(10)
        textViewConverted.setText("In millimeters : " + millimeter)
    }

    fun  ConvertFootToInch(){
        val input = editText.text.toString()
        var foot: Double? = input.toDouble()
        var inch = foot?.times(12)
        textViewConverted.setText("In inches : " + inch)
    }

    fun  ConvertInchToFoot(){
        val input = editText.text.toString()
        var inch: Double? = input.toDouble()
        var foot = inch?.times(0.083)
        textViewConverted.setText("In feet : " + foot)
    }




}