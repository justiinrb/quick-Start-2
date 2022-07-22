package com.jusdev.quickstart

import android.os.Bundle
import android.util.Log
import android.util.Log.println

import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
val hola: String = "hola"
var numero = 1
var palabra: String="malo"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mostrarhola()
        mostardatos()
        }
fun mostrarhola(){
    Log.v("mostrar","Hola kotlin")
}
    fun mostardatos() {
Log.v("datos","nombre , apellido")
    }

    }




