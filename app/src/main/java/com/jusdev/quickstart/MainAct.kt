package com.jusdev.quickstart

import android.os.Bundle
import android.util.Log
import android.util.Log.println
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity


class MainAct : AppCompatActivity() {
    lateinit var texto: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Texto = findViewById<TextView>(R.id.Text_to) as TextView


        var numero = 0
        do{
            //instruccion
          Log.v("men","Hola do while")
            numero++
        } while (numero <= 4)

        var num =   2
        var i = 1
        do {
            Log.v("inst","2 * $i = " + num * i  )
            i++
        }while (i< 11)

    }


}





