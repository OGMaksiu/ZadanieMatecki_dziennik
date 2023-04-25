package com.example.zadaniematecki_dziennik

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.google.android.material.navigation.NavigationView

class Oceny : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.oceny)

        val tablica = intent.getStringArrayExtra("Przerzucanie")

        supportActionBar?.hide()
        val navigationView = findViewById<NavigationView>(R.id.nav_view)
        navigationView.visibility = View.GONE

        findViewById<Button>(R.id.btnwyjdz).setOnClickListener {
            navigationView.visibility = View.GONE
        }


        findViewById<ImageView>(R.id.icon).setOnClickListener {
            navigationView.visibility = View.VISIBLE
        }



        findViewById<Button>(R.id.strgl).setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java).putExtra("Przerzucanie", tablica))
        }


        findViewById<Button>(R.id.oceny).setOnClickListener {
            Toast.makeText(this, "Oceny są już otwarta", Toast.LENGTH_SHORT).show()
        }


        findViewById<Button>(R.id.inf).setOnClickListener {
            startActivity(Intent(this,Informacja_Uzytkownik::class.java).putExtra("Przerzucanie", tablica))
        }
    }
}
