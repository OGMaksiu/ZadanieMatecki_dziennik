
package com.example.zadaniematecki_dziennik



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.navigation.NavigationView

class Informacja_Uzytkownik : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.informacja_uzytkownik)

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
            startActivity(Intent(this,MainActivity::class.java).putExtra("Przerzucanie", tablica))
        }


        findViewById<Button>(R.id.oceny).setOnClickListener {
            startActivity(Intent(this, Oceny::class.java).putExtra("Przerzucanie", tablica))
        }


        findViewById<Button>(R.id.inf).setOnClickListener {
            Toast.makeText(this, "Informacja jest już otwarta", Toast.LENGTH_SHORT).show()
        }

        findViewById<TextView>(R.id.imieid).text = tablica?.get(0)
        findViewById<TextView>(R.id.nazwiskoid).text = tablica?.get(1)
        findViewById<TextView>(R.id.klasaid).text = "Klasa: " + tablica?.get(2)
        findViewById<TextView>(R.id.nickid).text = "Nick: " + tablica?.get(3)
    }
}