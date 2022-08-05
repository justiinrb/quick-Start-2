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

        var numero = 5
var arreglos = arrayOf(5, 100, 48)

        Texto.text = arreglos [2].toString()

      }
    }









