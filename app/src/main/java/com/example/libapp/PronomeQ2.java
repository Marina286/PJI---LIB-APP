package com.example.libapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PronomeQ2 extends AppCompatActivity {

    Button btnvolt2;
    Button btnProx2;
    Button btnVoltInicio12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pronome_q2);

        btnvolt2 = findViewById(R.id.btnvolt2);
        btnProx2 = findViewById(R.id.btnProx2);
        btnVoltInicio12 = findViewById(R.id.btnVoltInicio12);

        btnvolt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(PronomeQ2.this, PronomeQ1.class);
                startActivity(a);
            }
        });
        btnProx2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(PronomeQ2.this, PronomeQ3.class);
                startActivity(a);
            }
        });
        btnVoltInicio12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(PronomeQ2.this, PronomeQuest.class);
                startActivity(a);
            }
        });
    }
}