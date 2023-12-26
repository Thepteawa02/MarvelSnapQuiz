package com.example.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val result : TextView = findViewById(R.id.result)

        val score = intent
        var sumscore = intent.getIntExtra("sc", 0)

        result.text = "$sumscore"

    }
}