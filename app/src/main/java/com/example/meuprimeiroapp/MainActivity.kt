package com.example.meuprimeiroapp

import android.content.Intent
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
        val edtPeso: EditText = findViewById(R.id.edittext_peso)
        val edtAltura: EditText = findViewById(R.id.edittext_altura)
        /*val tvResultado: TextView = findViewById(R.id.txtMsg)*/

        btnCalcular.setOnClickListener{
           val altura: Float = edtAltura.text.toString().toFloat()
            val alturaFinal: Float = altura * altura
            val peso: Float = edtPeso.text.toString().toFloat()
            val result: Float = peso / alturaFinal

           /* tvResultado.text = result.toString()*/

            val intent = Intent(this, ResultActivity::class.java)
                .apply{
                    putExtra("EXTRA_RESULT", result)
                }

            startActivity(intent)
        }

    }
}