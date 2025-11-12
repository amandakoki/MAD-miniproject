package com.example.venuewise

import android.content.Intent
import android.widget.Toast
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ForgotPassword : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        // Optional: adjust description text if needed
        descriptionTextView.text =
            "Enter your email and we’ll send you instructions to reset your password."

        submitButton.setOnClickListener {
            val input = inputEditText.text.toString().trim()
            if (input.isEmpty()) {
                inputEditText.error = "Please enter your email"
                inputEditText.requestFocus()
                return@setOnClickListener
            }

            // Optional quick check for email-like input
            val isEmailLike = android.util.Patterns.EMAIL_ADDRESS.matcher(input).matches()
            if (input.contains("@") && !isEmailLike) {
                inputEditText.error = "Please enter a valid email"
                inputEditText.requestFocus()
                return@setOnClickListener
            }

            // TODO: hook up real network request here
            simulateSubmit(input)
        }
    }

    private fun simulateSubmit(input: String) {
        submitButton.isEnabled = false
        submitButton.text = "Submitting..."
        // Simulate a short delay then show a confirmation
        submitButton.postDelayed({
            submitButton.isEnabled = true
            submitButton.text = "Submit"
            Toast.makeText(
                this,
                "If an account with that email exists, a reset link has been sent.",
                Toast.LENGTH_LONG
            ).show()
        }, 1200)
    }
}