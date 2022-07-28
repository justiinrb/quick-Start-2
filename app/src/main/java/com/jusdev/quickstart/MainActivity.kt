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
        notas(9.5,9.5,8.0,7.0,4.0)
    }

    fun notas (N1:Double,N2:Double,N3:Double,N4:Double,re:Double){

        var par = (N1+N2+N3+N4)/4


        if(par<=6){
            Log.v("ver","No aprobo el parcial tiene "+par)
        }else{

            Log.v("tiene","aprobo con "+par)
        }


    }



}




