package com.example.libapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TempoQ1 extends AppCompatActivity {

    Button btnvolt6;
    Button btnProx6;
    Button btnVoltInicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tempo_q1);

        btnvolt6 = findViewById(R.id.btnvolt6);
        btnProx6 = findViewById(R.id.btnProx6);
        btnVoltInicio = findViewById(R.id.btnVoltInicio);

        btnvolt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TempoQ1.this, TempoQuest.class);
                startActivity(a);
            }
        });
        btnProx6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TempoQ1.this, TempoQ2.class);
                startActivity(a);
            }
        });
        btnVoltInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TempoQ1.this, TempoQuest.class);
                startActivity(a);
            }
        });
    }
}