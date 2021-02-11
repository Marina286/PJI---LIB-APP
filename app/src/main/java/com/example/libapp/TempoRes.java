package com.example.libapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TempoRes extends AppCompatActivity {

    Button btnTentNov2;
    Button btnVoltTema2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tempo_res);

        btnVoltTema2 = findViewById(R.id.btnVoltTema2);
        btnTentNov2 = findViewById(R.id.btnTentNov2);

        btnTentNov2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TempoRes.this, TempoQuest.class);
                startActivity(a);
            }
        });
        btnVoltTema2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TempoRes.this, TemaQuestao.class);
                startActivity(a);
            }
        });
    }
}