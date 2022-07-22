package com.jusdev.quickstart

import android.os.Bundle
import android.util.Log
import android.util.Log.println

import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    val hola: String = "hola"
    var numero = 1
    var palabra: String = "malo"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        SumaNum(15,6)
        mostrarDatos("Justin","Rocafuerte",17)
diviNum(20, 2)
    }

    fun SumaNum(num1:Int,num2:Int){
        var suma = num1+num2

        Log.v("re","Resultado "+suma)

    }
    fun mostrarDatos(nombre:String,apellido:String,edad:Int){

        var nombre = nombre
        var  apellido = apellido
        var edad = edad
Log.v("datos","mostrar "+nombre +" "+apellido +" " +edad)
    }

fun diviNum(mn1:Int,mn2:Int){
    var division = mn1/mn2
    Log.v("Alt","Resultado "+division)

}

}




