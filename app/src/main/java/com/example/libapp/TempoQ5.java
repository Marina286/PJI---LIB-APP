package com.example.libapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TempoQ5 extends AppCompatActivity {

    Button btnvolt10;
    Button btnFinal2;
    Button btnVoltInicio5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tempo_q5);

        btnvolt10 = findViewById(R.id.btnvolt10);
        btnFinal2 = findViewById(R.id.btnFinal2);
        btnVoltInicio5 = findViewById(R.id.btnVoltInicio5);

        btnvolt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TempoQ5.this, TempoQ4.class);
                startActivity(a);
            }
        });
        btnFinal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TempoQ5.this, TempoRes.class);
                startActivity(a);
            }
        });
        btnVoltInicio5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TempoQ5.this, TempoQuest.class);
                startActivity(a);
            }
        });
    }
}