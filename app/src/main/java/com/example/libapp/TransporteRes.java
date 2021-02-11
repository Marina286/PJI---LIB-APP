package com.example.libapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TransporteRes extends AppCompatActivity {

    Button btnVoltTema3;
    Button btnTentNov3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transporte_res);

        btnTentNov3 = findViewById(R.id.btnTentNov3);
        btnVoltTema3 = findViewById(R.id.btnVoltTema3);

        btnTentNov3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TransporteRes.this, TransporteQuest.class);
                startActivity(a);
            }
        });
        btnVoltTema3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TransporteRes.this, TemaQuestao.class);
                startActivity(a);
            }
        });
    }
}