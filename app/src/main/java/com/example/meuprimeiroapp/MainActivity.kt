package com.example.meuprimeiroapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val btnCalcular: Button = findViewById(R.id.btnCalcular)

        btnCalcular.setOnClickListener{
            val altura: Float = 1.75f * 1.75f
            val peso: Int = 83

            val result = peso / altura

            println("Yasmim Ferreira " + result)
        }
    }
}