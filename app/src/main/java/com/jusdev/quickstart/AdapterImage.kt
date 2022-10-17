package com.jusdev.quickstart

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.jusdev.quickstart.Base.BaseViewHolder
import com.jusdev.quickstart.databinding.ActivityMainBinding
import com.jusdev.quickstart.databinding.PatronimgBinding
import com.jusdev.quickstart.modelo.Animal

class AdapterImage(
    var context: Context,
    var listadoimgs: List<Listadoimg>
//private val itemClickListener: OnDogClickListener
) : RecyclerView.Adapter<BaseViewHolder<*>>() {

    override fun onAttachedToRecyclerView(recyclerView: RecyclerView) {
        super.onAttachedToRecyclerView(recyclerView)
    }
    interface OnDogClickListener {
        fun OnImageClick(images: String)
    }

    fun AdapterImages(Raza: MutableList<Listadoimg>, context: Context) {
        this.listadoimgs = Raza
        this.context = context
    }

//    class gms(var binding: PatronimgBinding):RecyclerView.ViewHolder(binding.root)



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<*> {
        return DogImgs(LayoutInflater.from(context).inflate(R.layout.patronimg, parent, false))
    }

    override fun onBindViewHolder(holder: BaseViewHolder<*>, position: Int) {
        when (holder) {
            is DogImgs -> holder.bind(listadoimgs[position], position)
            else -> throw IllegalArgumentException("se le olvido de pasar un viewholder en el bind")

        }

    }

    override fun getItemCount(): Int = listadoimgs.size

    inner class DogImgs(itemView: View) : BaseViewHolder<Listadoimg>(itemView) {
        override fun bind(item: Listadoimg, position: Int) {

           /* var mgs: ImageView
            mgs = itemView.findViewById(R.id.imageDog)
            itemView.setOnClickListener{itemClickListener.OnImageClick(item.ruta)}*/
            Glide.with(context).load(item.ruta).into(itemView.findViewById(R.id.imageDog))

        }

    }

}