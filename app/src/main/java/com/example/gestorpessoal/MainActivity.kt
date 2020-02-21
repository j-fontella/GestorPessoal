package com.example.gestorpessoal

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.gestorpessoal.entidades.Gastos

class MainActivity : AppCompatActivity() {

    var gasto = Gastos()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(resultCode == Activity.RESULT_OK){
            when(requestCode){
                1 -> {
                    gasto = data!!.getSerializableExtra("gastos") as Gastos

                }
            }
        }
    }
    fun redGastos(view:View){
        var intent1 = Intent(this, GastosActivity::class.java)
        intent1.putExtra("gastos", gasto)
        startActivity(intent1)
    }
    fun redNGasto(view:View){
        var intent2 = Intent(this, AdicionarGastoActivity::class.java)
        intent2.putExtra("gastos", gasto)
        startActivityForResult(intent2, 1)
    }
}
