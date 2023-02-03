package com.example.meuprimeiroapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalcular: Button = findViewById(R.id.btnCalcular)
        val edtPeso: EditText = findViewById(R.id.editText_peso)
        val edtAltura: EditText = findViewById(R.id.editTextaltura)
        val tvResultado: TextView = findViewById(R.id.txtMsg)

        btnCalcular.setOnClickListener{

            val altura: Float = edtAltura.text.toString().toFloat()
            val alturaFinal: Float = altura * altura
            val peso: Float = edtPeso.text.toString().toFloat()
            val result = peso / alturaFinal

            tvResultado.text = result.toString()
        }
    }
}