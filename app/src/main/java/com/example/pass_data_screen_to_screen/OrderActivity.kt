package com.example.pass_data_screen_to_screen

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class OrderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        // key from MainActivity
        val customerOrders = intent.getStringExtra(MainActivity.KEY)
        val textViewOrder = findViewById<TextView>(R.id.textViewOrder)

        textViewOrder.text = customerOrders.toString()
    }
}