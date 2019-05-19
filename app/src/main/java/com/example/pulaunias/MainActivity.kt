package com.example.pulaunias

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the Navigation Controller from Navigation Host Fragment
        val navController = this.findNavController(R.id.nav_host_fragment)

        // Link navController to bottom navigation view
        NavigationUI.setupWithNavController(bottom_nav_view, navController)

    }
}
