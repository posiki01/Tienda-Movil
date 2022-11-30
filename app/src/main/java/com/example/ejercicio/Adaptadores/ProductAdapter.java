package com.example.ejercicio.Adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ejercicio.Entidades.Product;
import com.example.ejercicio.R;

import java.util.ArrayList;

public class ProductAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Product> arrayProducts;

    public ProductAdapter(Context context, ArrayList<Product> arrayProducts) {
        this.context = context;
        this.arrayProducts = arrayProducts;
    }

    @Override
    public int getCount() {
        return arrayProducts.size();
    }

    @Override
    public Object getItem(int i) {
        return arrayProducts.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView,
                         ViewGroup viewGroup) {


        LayoutInflater layoutInflater = LayoutInflater.from(this.context);

        convertView= layoutInflater.inflate(R.layout.product_template, null);

        Product product = arrayProducts.get(position);

        ImageView imageProduct =(ImageView) convertView.findViewById(R.id.imageProduct);
        TextView textviewProductName =(TextView) convertView.findViewById(R.id.textviewProductName);
        TextView textViewProductDescription=(TextView) convertView.findViewById(R.id.textViewProductDescription);
        TextView textViewProductPrice =(TextView) convertView.findViewById(R.id.textViewProductPrice);
        ImageButton imagecarro =(ImageButton) convertView.findViewById(R.id.imagecarro);


        imageProduct.setImageResource(product.getImage());
        textviewProductName.setText(product.getName());
        textViewProductDescription.setText(product.getDescription());
        textViewProductPrice.setText(String.valueOf(product.getPrice()));

            return convertView;
    }
}
