package com.example.bottomnavigation

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.bottomnavigation.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.logoImageView.alpha = 0.0f
        binding.logoImageView.animate().apply {
            alpha(1.0f)
            duration = 1000
        }

        binding.startBTN.translationX = -2000f
        binding.startBTN.animate().apply {
            translationX(0f)
            duration = 1000
            startDelay = 1000
        }

        binding.startBTN.setOnClickListener {
            startActivity(Intent(this, StartActivity::class.java))
            finish()
        }
    }


}