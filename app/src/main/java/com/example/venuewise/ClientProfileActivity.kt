package com.example.venuewise

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ClientProfileActivity : AppCompatActivity() {

    private lateinit var contentLayout: LinearLayout
    private lateinit var tvWelcome: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_client_profile)

        // Initialize UI components
        contentLayout = findViewById(R.id.contentLayout)
        tvWelcome = findViewById(R.id.tvWelcome)

        val btnMyBookings = findViewById<Button>(R.id.btnMyBookings)
        val btnMyReviews = findViewById<Button>(R.id.btnMyReviews)
        val btnProfileSettings = findViewById<Button>(R.id.btnProfileSettings)
        val btnLogout = findViewById<Button>(R.id.btnLogout)

        // Default welcome message
        showWelcomeMessage()

        // Button click listeners
        btnMyBookings.setOnClickListener {
            showBookings()
        }

        btnMyReviews.setOnClickListener {
            showReviews()
        }

        btnProfileSettings.setOnClickListener {
            showProfileSettings()
        }

        btnLogout.setOnClickListener {
            logoutUser()
        }
    }

    // --- Placeholder Content Functions ---

    private fun showWelcomeMessage() {
        contentLayout.removeAllViews()
        val title = TextView(this).apply {
            text = "Welcome, Client 👋"
            textSize = 18f
            setTextColor(resources.getColor(android.R.color.black))
            setPadding(0, 0, 0, 8)
        }

        val message = TextView(this).apply {
            text = "Select an option from the sidebar to view your profile info, bookings, or reviews."
            textSize = 14f
            setTextColor(resources.getColor(android.R.color.darker_gray))
        }

        contentLayout.addView(title)
        contentLayout.addView(message)
    }

    private fun showBookings() {
        contentLayout.removeAllViews()

        val title = TextView(this).apply {
            text = "📅 My Bookings"
            textSize = 18f
            setTextColor(resources.getColor(android.R.color.black))
            setPadding(0, 0, 0, 8)
        }

        val placeholder = TextView(this).apply {
            text = "No bookings found.\n(This section will display your bookings once connected to backend.)"
            textSize = 14f
            setTextColor(resources.getColor(android.R.color.darker_gray))
        }

        contentLayout.addView(title)
        contentLayout.addView(placeholder)
    }

    private fun showReviews() {
        contentLayout.removeAllViews()

        val title = TextView(this).apply {
            text = "⭐ My Reviews"
            textSize = 18f
            setTextColor(resources.getColor(android.R.color.black))
            setPadding(0, 0, 0, 8)
        }

        val placeholder = TextView(this).apply {
            text = "You haven’t left any reviews yet.\n(This section will display your reviews.)"
            textSize = 14f
            setTextColor(resources.getColor(android.R.color.darker_gray))
        }

        contentLayout.addView(title)
        contentLayout.addView(placeholder)
    }

    private fun showProfileSettings() {
        contentLayout.removeAllViews()

        val title = TextView(this).apply {
            text = "⚙️ Profile Settings"
            textSize = 18f
            setTextColor(resources.getColor(android.R.color.black))
            setPadding(0, 0, 0, 8)
        }

        val info = TextView(this).apply {
            text = "Name: Client User\nEmail: client@venuewise.com\n\nProfile editing coming soon!"
            textSize = 14f
            setTextColor(resources.getColor(android.R.color.darker_gray))
        }

        contentLayout.addView(title)
        contentLayout.addView(info)
    }

    private fun logoutUser() {
        // Go back to login page
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
        finish()
    }
}
