package com.example.libapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TransporteQ3 extends AppCompatActivity {

    Button btnvolt13;
    Button btnProx13;
    Button btnVoltInicio8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transporte_q3);

        btnvolt13 = findViewById(R.id.btnvolt13);
        btnProx13 = findViewById(R.id.btnProx13);
        btnVoltInicio8 = findViewById(R.id.btnVoltInicio8);

        btnvolt13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TransporteQ3.this, TransporteQ2.class);
                startActivity(a);
            }
        });
        btnProx13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TransporteQ3.this, TransporteQ4.class);
                startActivity(a);
            }
        });
        btnVoltInicio8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TransporteQ3.this, TransporteQuest.class);
                startActivity(a);
            }
        });
    }
}