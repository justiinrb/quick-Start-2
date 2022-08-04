package com.jusdev.quickstart

import android.os.Bundle
import android.util.Log
import android.util.Log.println
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
lateinit var texto :TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Texto = findViewById<TextView>(R.id.Text_to) as TextView

        var calificacion = 5
      when(calificacion){

          6-> Texto.text = "Rerprobado"
          7-> Texto.text = "puede ser mejor"
          8-> Texto.text = "bien"
          3-> Texto.text = "muy bien"
          10-> Texto.text = "Excelente"

          else->{
              Texto.text = " esta calificacion no esta definida"

          }

      }
    }

}







