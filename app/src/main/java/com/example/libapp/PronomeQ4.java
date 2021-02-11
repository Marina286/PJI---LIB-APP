package com.example.libapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PronomeQ4 extends AppCompatActivity {

    Button btnvolt4;
    Button btnProx4;
    Button btnVoltInicio14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pronome_q4);

        btnvolt4 = findViewById(R.id.btnvolt4);
        btnProx4 = findViewById(R.id.btnProx4);
        btnVoltInicio14 = findViewById(R.id.btnVoltInicio14);

        btnvolt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(PronomeQ4.this, PronomeQ3.class);
                startActivity(a);
            }
        });
        btnProx4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(PronomeQ4.this, PronomeQ5.class);
                startActivity(a);
            }
        });
        btnVoltInicio14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(PronomeQ4.this, PronomeQuest.class);
                startActivity(a);
            }
        });
    }
}