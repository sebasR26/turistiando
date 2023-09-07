package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import com.example.turistiandov2.moldes.Molderestaurant;


public class AmpliandoRestaurantes extends AppCompatActivity {

    Molderestaurant moldeRestaurant;

    TextView nombreAmpliandoRestaurante;

    ImageView imagenAmpliandoRestaurante;

    TextView precioAmpliandoRestaurante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_restaurantes);
        nombreAmpliandoRestaurante=findViewById(R.id.nombreAmpliandoRestaurante);
        imagenAmpliandoRestaurante=findViewById(R.id.imagenAmpliandoRestaurante);
        precioAmpliandoRestaurante=findViewById(R.id.reangoPrecioAmpliarRestaurante);


        moldeRestaurant=(Molderestaurant)getIntent().getSerializableExtra("datosRestaurant");
        Toast.makeText(this, moldeRestaurant.getNombre(), Toast.LENGTH_SHORT).show();
        nombreAmpliandoRestaurante.setText(moldeRestaurant.getNombre());
        imagenAmpliandoRestaurante.setImageResource(moldeRestaurant.getImagen());
        precioAmpliandoRestaurante.setText(moldeRestaurant.getRangoPrecio());



    }
}