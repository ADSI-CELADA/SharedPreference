package com.example.practice

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Pantalla2 : AppCompatActivity() {

    var txtUsuario: TextView?=null
    var txtPass: TextView?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla2)

        val buttonP2 = findViewById<Button>(R.id.pantalla1)

        buttonP2.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        txtUsuario=findViewById(R.id.txtUsuario)
        txtPass=findViewById(R.id.txtPass)
        cargarDatos()

    }

    private fun cargarDatos() {
        val preferences: SharedPreferences =getSharedPreferences("credenciales", Context.MODE_PRIVATE)

        val user: String? =preferences.getString("user","No existe la información")
        val pass: String? =preferences.getString("pass","No existe la información")

        txtUsuario?.text=user
        txtPass?.text=pass

    }
}