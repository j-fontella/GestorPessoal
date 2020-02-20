package com.example.gestorpessoal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.gestorpessoal.entidades.Gastos
import kotlinx.android.synthetic.main.activity_gastos.*

class GastosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gastos)
        var gastos = intent.getSerializableExtra("gastos") as Gastos
        if(gastos.listaGastos.size > 0){
            textView4.text = gastos.listaGastos.get(0).descricao.toString()
            textView.text = gastos.listaGastos.get(0).valor.toString()
        }
        if(gastos.listaGastos.size > 1){
            textView6.text = gastos.listaGastos.get(1).descricao.toString()
            textView7.text = gastos.listaGastos.get(1).valor.toString()
        }

    }
    fun redAddGasto(view:View){
        var intent = Intent(this, AdicionarGastoActivity::class.java)
        startActivity(intent)
    }
}
