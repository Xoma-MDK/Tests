package com.example.tests

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var counter1: Int = 1
    private var counter2: Int = 1
    private var counter3: Int = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tvCounter1: TextView = findViewById(R.id.tvItem1Counter)
        val tvCounter2: TextView = findViewById(R.id.tvItem2Counter)
        val tvCounter3: TextView = findViewById(R.id.tvItem3Counter)
        val tvPrice1: TextView = findViewById(R.id.tvDress)
        val tvPrice2: TextView = findViewById(R.id.TvCross)
        val tvPrice3: TextView = findViewById(R.id.TvShapka)
        tvCounter1.text = counter1.toString()
        tvCounter2.text = counter2.toString()
        tvCounter3.text = counter3.toString()
        tvPrice1.text = "${900*counter1} руб."
        tvPrice2.text = "${7000*counter2} руб."
        tvPrice3.text = "${1200*counter3} руб."
        val btn1plus: Button = findViewById(R.id.btnItem1plus)
        val btn1minus: Button = findViewById(R.id.btnItem1minus)
        val btn2plus: Button = findViewById(R.id.btnItem2plus)
        val btn2minus: Button = findViewById(R.id.btnItem2minus)
        val btn3plus: Button = findViewById(R.id.btnItem3plus)
        val btn3minus: Button = findViewById(R.id.btnItem3minus)
        val btnBuy: Button = findViewById(R.id.btnBuy)
        btnBuy.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)

            }
        btn1plus.setOnClickListener {
            if (counter1 >= 10){
                counter1 = 1
                tvCounter1.text = "$counter1"
            }
            else{
                tvCounter1.text = "${++counter1}"
            }
            tvPrice1.text = "${900*counter1} руб."
        }
        btn1minus.setOnClickListener {
            if (counter1 <= 1){
                counter1 = 1
                tvCounter1.text = "$counter1"
            }
            else{
                tvCounter1.text = "${--counter1}"
            }
            tvPrice1.text = "${900*counter1} руб."
        }
        btn2plus.setOnClickListener {
            if (counter2 >= 10){
                counter2 = 1
                tvCounter2.text = "$counter2"
            }
            else{
                tvCounter2.text = "${++counter2}"
            }
            tvPrice2.text = "${7000*counter2} руб."
        }
        btn2minus.setOnClickListener {
            if (counter2 <= 1){
                counter2 = 1
                tvCounter2.text = "$counter2"
            }
            else{
                tvCounter2.text = "${--counter2}"
            }
            tvPrice2.text = "${7000*counter2} руб."
        }
        btn3plus.setOnClickListener {
            if (counter3 >= 10){
                counter3 = 1
                tvCounter3.text = "$counter3"
            }
            else{
                tvCounter3.text = "${++counter3}"
            }
            tvPrice3.text = "${1200*counter3} руб."
        }
        btn3minus.setOnClickListener {
            if (counter3 <= 1){
                counter3 = 1
                tvCounter3.text = "$counter3"
            }
            else{
                tvCounter3.text = "${--counter3}"
            }
            tvPrice3.text = "${1200*counter3} руб."
        }
    }
}