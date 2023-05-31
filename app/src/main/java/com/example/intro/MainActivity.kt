package com.example.intro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var button:Button
    lateinit var buttonSingup: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button=findViewById(R.id.button_lebron)
        buttonSingup=findViewById(R.id.btn_signup)

        button.setOnClickListener {
            val  intent = Intent(this,lebronActivity::class.java)
            startActivity(intent)

        buttonSingup.setOnClickListener {
            val mimi = Intent(this,SingupActivity::class.java)
            startActivity(mimi)

        }

        }
    }
}