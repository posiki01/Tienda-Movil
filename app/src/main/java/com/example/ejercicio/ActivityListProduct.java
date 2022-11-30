package com.example.ejercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;


import com.example.ejercicio.Adaptadores.ProductAdapter;
import com.example.ejercicio.Entidades.Product;

import java.util.ArrayList;

public class ActivityListProduct extends AppCompatActivity {

    private ListView listViewProducts;
    private ProductAdapter productAdapter;
    private ArrayList<Product> arrayProducts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_product);

        listViewProducts = (ListView) findViewById(R.id.listViewProducts);
        arrayProducts = new ArrayList<>();

        Product product1 = new Product(R.drawable.product1,"Control","Control ps4 inalambrico", 70000);
        Product product2 = new Product(R.drawable.product2,"Control","Control Xbox inalambrico", 120000);
        Product product3 = new Product(R.drawable.product3,"Control","Control pega inalambrico", 75000);
        Product product4 = new Product(R.drawable.product4,"Control","Control turtle beach Alambrico", 130000);
        Product product5 = new Product(R.drawable.product5,"Diadema","Diadema de cable ", 80000);

        Product product9 = new Product(R.drawable.trapero,"Trapero","trapero con balde ", 50000);
        Product product10 = new Product(R.drawable.bici,"Bicicleta","Bicicleta infantil color azul", 560000);


        arrayProducts.add(product1);
        arrayProducts.add(product2);
        arrayProducts.add(product3);
        arrayProducts.add(product4);
        arrayProducts.add(product5);

        arrayProducts.add(product9);
        arrayProducts.add(product10);
        productAdapter = new ProductAdapter(this,arrayProducts);
        listViewProducts.setAdapter(productAdapter);;

    }
}