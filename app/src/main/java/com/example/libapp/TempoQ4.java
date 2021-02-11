package com.example.libapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TempoQ4 extends AppCompatActivity {

    Button btnvolt9;
    Button btnProx9;
    Button btnVoltInicio4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tempo_q4);

        btnvolt9 = findViewById(R.id.btnvolt9);
        btnProx9 = findViewById(R.id.btnProx9);
        btnVoltInicio4 = findViewById(R.id.btnVoltInicio4);

        btnvolt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TempoQ4.this, TempoQ3.class);
                startActivity(a);
            }
        });
        btnProx9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TempoQ4.this, TempoQ5.class);
                startActivity(a);
            }
        });
        btnVoltInicio4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TempoQ4.this, TempoQuest.class);
                startActivity(a);
            }
        });
    }
}