package com.jusdev.quickstart

import android.os.Bundle
import android.util.Log

import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
val hola: String = "hola"
var numero = 1
var palabra: String="malo"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.v( "numero",":"+numero)
        Log.v( "palabra",":"+palabra)

numero =  2
palabra = "malo"

        }


    }




