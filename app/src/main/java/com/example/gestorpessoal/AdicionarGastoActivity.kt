package com.example.gestorpessoal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Toast
import com.example.gestorpessoal.entidades.Gastos
import kotlinx.android.synthetic.main.activity_adicionar_gasto.*
import java.util.*
import kotlin.concurrent.schedule
import android.os.Looper
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T

import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.util.Log


class AdicionarGastoActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adicionar_gasto)

    }
    fun addGasto(view:View){
        var gastos = intent.getSerializableExtra("gastos") as Gastos
        gastos.addOperacao(eValor.text.toString().toDouble(), eDescricao.text.toString())
        gastos.listaGastos.forEach{
            println(it.descricao)
            println(it.valor)
        }
    }
}
