package com.example.navigation_graph_practice

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity

import com.example.navigation_graph_practice.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}