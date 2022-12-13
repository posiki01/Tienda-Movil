package com.example.ejercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private Button btnReview;
    private TextView textNameReview, textPriceReview, textDescriptionReview;
    private ImageView imageReview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnReview = (Button) findViewById(R.id.btnReview);
        textNameReview = (TextView) findViewById(R.id.textNameReview);
        textPriceReview = (TextView) findViewById(R.id.textPriceReview);
        textDescriptionReview = (TextView) findViewById(R.id.textDescriptionReview);
        imageReview = (ImageView)  findViewById(R.id.imageReview);

        Intent intentIN = getIntent();
        textNameReview.setText(intentIN.getStringExtra("name"));
        textPriceReview.setText(String.valueOf(intentIN.getIntExtra("price",0)));
        textDescriptionReview.setText(intentIN.getStringExtra("description"));
        imageReview.setImageResource(intentIN.getIntExtra("image",0));

        btnReview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ActivityListProduct.class);
                startActivity(intent);

            }
        });


    }
}