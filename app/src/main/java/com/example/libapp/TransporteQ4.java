package com.example.libapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TransporteQ4 extends AppCompatActivity {

    Button btnvolt14;
    Button btnProx14;
    Button btnVoltInicio9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transporte_q4);

        btnvolt14 = findViewById(R.id.btnvolt14);
        btnProx14 = findViewById(R.id.btnProx14);
        btnVoltInicio9 = findViewById(R.id.btnVoltInicio9);

        btnvolt14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TransporteQ4.this, TransporteQ3.class);
                startActivity(a);
            }
        });
        btnProx14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TransporteQ4.this, TransporteQ5.class);
                startActivity(a);
            }
        });
        btnVoltInicio9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TransporteQ4.this, TransporteQuest.class);
                startActivity(a);
            }
        });
    }
}