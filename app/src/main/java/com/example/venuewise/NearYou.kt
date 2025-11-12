package com.example.venuewise
import android.Manifest
import android.content.pm.PackageManager
import android.location.Location
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
//import com.yourdomain.yourapp.R
import kotlin.math.roundToInt

data class NearYou(
    val name: String,
    val lat: Double,
    val lon: Double,
    val address: String,
    val phone: String
)
class FindVenuesActivity : AppCompatActivity() {

    // Sample venues (same style as your HTML script)
    private val venues = listOf(
        Venue("Shamba Cafe", -1.21, 36.77, "Loresho Ridge, Nairobi", "0757 701080"),
        Venue("The Carnivore Restaurant", -1.345, 36.755, "Langata Road, Nairobi", "0722 204647"),
        Venue("Harvest Restaurant", -1.319, 36.778, "Village Market, Limuru Road, Nairobi", "0732 186215"),
        Venue("Nairobi Street Kitchen", -1.264, 36.783, "Mpaka Road, Nairobi", "0707