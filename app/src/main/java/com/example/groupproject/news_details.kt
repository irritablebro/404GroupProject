package com.example.groupproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class news_details : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_details)

        startActivity(Intent(this@activity_news_details, SecondActivity::class.java))
    }
}