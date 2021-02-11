package com.example.libapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PronomeQ3 extends AppCompatActivity {

    Button btnvolt3;
    Button btnProx3;
    Button btnVoltInicio13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pronome_q3);

        btnvolt3 = findViewById(R.id.btnvolt3);
        btnProx3 = findViewById(R.id.btnProx3);
        btnVoltInicio13 = findViewById(R.id.btnVoltInicio13);

        btnvolt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(PronomeQ3.this, PronomeQ2.class);
                startActivity(a);
            }
        });
        btnProx3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(PronomeQ3.this, PronomeQ4.class);
                startActivity(a);
            }
        });
        btnVoltInicio13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(PronomeQ3.this, PronomeQuest.class);
                startActivity(a);
            }
        });
    }
}