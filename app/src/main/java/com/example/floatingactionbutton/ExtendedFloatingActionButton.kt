package com.example.floatingactionbutton

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

class ExtendedFloatingActionButton : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_extended_floating_action_button)
        val extendedFab: ExtendedFloatingActionButton = findViewById(R.id.extended_fab_btn)
        extendedFab.setOnClickListener{Toast.makeText(this@ExtendedFloatingActionButton, "Item added to cart", Toast.LENGTH_SHORT).show()}
    }
}