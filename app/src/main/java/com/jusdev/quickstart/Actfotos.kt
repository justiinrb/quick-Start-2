package com.jusdev.quickstart

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.volley.Request
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.bumptech.glide.Glide
import com.jusdev.quickstart.databinding.ActivityActfotosBinding
import com.jusdev.quickstart.databinding.ActivityMainBinding

class Actfotos : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView

    //lateinit var binding: ActivityActfotosBinding
    val AdapterImages: AdapterImage = AdapterImage(this, listadoimgs = listOf())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_actfotos)
        //  binding = ActivityActfotosBinding.inflate(layoutInflater)
        recyclerView = findViewById<RecyclerView>(R.id.rvimagen)
        val datos = this.intent.extras
        var raza = datos!!.getString("raza").toString()

        /*if (intent.extras != null) {
            Glide.with(this).load(intent.getStringExtra("imageUrl"))
                .into(findViewById(R.id.imageDog))

        }*/

        //binding.title.text = " Imagenes " + raza.replaceFirstChar { it.uppercase() }

        descargar_imagenes(raza)
    }

    fun descargar_imagenes(raza: String) {
        recyclerView.layoutManager = LinearLayoutManager(this)

        var url = "https://dog.ceo/api/breed/" + raza + "/images"

        val solicitud = JsonObjectRequest(Request.Method.GET, url, null,
            { response ->
                try {
                    if (response.getString("status") == "success") {
                        Toast.makeText(this, "Descarga Exitosa", Toast.LENGTH_SHORT).show()

                        val arrayDatos = response.getJSONObject("message")
                        val items: MutableList<String> = arrayListOf()

                        for (i in 0 until arrayDatos.length()) {
                            var item = arrayDatos.get(i.toString())
                            var nombres = raza + "IMG" + i.toString()
                            //items.add(item)
                        }
                        /* binding.rvimagen.setHasFixedSize(true)
                         binding.rvimagen.layoutManager = LinearLayoutManager(this)
                         binding.rvimagen.adapter = AdapterImages*/
                      //  AdapterImages.AdapterImages(items, this)
                        recyclerView.adapter = AdapterImages

                    } else {

                        //binding.title.text = "Ah ocurrido un error"
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

        val sxx = Volley.newRequestQueue(this)
        sxx.add(solicitud)

    }


}