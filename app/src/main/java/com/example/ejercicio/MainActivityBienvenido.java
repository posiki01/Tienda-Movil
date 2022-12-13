package com.example.ejercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivityBienvenido extends AppCompatActivity {

    private TextView textRegistroWelcome;
    private Button buttonAeptarWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_bienvenido);

        textRegistroWelcome = (TextView) findViewById(R.id.textRegistroWelcome);
        buttonAeptarWelcome = (Button) findViewById(R.id.buttonAeptarWelcome);

        buttonAeptarWelcome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ActivityListProduct.class);
                startActivity(intent);
            }
        });
    }
}