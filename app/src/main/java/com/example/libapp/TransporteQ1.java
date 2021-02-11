package com.example.libapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TransporteQ1 extends AppCompatActivity {

    Button btnvolt11;
    Button btnProx11;
    Button btnVoltInicio6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transporte_q1);

        btnvolt11 = findViewById(R.id.btnvolt11);
        btnProx11 = findViewById(R.id.btnProx11);
        btnVoltInicio6 = findViewById(R.id.btnVoltInicio6);

        btnvolt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TransporteQ1.this, TransporteQuest.class);
                startActivity(a);
            }
        });
        btnProx11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TransporteQ1.this, TransporteQ2.class);
                startActivity(a);
            }
        });
        btnVoltInicio6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TransporteQ1.this, TransporteQuest.class);
                startActivity(a);
            }
        });

    }
}