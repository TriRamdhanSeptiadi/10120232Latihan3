package com.example.a10120232latihan3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

// Tanggal Pengerjaan   : 28 April 2023
// Deskripsi Pekerjaan  : Latihan 3 MONITORY "Membuat tampilan Welcome dan bisa berpindah activity ke LoginActivity jika menekan button Mulai"
// NIM                  : 10120232
// Nama                 : Tri Ramdhan Septiadi
// Kelas                : IF6

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnmulai: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        btnmulai = findViewById(R.id.btn_mulai)

        btnmulai.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.btn_mulai -> {
                val intentBiasa = Intent(this@MainActivity, LoginActivity::class.java)
                startActivity(intentBiasa)
            }
        }
    }
}