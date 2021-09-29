package com.example.remot_assignment

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity() {
    lateinit var tv2 : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        tv2 = findViewById(R.id.textView3)
        val str1 = intent.getStringExtra("name")
        val str2= intent.getStringExtra("location")
        val str3 = intent.getStringExtra("number")
        tv2.text = "$str1 $str2 $str3"


    }
}