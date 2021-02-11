package com.example.libapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TransporteQ2 extends AppCompatActivity {

    Button btnvolt12;
    Button btnProx12;
    Button btnVoltInicio7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transporte_q2);

        btnProx12 = findViewById(R.id.btnProx12);
        btnvolt12 = findViewById(R.id.btnvolt12);
        btnVoltInicio7 = findViewById(R.id.btnVoltInicio7);

        btnvolt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TransporteQ2.this, TransporteQ1.class);
                startActivity(a);
            }
        });
        btnProx12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TransporteQ2.this, TransporteQ3.class);
                startActivity(a);
            }
        });
        btnVoltInicio7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TransporteQ2.this, TransporteQuest.class);
                startActivity(a);
            }
        });
    }
}