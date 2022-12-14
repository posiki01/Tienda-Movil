package com.example.ejercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.ejercicio.DB.DBFirebase;
import com.example.ejercicio.DB.DBHelper;
import com.example.ejercicio.Entidades.Product;
import com.example.ejercicio.Servicios.ProductService;

public class ProductForm extends AppCompatActivity {
    private DBHelper dbHelper;
    private DBFirebase dbFirebase;
    private ProductService productService;
    private Button btnFormRegistrar;
    private ImageView imageViewForm;
    private EditText editTextFormName, editTextFormDescription, editTextFormPrice ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_form);

        btnFormRegistrar =(Button) findViewById(R.id.btnFormRegistrar);
        imageViewForm = (ImageView) findViewById(R.id.imageViewForm);
        editTextFormName =(EditText) findViewById(R.id.editTextFormName);
        editTextFormDescription =(EditText) findViewById(R.id.editTextFormDescription);
        editTextFormPrice = (EditText) findViewById(R.id.editTextFormPrice);

        try {
            dbHelper = new DBHelper(this);
            dbFirebase= new DBFirebase();

        }catch (Exception e){
            Log.e("Error DB", e.toString());
        }






        btnFormRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Product product = new Product(
                        editTextFormName.getText().toString(),
                        editTextFormDescription.getText().toString(),
                        Integer.parseInt(editTextFormPrice.getText().toString().trim()),
                        ""
                );
                //dbHelper.insertProduct(product);
                dbFirebase.insertProduct(product);

                Intent intent = new Intent(getApplicationContext(), ActivityListProduct.class);
                startActivity(intent);
            }
        });


        //dbFirebase =  new DBFirebase();
        //productService = new ProductService();


                //dbHelper.insertProduct(product);
                //dbFirebase.insertProduct(product);
                //productService =new ProductService();
                //
                //




    }
}