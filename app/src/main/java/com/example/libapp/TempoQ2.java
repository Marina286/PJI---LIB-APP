package com.example.libapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TempoQ2 extends AppCompatActivity {

    Button btnvolt7;
    Button btnProx7;
    Button btnVoltInicio2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tempo_q2);

        btnvolt7 = findViewById(R.id.btnvolt7);
        btnProx7 = findViewById(R.id.btnProx7);
        btnVoltInicio2 = findViewById(R.id.btnVoltInicio2);

        btnvolt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TempoQ2.this, TempoQ1.class);
                startActivity(a);
            }
        });
        btnProx7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TempoQ2.this, TempoQ3.class);
                startActivity(a);
            }
        });
        btnVoltInicio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TempoQ2.this, TempoQuest.class);
                startActivity(a);
            }
        });
    }
}