package com.jusdev.quickstart

import android.os.Bundle
import android.util.Log
import android.util.Log.println
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sumaN(5 ,6 )
        datos("jkustin", "Roca")

    }
    fun sumaN (num1:Int,num2 : Int){
        var suma = num1 + num2
        Log.v("sum","La suma de los numeros es"+suma)
    }

    fun datos(nombre:String, apellido:String){

        var nombre = nombre
        var apellido = apellido

        Log.v("dat","Sus datos son "+nombre+" "+apellido)
    }
}




