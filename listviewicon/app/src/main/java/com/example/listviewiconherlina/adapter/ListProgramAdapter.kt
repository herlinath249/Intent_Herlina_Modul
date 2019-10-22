package com.example.listviewiconherlina.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.listviewiconherlina.R
import com.example.listviewiconherlina.model.Program

class ListProgramAdapter (
    private val daftarprogram: ArrayList<Program>) : RecyclerView.Adapter<ListProgramAdapter.ProgramViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProgramViewHolder {
            val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_program, parent, false)
            return ProgramViewHolder(view)
        }

        override fun getItemCount(): Int {
            return daftarprogram.size
        }

        override fun onBindViewHolder(holder: ProgramViewHolder, position: Int) {
            val program = daftarprogram[position]
            holder.tvNama.text = program.nama
            holder.tvDeskripsi.text = program.deskripsi
            Glide.with(holder.itemView.context)
                .load(program.gambar)
                .into(holder.imgGambar)
        }

        inner class ProgramViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            var tvNama: TextView = itemView.findViewById(R.id.tv_item_nama)
            var tvDeskripsi: TextView = itemView.findViewById(R.id.tv_item_deskripsi)
            var imgGambar: ImageView = itemView.findViewById(R.id.img_item_gambar)
        }
    }

