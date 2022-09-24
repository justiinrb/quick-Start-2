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
        texto = findViewById<TextView>(R.id.Text_to) as TextView

        val per1 = Persona("justin",17)
        per1.imprimirEdad()

        val prog1 =Programador("viky",39)
        prog1.imprimirNombre()

    }
    open class Persona(val nombre :String, val edad : Int){

        open fun imprimirEdad(){
            Log.v("Nom","Su edad es "+ edad)
        }
        open fun imprimirNombre(){
            Log.v("Nom","Su nombre es "+ nombre)
        }

    }
    class Programador(nombre: String, edad: Int) : Persona(nombre, edad) {

        override fun imprimirNombre(){
            Log.v("Nom","El nombre del programador es "+ nombre)
        }

    }




}







