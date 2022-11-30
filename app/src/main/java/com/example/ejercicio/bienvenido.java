package com.example.ejercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class bienvenido extends AppCompatActivity {
    private Button buttonRegistro;
    private EditText editName, editLastName, editAge;
    private TextView textName, textLastName, textAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenido);

        buttonRegistro = (Button) findViewById(R.id.buttonRegistro);

        editName = (EditText) findViewById(R.id.editName);
        editLastName = (EditText) findViewById(R.id.editLastName);
        editAge = (EditText) findViewById(R.id.editAge);

        textName = (TextView) findViewById(R.id.textName);
        textLastName = (TextView) findViewById(R.id.textLastName);
        textAge = (TextView) findViewById(R.id.textAge);

        buttonRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(intent);

            }

                /*ejercicio clase
                String num1 = editName.getText().toString().trim();
                String num2 = editLastName.getText().toString().trim();
                Log.d("num1",String.valueOf(num1));
                Log.d("num2",String.valueOf(num2));
                String suma = num1 + " " + num2;
                Log.d("suma",String.valueOf(suma));
                Toast toast = Toast.makeText(getApplicationContext(),String.valueOf(suma), Toast.LENGTH_LONG);
                toast.show();*/



        });
    }
}