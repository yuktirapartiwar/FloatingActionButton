package com.example.floatingactionbutton

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class RegularFloatingActionButton : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regular_floating_action_button)
        val regularFab = findViewById<FloatingActionButton>(R.id.regular_fab_btn)
        regularFab.setOnClickListener { Toast.makeText(this@RegularFloatingActionButton, "Clicked on Regular FAB Button", Toast.LENGTH_SHORT).show() }
    }
}