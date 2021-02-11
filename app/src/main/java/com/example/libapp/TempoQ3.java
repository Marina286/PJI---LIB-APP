package com.example.libapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TempoQ3 extends AppCompatActivity {

    Button btnvolt8;
    Button btnProx8;
    Button btnVoltInicio3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tempo_q3);

        btnvolt8 = findViewById(R.id.btnvolt8);
        btnProx8 = findViewById(R.id.btnProx8);
        btnVoltInicio3 = findViewById(R.id.btnVoltInicio3);

        btnvolt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TempoQ3.this, TempoQ2.class);
                startActivity(a);
            }
        });
        btnProx8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TempoQ3.this, TempoQ4.class);
                startActivity(a);
            }
        });
        btnVoltInicio3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TempoQ3.this, TempoQuest.class);
                startActivity(a);
            }
        });
    }
}