package com.bowen.grocerylist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bowen.grocerylist.databinding.ActivityMainBinding

    lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}