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

        var jus : Persona = Persona("Justin",4,26)
        jus.caminar()
        jus.correr()

        var stef : Persona = Persona("stef",29,58)
        stef.caminar()
        
    }







}





