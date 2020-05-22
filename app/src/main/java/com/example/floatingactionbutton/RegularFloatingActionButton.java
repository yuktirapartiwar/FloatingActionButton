package com.example.floatingactionbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class RegularFloatingActionButton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regular_floating_action_button);

        FloatingActionButton regularFab = findViewById(R.id.regular_fab_btn);

        regularFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RegularFloatingActionButton.this, "Clicked on Regular FAB Button", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
