package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.turistiandov2.moldes.molderestaurant;

public class RestaurantesHome extends AppCompatActivity {

        Button botonVerMas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantes_home);


        botonVerMas=findViewById(R.id.botonVerMasRestaurante);
        botonVerMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RestaurantesHome.this, liesta_restaurantes.class);
                startActivity(intent);
            }
        });

    }
}