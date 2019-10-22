package com.example.listviewpresidenherlina.model

import com.example.listviewpresidenherlina.R

object PresData {
    private val presName = arrayOf(
        "Ir. Soekarno",
        "Soeharto",
        "B. J. Habibie",
        "Abdurrahman Wahid",
        "Megawati Soekarno Putri",
        "Susilo Bambang Yudhoyono",
        "Ir. Joko Widodo"
    )

    private val deskripsi = arrayOf(
        "Ir. Soekarno merupakan presiden pertama Republik Indonesia",
        "Soeharto menjabat sebagai presiden yang paling lama yaitu 32 tahun",
        "B.J. Habibie mewarisi kondisi keadaan negara kacau balau pasca pengunduran diri Soeharto pada masa orde baru",
        "Abdurrahman Wahid menggantikan Presiden B.J. Habibie setelah dipilih oleh Majelis Permusyawaratan Rakyat hasil Pemilu 1999",
        "Megawati menjadi presiden setelah MPR mengadakan Sidang Istimewa MPR pada tahun 2001",
        "SBY dicatat sebagai presiden terpilih pertama pilihan rakyat, dan tampil sebagai Presiden Indonesia keenam",
        "Jokowi memulai masa kepresidenannya dengan meluncurkan Kartu Indonesia Sehat, Kartu Indonesia Pintar, dan Kartu Keluarga Sejahtera"
    )

    private val gambarpres = intArrayOf(
        R.drawable.soekarno,
        R.drawable.soeharto,
        R.drawable.habibie,
        R.drawable.gusdur,
        R.drawable.megawati,
        R.drawable.sby,
        R.drawable.jokowi
    )

    val daftarPres: ArrayList<Pres>
        get() {
            val daftar = arrayListOf<Pres>()
            for (position in presName.indices) {
                val pres = Pres()
                pres.nama = presName[position]
                pres.deskripsi = deskripsi[position]
                pres.gambar = gambarpres[position]
                daftar.add(pres)
            }
            return daftar
        }
}