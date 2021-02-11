package com.example.libapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NumeroVoc extends AppCompatActivity {

    Button btnVoltVoc2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numero_voc);

        btnVoltVoc2 = findViewById(R.id.btnvoltVoc2);

        btnVoltVoc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(NumeroVoc.this, TemaVoc.class);
                startActivity(a);
            }
        });
    }
}