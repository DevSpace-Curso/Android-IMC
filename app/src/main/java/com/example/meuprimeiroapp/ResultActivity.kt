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


        val classificacao = if (result < 18.5f) {
            "ABAIXO DO PESO"
        } else if (result in 18.5..24.9) {
             "NORMAL"
        } else if(result in 25.0..29.9) {
            "SOBREPESO"
        } else if(result in 30.0..39.9) {
            "OBESIDADE"
        }  else {
             "OBESIDADE GRAVE III"
        }

       tvClassificacao.text = getString(R.string.messsage_classificacao, classificacao)
    }
}