package com.jusdev.quickstart

import android.os.Bundle
import android.util.Log
import android.util.Log.println
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity


class MainAct : AppCompatActivity() {
    lateinit var texto: TextView
    //te permite inicializar una propiedad no anulable por fuera del constructor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
texto=findViewById<TextView>(R.id.Text_to) as TextView


       //ciclos - loops - bucles
       //cada elemento dentro de una collecion
       //item in collection
       var arreglo = arrayOf(100,200,300)

       for(valor: Int in arreglo){
           //instruccion.
           Log.v("fo",""+valor)

   }
}



}





