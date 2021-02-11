package com.example.libapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PronomeQ1 extends AppCompatActivity {

    Button btnvolt;
    Button btnProx;
    Button btnVoltInicio11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pronome_q1);

        btnvolt = findViewById(R.id.btnvolt);
        btnProx = findViewById(R.id.btnProx);
        btnVoltInicio11 = findViewById(R.id.btnVoltInicio11);

        btnvolt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(PronomeQ1.this, PronomeQuest.class);
                startActivity(a);
            }
        });
        btnProx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(PronomeQ1.this, PronomeQ2.class);
                startActivity(a);
            }
        });
        btnVoltInicio11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(PronomeQ1.this, PronomeQuest.class);
                startActivity(a);
            }
        });
    }
}