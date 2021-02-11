package com.example.libapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TransporteQ5 extends AppCompatActivity {

    Button btnvolt15;
    Button btnFinal3;
    Button btnVoltInicio10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transporte_q5);

        btnvolt15 = findViewById(R.id.btnvolt15);
        btnFinal3 = findViewById(R.id.btnFinal3);
        btnVoltInicio10 = findViewById(R.id.btnVoltInicio10);

        btnvolt15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TransporteQ5.this, TransporteQ4.class);
                startActivity(a);
            }
        });
        btnFinal3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TransporteQ5.this, TransporteRes.class);
                startActivity(a);
            }
        });
        btnVoltInicio10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TransporteQ5.this, TransporteQuest.class);
                startActivity(a);
            }
        });

    }
}