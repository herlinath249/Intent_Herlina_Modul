package com.example.listviewiconherlina.model

import com.example.listviewiconherlina.R

object DataProgram {
    private val programName = arrayOf(
        "Ruby",
        "Ralis",
        "Phyton",
        "Java Script",
        "PHP"
    )

    private val deskripsi = arrayOf(
        "Ruby is an open-source and fully object-oriented programming language",
        "Ruby on Ralis is a server-side web application development framework written in Rubby language",
        "Phyton is interpreted scripting and object-oriented programming language",
        "Javascript is an object-based scripting language",
        "PHP is an interpreted language, l.e., there is no need for compilation"
    )

    private val gambarprogram = intArrayOf(
        R.drawable.ruby,
        R.drawable.ralis,
        R.drawable.phyton,
        R.drawable.javascript,
        R.drawable.php
    )

    val daftarProgram: ArrayList<Program>
        get() {
            val daftar = arrayListOf<Program>()
            for (position in programName.indices) {
                val program = Program()
                program.nama = programName[position]
                program.deskripsi = deskripsi[position]
                program.gambar = gambarprogram[position]
                daftar.add(program)
            }
            return daftar
        }
}