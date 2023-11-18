package com.example.iznajmljivanjevozila

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.iznajmljivanjevozila.Login.Login
import com.example.iznajmljivanjevozila.Login.SessionManager
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        if(!SessionManager.isLoggedIn()){
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }


        val korisnickaPodrskaButton = findViewById<Button>(R.id.korisnickaPodrska)

        korisnickaPodrskaButton.setOnClickListener {

            val intent = Intent (this, KorisnickaPodrska::class.java)
            startActivity(intent)
        }
    }
}