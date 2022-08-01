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
        val Texto = findViewById<TextView>(R.id.Text_to) as TextView

        var resultado: Int = sumaNumeros(45 ,2 ,3 )
        Texto.text = " El valor a retornar es "+resultado
          
    }


    fun sumaNumeros (Num1:Int, Num2:Int,Num3:Int) :Int{
    var sum : Int = Num1+Num2+Num3
    return sum
}
    fun Datos_P(Nombre: String,Apellido:String):String{

        val nombre = Nombre
        val apellido = Apellido

        return nombre ; apellido


    }









}




