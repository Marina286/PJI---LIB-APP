package com.example.libapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TempoVoc extends AppCompatActivity {

    Button btnvoltVoc4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tempo_voc);

        btnvoltVoc4 = findViewById(R.id.btnvoltVoc4);

        btnvoltVoc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TempoVoc.this, TemaVoc.class);
                startActivity(a);
            }
        });
    }
}