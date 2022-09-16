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

var Articulo1 = Articulo1(1,"Computadora",Precio.Barato)

        Log.v("ar",""+Articulo1)
Articulo1.desc = "Laptop"
        Articulo1.Precio = Precio.Caro
        Log.v("lp",""+Articulo1)


    }
data class Articulo1 (var codigo : Int,var desc : String, var Precio: Precio)
//enum constantes
    enum class Precio{
        Barato,
        Justo,
        Caro


    }







}





