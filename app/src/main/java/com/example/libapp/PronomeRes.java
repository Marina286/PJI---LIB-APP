package com.example.libapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PronomeRes extends AppCompatActivity {

    Button btnTentNov;
    Button btnVoltTema;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pronome_res);

        btnTentNov = findViewById(R.id.btnTentNov);
        btnVoltTema = findViewById(R.id.btnVoltTema);

        btnTentNov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(PronomeRes.this, PronomeQuest.class);
                startActivity(a);
            }
        });
        btnVoltTema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(PronomeRes.this, TemaQuestao.class);
                startActivity(a);
            }
        });
    }
}