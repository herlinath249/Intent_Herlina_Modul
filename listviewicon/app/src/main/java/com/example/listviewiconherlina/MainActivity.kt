package com.example.listviewiconherlina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listviewiconherlina.adapter.ListProgramAdapter
import com.example.listviewiconherlina.model.DataProgram
import com.example.listviewiconherlina.model.Program
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

        private lateinit var rvProgram: RecyclerView
        private var daftar: ArrayList<Program> = arrayListOf()

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            rvProgram = findViewById(R.id.rv_program)
            rvProgram.setHasFixedSize(true)
            daftar.addAll(DataProgram.daftarProgram)
            showProgramList()
        }

        private fun showProgramList() {
            rvProgram.layoutManager = LinearLayoutManager(this)
            val listProgramAdapter = ListProgramAdapter(daftar)
            rvProgram.adapter = listProgramAdapter
        }
    }

