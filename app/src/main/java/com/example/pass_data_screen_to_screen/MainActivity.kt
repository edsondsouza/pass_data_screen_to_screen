package com.example.pass_data_screen_to_screen

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    // companion object in kotlin (learn more)
    // creating key
    companion object {
        const val KEY = "com.example.pass_data_screen_to_screen.MainActivity.KEY"
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val order = findViewById<Button>(R.id.orderButton)
        val customerName = findViewById<TextView>(R.id.customerName)
        val firstOrder = findViewById<EditText>(R.id.firstOrder)
        val secondOrder = findViewById<EditText>(R.id.secondOrder)
        val thirdOrder = findViewById<EditText>(R.id.thirdOrder)

        order.setOnClickListener() {
            val orderList = customerName.text.toString() + " " + firstOrder.text.toString() + " " + secondOrder.text.toString() + " " + thirdOrder.text.toString()

            val intent = Intent(this, OrderActivity::class.java)
            intent.putExtra(KEY, orderList)
            startActivity(intent)
        }
    }
}