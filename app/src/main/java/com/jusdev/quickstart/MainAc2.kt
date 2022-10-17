package com.jusdev.quickstart

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.volley.Request
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.jusdev.quickstart.databinding.ActivityMainAc2Binding
import com.jusdev.quickstart.modelo.Animal

class MainAc2 : AppCompatActivity(), RecyclerAdapter.OnAnimaClickListener {
    lateinit var texto: TextView
    lateinit var recyclerView: RecyclerView
    //te permite inicializar una propiedad no anulable por fuera del constructor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_ac2)
        recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        //setupRecyclerView()
        Cargar_Listad_De_Razas()
    }

    private fun setupRecyclerView() {
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))


        var img =
            "https://wrmx00.epimg.net/radio/imagenes/2022/08/08/martha_debayle/1659975395_023297_1659975783_noticia_normal_recorte1.jpg"
        val lisAnimales = arrayOf(
            Animal(
                "Gato",
                img
            ),
            Animal(
                "Perro",
                "https://humanidades.com/wp-content/uploads/2017/02/perro-1-e1561678907722.jpg"
            ),
            Animal(
                "Tigre",
                "https://img.freepik.com/foto-gratis/tigre-mirando-boca-abierta_1150-18083.jpg?w=360&t=st=1664822170~exp=1664822770~hmac=26ed60dbdc010613e72aaadcf6b577dd20e787fcd2e52be556d3577fb248d24e"
            ),
            Animal(
                "Pantera",
                "https://i.pinimg.com/564x/87/4f/00/874f00b0e6a9f0c905433bf6d3b50979.jpg"
            )
        )
        Log.v("listasize", ":" + lisAnimales.size)
        Toast.makeText(
            applicationContext,
            "this is toast message" + lisAnimales.size,
            Toast.LENGTH_SHORT
        ).show()

        //recyclerView.adapter = RecyclerAdapter(this, lisAnimales, this)

    }
    fun Cargar_Listad_De_Razas() {

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
//        https://dog.ceo/api/breeds/list/all
        val url = "https://dog.ceo/api/breeds/list/all"
        val solicitud = JsonObjectRequest(
            Request.Method.GET, url, null,
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
                        recyclerView.adapter = RecyclerAdapter(this, items, this)

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
     //        recyclerView.adapter = AdapterRaza(this, listadoPrinci = listOf())

    }


    override fun OnImageClick(image: String) {
        val intent = Intent(this, ImageDetail::class.java)
        intent.putExtra("imageUrl", image)
        startActivity(intent)
    }

    override fun OnItemClick(nombre: String) {
        Toast.makeText(this ,"El nombre del animal es : $nombre", Toast.LENGTH_SHORT).show()
        val intent = Intent(this, Actfotos::class.java)
        intent.putExtra("raza", nombre)
        startActivity(intent)


    }
}