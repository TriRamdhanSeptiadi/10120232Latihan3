package com.example.a10120232latihan3

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

// Tanggal Pengerjaan   : 28 April 2023
// Deskripsi Pekerjaan  : Latihan 3 MONITORY "Membuat tampilan Login, kita bisa memasukkan kode keluarga didalam form yang telah disediakan, tetapi jika form yang diisi kosong maka akan muncul alert, dan bisa berpindah activity ke BiodataActivity jika menekan button masuk"
// NIM                  : 10120232
// Nama                 : Tri Ramdhan Septiadi
// Kelas                : IF6

class LoginActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()

        val btnmasuk = findViewById<Button>(R.id.btn_masuk)

        btnmasuk.setOnClickListener{
            val editinputcode = findViewById<EditText>(R.id.edit_input_code).text.toString()

            if(editinputcode.equals("")){
                Toast.makeText(applicationContext,"Kode Keluarga Kosong :(",Toast.LENGTH_SHORT).show()
            }else{
                val intentBiasa = Intent(this, BiodataActivity::class.java)
                startActivity(intentBiasa)
            }


        }


    }
}