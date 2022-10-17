package com.jusdev.quickstart

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.volley.Request
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.jusdev.quickstart.databinding.ActivityMainBinding
import com.jusdev.quickstart.modelo.Animal

class MainAct : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView

    //lateinit var binding: ActivityMainBinding
    val AdapterRazas: AdapterRaza = AdapterRaza(this, listadoPrinci = listOf())

    //te permite inicializar una propiedad no anulable por fuera del constructor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // binding = ActivityMainBinding.inflate(layoutInflater)
        recyclerView = findViewById<RecyclerView>(R.id.rvrazas)

        setContentView(R.layout.activity_main)

        Cargar_Listad_De_Razas()
    }

    fun Cargar_Listad_De_Razas() {

        recyclerView.layoutManager = LinearLayoutManager(this)

//        https://dog.ceo/api/breeds/list/all
        val url = "https://dog.ceo/api/breeds/list/all"
        val solicitud = JsonObjectRequest(Request.Method.GET, url, null,
            { response ->
                println(response)
                try {
                    if (response.getString("status") == "success") {
                        Toast.makeText(this, "Descarga Exitosa", Toast.LENGTH_SHORT).show()

                        val arrayDatos = response.getJSONObject("message")
                        val items: MutableList<ListadoPrinci> = arrayListOf()

                        var clave = arrayDatos.names()
                        for (i in 0 until clave.length()) {
                            var valor = clave.getString(i)
                            items.add(ListadoPrinci(valor))
                        }

                        /*binding.lbltitle.text = "Mostrando " + clave.length().toString() + " Razas"
                        binding.rvrazas.setHasFixedSize(true)
                        binding.rvrazas.layoutManager = LinearLayoutManager(this)
                        binding.rvrazas.adapter = AdapterRaza*/
                        AdapterRazas.AdapterRazas(items, this)
                        recyclerView.adapter = AdapterRazas
                        println("okkkkkkkk")


                    } else {
                        Toast.makeText(this, "Error al Descargar", Toast.LENGTH_SHORT).show()
                        Log.v("volley", "Error al Descargar")
                        println("Error al Descargar")

                    }
                } catch (e: Exception) {
                    Toast.makeText(this, "$e", Toast.LENGTH_SHORT).show()
                    Log.v("Ex", "$e")
                    println("catch" + e)
                }

            }, {
                Toast.makeText(this, " $it", Toast.LENGTH_SHORT).show()
                Log.v("vl", "$it")
                println("VolleyError" + it)
            })

        val cola = Volley.newRequestQueue(this)
        cola.add(solicitud)
        recyclerView.adapter = AdapterRaza(this, listadoPrinci = listOf())

    }
}







