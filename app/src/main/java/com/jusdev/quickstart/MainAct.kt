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
import com.jusdev.quickstart.modelo.Animal

class MainAct : AppCompatActivity(), RecyclerAdapter.OnAnimaClickListener {
    lateinit var texto: TextView
    lateinit var recyclerView: RecyclerView
    //te permite inicializar una propiedad no anulable por fuera del constructor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        setupRecyclerView()

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

        recyclerView.adapter = RecyclerAdapter(this, lisAnimales, this)

    }

    override fun OnImageClick(image: String) {
       val intent = Intent(this, ImageDetail::class.java)
        intent.putExtra("imageUrl", image)
        startActivity(intent)
    }

    override fun OnItemClick(nombre: String) {
        Toast.makeText(this ,"El nombre del animal es : $nombre", Toast.LENGTH_SHORT).show()



    }
}







