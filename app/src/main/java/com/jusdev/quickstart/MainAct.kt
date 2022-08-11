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


        while (numero < 5) {

            Log.v("Res", "hola")

            numero++
        }
        var dia = 1
        Log.v("ds","Empieza la semana")

        while(dia < 6){
            if (dia == 1){
                Log.v("Dia","$dia dias  laboral")
            }else{
                Log.v("dy","$dia Dia laboral")
            }
            dia++
        }
        Log.v("in","Dia de descanso")
    }


}





