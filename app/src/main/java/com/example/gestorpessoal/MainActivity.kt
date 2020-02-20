package com.example.gestorpessoal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun redGastos(view:View){
        var intent = Intent(this, GastosActivity::class.java)
        startActivity(intent)
    }
    fun redNGasto(view:View){
        var intent = Intent(this, AdicionarGastoActivity::class.java)
        startActivity(intent)
    }
}
