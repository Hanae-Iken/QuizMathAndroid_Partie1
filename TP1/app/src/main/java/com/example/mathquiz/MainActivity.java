package com.example.mathquiz;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView tvNombre1, tvNombre2, tvResultat;
    private Button btnAddition, btnSoustraction, btnMultiplication, btnGenerer;
    private int nombre1, nombre2;
    private Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        random = new Random();

        tvNombre1 = findViewById(R.id.tvNombre1);
        tvNombre2 = findViewById(R.id.tvNombre2);
        tvResultat = findViewById(R.id.tvResultat);
        btnAddition = findViewById(R.id.btnAddition);
        btnSoustraction = findViewById(R.id.btnSoustraction);
        btnMultiplication = findViewById(R.id.btnMultiplication);
        btnGenerer = findViewById(R.id.btnGenerer);

        genererNombres();

        btnAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int resultat = nombre1 + nombre2;
                tvResultat.setText("Résultat : " + resultat);
            }
        });

        btnSoustraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int resultat = nombre1 - nombre2;
                tvResultat.setText("Résultat : " + resultat);
            }
        });

        btnMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int resultat = nombre1 * nombre2;
                tvResultat.setText("Résultat : " + resultat);
            }
        });

        btnGenerer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                genererNombres();
                tvResultat.setText("Résultat : ");
            }
        });
    }

    private void genererNombres() {
        nombre1 = random.nextInt(889) + 111;
        nombre2 = random.nextInt(889) + 111;
        tvNombre1.setText(String.valueOf(nombre1));
        tvNombre2.setText(String.valueOf(nombre2));
    }
}