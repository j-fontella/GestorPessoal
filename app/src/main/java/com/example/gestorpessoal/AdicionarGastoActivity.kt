package com.example.gestorpessoal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.gestorpessoal.entidades.Gastos
import kotlinx.android.synthetic.main.activity_adicionar_gasto.*

class AdicionarGastoActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adicionar_gasto)
    }
    fun addGasto(view:View){
        var gasto = Gastos()
        gasto.addOperacao(eValor.text.toString().toDouble(), eDescricao.text.toString())
        intent.putExtra("gastos", gasto)
        startActivity(Intent(this, GastosActivity::class.java))
    }
}
