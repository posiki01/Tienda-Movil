package com.example.ejercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivityInicioSesion extends AppCompatActivity {
    private Button btnInicio;
    private Button btnRegistro;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_inicio_sesion);
        btnInicio = (Button) findViewById(R.id.buttonIngresarSesion);
        btnRegistro = (Button) findViewById(R.id.btnRegistroSesion);

        btnInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),ActivityListProduct.class);
                startActivity(intent);
            }
        });

        btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivityRegisto.class);
                startActivity(intent);
            }
        });
    }
}