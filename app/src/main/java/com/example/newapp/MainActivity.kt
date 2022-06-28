package com.example.newapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //외부 URI열기
        var intent = Intent(Intent.ACTION_VIEW , Uri.parse("https://www.youtube.com/"))
        startActivity(intent)
    }
}