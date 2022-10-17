package com.jusdev.quickstart

import android.content.Context
import android.content.Intent
import android.icu.text.Transliterator.Position
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.jusdev.quickstart.Base.BaseViewHolder
import com.jusdev.quickstart.databinding.ActivityImageDetailBinding
import com.jusdev.quickstart.databinding.PatronlistaBinding

class AdapterRaza(var context: Context, var listadoPrinci: List<ListadoPrinci>) :
    RecyclerView.Adapter<BaseViewHolder<*>>() {


    fun AdapterRazas(Raza: List<ListadoPrinci>, context: Context) {
        this.listadoPrinci = Raza
        this.context = context
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<*> {


        return Dog(LayoutInflater.from(context).inflate(R.layout.patronlista, parent, false))

    }

    override fun onBindViewHolder(holder: BaseViewHolder<*>, position: Int) {

        when (holder) {

            is Dog -> holder.bind(listadoPrinci[position], position)
            else -> IllegalArgumentException("no paso el ViewHolder")

        }

    }

    override fun getItemCount(): Int = listadoPrinci.size

    inner class Dog(itemView: View) : BaseViewHolder<ListadoPrinci>(itemView) {
        override fun bind(item: ListadoPrinci, position: Int) {
            val x: TextView
            x = itemView.findViewById(R.id.nombreraza)
            x.text = item.razas
        }
    }

}

