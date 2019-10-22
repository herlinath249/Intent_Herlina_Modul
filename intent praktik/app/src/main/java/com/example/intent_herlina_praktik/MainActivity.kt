package com.example.intent_herlina_praktik

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val id:Int = 10
    val language:String = "kotlin"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_klik.setOnClickListener {
            intent = Intent(this, ActivityKedua::class.java)
            intent.putExtra("id_value", id)
            intent.putExtra("language_values", language)
            startActivity(intent)
        }
    }
}
