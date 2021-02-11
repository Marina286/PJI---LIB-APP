package com.example.libapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TransporteVoc extends AppCompatActivity {

    Button btnvoltVoc5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transporte_voc);

        btnvoltVoc5 = findViewById(R.id.btnvoltVoc5);

        btnvoltVoc5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TransporteVoc.this, TemaVoc.class);
                startActivity(a);
            }
        });
    }
}