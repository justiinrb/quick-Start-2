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

        var justin : Persona = Persona("",23,15)

        justin.altura = 1.60

        Log.v("al", " "+justin.altura)

    }







}





