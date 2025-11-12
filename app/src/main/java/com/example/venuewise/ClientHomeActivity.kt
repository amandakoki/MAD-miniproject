package com.example.venuewise

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ClientHomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_client_profile)

        val tvWelcome = findViewById<TextView>(R.id.tvWelcome)
        val btnDiscover = findViewById<Button>(R.id.btnDiscover)
        val btnBookings = findViewById<Button>(R.id.btnBookings)
        val btnReviews = findViewById<Button>(R.id.btnReviews)
        val btnProfile = findViewById<Button>(R.id.btnProfile)
        val btnLogout = findViewById<Button>(R.id.btnLogout)

        // Dummy name for now; later we’ll set it from login data
        tvWelcome.text = "Welcome, Client!"

        btnDiscover.setOnClickListener {
            val intent = Intent(this, DiscoverActivity::class.java)
            startActivity(intent)
        }

        btnBookings.setOnClickListener {
            val intent = Intent(this, ViewBookingsActivity::class.java)
            startActivity(intent)
        }

        btnReviews.setOnClickListener {
            val intent = Intent(this, ReviewActivity::class.java)
            startActivity(intent)
        }

        btnProfile.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

        btnLogout.setOnClickListener {
            // Go back to login
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
