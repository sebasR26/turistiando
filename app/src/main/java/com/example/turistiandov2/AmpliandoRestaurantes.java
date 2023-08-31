package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;


import com.example.turistiandov2.moldes.Molderestaurant;


public class AmpliandoRestaurantes extends AppCompatActivity {

    Molderestaurant moldeRestaurant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_restaurantes);

        moldeRestaurant=(Molderestaurant)getIntent().getSerializableExtra("datosRestaurant");
        Toast.makeText(this, moldeRestaurant.getNombre(), Toast.LENGTH_SHORT).show();


    }
}