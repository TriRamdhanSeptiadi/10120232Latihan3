package com.example.a10120232latihan3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

// Tanggal Pengerjaan   : 28 April 2023
// Deskripsi Pekerjaan  : Latihan 3 MONITORY "Membuat tampilan Biodata, kita bisa memasukkan Nama Panggilan didalam form yang telah disediakan, tetapi jika form yang diisi kosong maka akan muncul alert, dan bisa berpindah activity ke SayhaiActivity jika menekan button Selanjutnya"
// NIM                  : 10120232
// Nama                 : Tri Ramdhan Septiadi
// Kelas                : IF6

class BiodataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biodata)
        supportActionBar?.hide()

        val btnselanjutnya = findViewById<Button>(R.id.btn_selanjutnya)
        val editnama = findViewById<EditText>(R.id.edit_nama)

        btnselanjutnya.setOnClickListener {
            val nama = editnama.text.toString()

            if (nama.equals("")) {
                Toast.makeText(applicationContext, "Nama nya Masih kosong :(", Toast.LENGTH_SHORT)
                    .show()
            } else {
                Intent(this, SayhaiActivity::class.java).also {
                    it.putExtra("EXTRA_NAMA", nama)
                    startActivity(it)
                }

            }
        }

    }
}