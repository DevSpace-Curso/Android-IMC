package com.example.meuprimeiroapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)


        val tvResult = findViewById<TextView>(R.id.textview_result)
        val tvClassificacao = findViewById<TextView>(R.id.textview_classificacao)
        val result =  intent.getFloatExtra("EXTRA_RESULT", 0.1f)

        tvResult.text = result.toString()


        /* TABELA IMC
        menor que 18,5      Abaixo do peso
        entre 18,5 e 24,9   Normal
        entre 25,0 e 29,9   Sobrepeso
        entre 30,0 e 39,9   Obesidade
        maior qUe 40,0      Obesidade Grave III
         */


        var classificacao = ""

        if(result < 18.5f) {
            classificacao = "ABAIXO DO PESO"
        } else if (result >= 18.5 && result <= 24.9) {
            classificacao = "NORMAL"
        } else if(result >= 25.0 && result <= 29.9) {
            classificacao = "SOBREPESO"
        } else if(result >= 30.0 && result <= 39.9) {
            classificacao = "OBESIDADE"
        }  else {
            classificacao = "OBESIDADE GRAVE III"
        }

       tvClassificacao.text = classificacao
    }
}