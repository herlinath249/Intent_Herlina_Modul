package com.example.listviewpresidenherlina.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.listviewpresidenherlina.R
import com.example.listviewpresidenherlina.model.Pres
import com.example.listviewpresidenherlina.model.PresData.daftarPres

class ListPresAdapter(
    private val context: Context, private val pres: ArrayList<Pres>, private  val listener: (Pres) -> Unit)
    : RecyclerView.Adapter<ListPresAdapter.ViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListPresAdapter.ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_pres, parent, false))
    }

    override fun getItemCount(): Int {
        return daftarPres.size
    }

    override fun onBindViewHolder(holder: ListPresAdapter.ViewHolder, position: Int) {
        holder.bindPres(pres[position], listener)
    }


/*class ListPresAdapter(
private val daftarpres: ArrayList<Pres>) : RecyclerView.Adapter<ListPresAdapter.PresViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PresViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_pres, parent, false)
        return PresViewHolder(view)
    }

    override fun getItemCount(): Int {
        return daftarpres.size
    }

    override fun onBindViewHolder(holder: PresViewHolder, position: Int) {
        val pres = daftarpres[position]
        holder.tvNama.text = pres.nama
        //holder.tvDeskripsi.text = pres.deskripsi
        Glide.with(holder.itemView.context)
            .load(pres.gambar)
            .into(holder.imgGambar)

        holder.itemView.setOnClickListener(
            listener(holder)
        )
    }*/

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvNama: TextView = itemView.findViewById(R.id.tv_item_nama)
        var tvDeskripsi: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgGambar: ImageView = itemView.findViewById(R.id.img_item_gambar)

        fun bindPres(pres: Pres, listener: (Pres) -> Unit) {
            tvNama.text = pres.nama
            Glide.with(itemView.context)
                .load(pres.gambar)
                .into(imgGambar)

            itemView.setOnClickListener {
                listener(pres)
            }
        }
    }
}