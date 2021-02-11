package com.example.libapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PronomeVoc extends AppCompatActivity {

    Button btnvoltVoc3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pronome_voc);

        btnvoltVoc3 = findViewById(R.id.btnvoltVoc3);

        btnvoltVoc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(PronomeVoc.this, TemaVoc.class);
                startActivity(a);
            }
        });
    }
}