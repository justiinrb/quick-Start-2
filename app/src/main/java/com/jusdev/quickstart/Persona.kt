package com.jusdev.quickstart

import android.util.Log

class Persona ( nom : String, ed:Int,pe: Int,){
    private var nombre = nom
    private var edad = ed
    private var peso = pe
    var altura : Double = 0.0
        get() = field
        set(al) {
if(al < 1.60){
    field = + 0.02
}

        }

    private fun correr(){
        Log.v("co",nombre+" tiene "+edad+" años y esta corriendo")
    }
    fun caminar(){
        Log.v("ca",nombre+" eta caminando pq tiene un de "+peso+" kg")
    correr()
    }

}