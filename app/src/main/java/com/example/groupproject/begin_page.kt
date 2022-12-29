package com.example.groupproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class begin_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_begin_page)
        // 设置延迟 2 秒
        val splashDelay = 2000L
        Handler().postDelayed({
            // 跳转到下一个活动
            startActivity(Intent(this, sign_in::class.java))
            finish()
        }, splashDelay)
    }
}