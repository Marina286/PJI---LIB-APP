package com.example.libapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PronomeQ5 extends AppCompatActivity {

    Button btnvolt5;
    Button btnFinal;
    Button btnVoltInicio15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pronome_q5);

        btnvolt5 = findViewById(R.id.btnvolt5);
        btnFinal = findViewById(R.id.btnFinal);
        btnVoltInicio15 = findViewById(R.id.btnVoltInicio15);

        btnvolt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(PronomeQ5.this, PronomeQ4.class);
                startActivity(a);
            }
        });
        btnFinal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(PronomeQ5.this, PronomeRes.class);
                startActivity(a);
            }
        });
        btnVoltInicio15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(PronomeQ5.this, PronomeQuest.class);
                startActivity(a);
            }
        });
    }
}