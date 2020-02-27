package com.example.gestorpessoal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.gestorpessoal.entidades.Gastos
import kotlinx.android.synthetic.main.activity_gastos.*

class GastosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gastos)
        var gastos = intent.getSerializableExtra("gastos") as? Gastos
        lista_gastos.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, gastos!!.listaGastos)




    }
    fun redAddGasto(view:View){
//        var intent = Intent(this, AdicionarGastoActivity::class.java)
//        startActivity(intent)
        var gastos = intent.getSerializableExtra("gastos") as? Gastos
        gastos!!.listaGastos.forEach{
            println(it.descricao)
            println(it.valor)
        }
    }


}
