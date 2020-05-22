package com.example.floatingactionbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MiniFloatingActionButton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mini_floating_action_button);

        FloatingActionButton miniFab = findViewById(R.id.mini_fab_btn);

        miniFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MiniFloatingActionButton.this, "Clicked on Mini FAB Button", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
