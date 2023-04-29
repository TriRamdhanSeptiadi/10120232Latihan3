package com.example.a10120232latihan3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

// Tanggal Pengerjaan   : 28 April 2023
// Deskripsi Pekerjaan  : Latihan 3 MONITORY "Membuat tampilan Say Hai, didalamnya terdapat kata-kata terasuk nama yang telah dimasukkan kedalam form Nama Panggilan Kamu"
// NIM                  : 10120232
// Nama                 : Tri Ramdhan Septiadi
// Kelas                : IF6

class SayhaiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sayhai)
        supportActionBar?.hide()

        val texthasil = findViewById<TextView>(R.id.txt_hasil)

        val nama = intent.getStringExtra("EXTRA_NAMA")

        val hasilData = "Beres! Sekarang $nama \n" +
                "udah bisa ngecek \n" +
                "penggunaan HP mu \n" +
                "tiap hari buat bantu $nama \n" +
                "ngatur waktu :)"

        texthasil.text = hasilData
    }
}