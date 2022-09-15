package com.jusdev.quickstart

import android.util.Log

class Persona ( nom : String, ed:Int,pe: Int){
    var nombre = nom
    var edad = ed
    var peso = pe

    fun correr(){
        Log.v("co",nombre+" tiene "+edad+" años y esta corriendo")
    }
    fun caminar(){
        Log.v("ca",nombre+" eta caminando pq tiene un de "+peso+" kg")
    }

}