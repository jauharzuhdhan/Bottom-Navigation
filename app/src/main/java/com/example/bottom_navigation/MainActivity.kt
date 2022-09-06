package com.example.bottom_navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        val navController  = findNavController(R.id.fragment)

        bottomNavigationView.setupWithNavController(navController)

        val appBarConfiguration = AppBarConfiguration(setOf(R.id.homeFragment, R.id.profileFragment, R.id.settingsFragment))
        setupActionBarWithNavController(navController, appBarConfiguration)
    }
}
