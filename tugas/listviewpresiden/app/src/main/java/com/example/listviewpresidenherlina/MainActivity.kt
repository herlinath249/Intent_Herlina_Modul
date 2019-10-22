package com.example.listviewpresidenherlina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listviewpresidenherlina.adapter.ListPresAdapter
import com.example.listviewpresidenherlina.model.Pres
import com.example.listviewpresidenherlina.model.PresData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var rvPres: RecyclerView
    private var daftar: ArrayList<Pres> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvPres = findViewById(R.id.rv_pres)
        rvPres.setHasFixedSize(true)
        daftar.addAll(PresData.daftarPres)
        showPresList()
    }

    private fun showPresList() {
        rvPres.layoutManager = LinearLayoutManager(this)
        //val listPresAdapter = ListPresAdapter(daftar)
        rvPres.adapter = ListPresAdapter(this, daftar){
            Toast.makeText(this,it.deskripsi, Toast.LENGTH_SHORT).show();
        }
    }
}
