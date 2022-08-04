package com.jusdev.quickstart

import android.os.Bundle
import android.util.Log
import android.util.Log.println
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Texto = findViewById<TextView>(R.id.Text_to) as TextView

var resulta : String = notas(7,8,9,9)

        Texto.text = " el resultado es "+resulta
    }

    fun notas (Num1:Int, Num2:Int,Num3:Int,Num4:Int) :String{

        var res : Int = (Num1+Num2+Num3+Num4)/4

        if(res>=7){

            return "feli"

        }else{

            return "no aprobo"


    }

}


}




