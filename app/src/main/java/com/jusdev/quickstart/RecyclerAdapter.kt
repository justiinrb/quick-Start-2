package com.jusdev.quickstart

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.jusdev.quickstart.Base.BaseViewHolder
import com.jusdev.quickstart.modelo.Animal

class RecyclerAdapter(
    private val context: Context,
    val lista: MutableList<ListadoPrinci>,
    val ItemClickListener: OnAnimaClickListener
    ) : RecyclerView.Adapter<BaseViewHolder<*>>() {
    interface OnAnimaClickListener {
        fun OnImageClick(image: String)
        fun OnItemClick(nombre: String)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<*> {

        return AnimalesViewholder(
            LayoutInflater.from(context).inflate(R.layout.animales_row, parent, false)
        )
    }

    override fun getItemCount(): Int = lista.size

    override fun onBindViewHolder(holder: BaseViewHolder<*>, position: Int) {
        when (holder) {
            is AnimalesViewholder -> holder.bind(lista[position], position)
            else -> throw IllegalArgumentException("se le olvido de pasar un viewholder en el bind")
        }
    }


    inner class AnimalesViewholder(itemView: View) : BaseViewHolder<ListadoPrinci>(itemView) {
        override fun bind(item: ListadoPrinci, position: Int) {
            val ima: ImageView
            //ima = itemView.findViewById(R.id.image_animal)
            //ima.setOnClickListener { ItemClickListener.OnImageClick(item.image) }
            itemView.setOnClickListener { ItemClickListener.OnItemClick(item.razas) }
            //Glide.with(context).load(item.image).into(itemView.findViewById(R.id.image_animal))
            val x: TextView
            x = itemView.findViewById(R.id.txt_nombre_animal)
            x.text = item.razas
        }
    }

}


