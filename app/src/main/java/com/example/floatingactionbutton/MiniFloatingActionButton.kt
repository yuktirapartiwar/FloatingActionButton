package com.example.floatingactionbutton

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MiniFloatingActionButton : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mini_floating_action_button)
        val miniFab = findViewById<FloatingActionButton>(R.id.mini_fab_btn)
        miniFab.setOnClickListener { Toast.makeText(this@MiniFloatingActionButton, "Clicked on Mini FAB Button", Toast.LENGTH_SHORT).show() }
    }
}