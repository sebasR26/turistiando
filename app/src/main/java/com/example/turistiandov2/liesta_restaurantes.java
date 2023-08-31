package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.turistiandov2.adaptadores.adaptadorRestaurantes;
import com.example.turistiandov2.moldes.Molderestaurant;

import java.util.ArrayList;

public class liesta_restaurantes extends AppCompatActivity {

    ArrayList<Molderestaurant> liesta_restaurantes = new ArrayList<>();
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liesta_restaurantes);
        recyclerView=findViewById(R.id.listadinmicarestaurante);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,recyclerView.VERTICAL,false));

        llenarListaConDatos();
        adaptadorRestaurantes adaptadorRestaurantes = new adaptadorRestaurantes(liesta_restaurantes);
        recyclerView.setAdapter(adaptadorRestaurantes);

    }

    public void llenarListaConDatos(){
        liesta_restaurantes.add(new Molderestaurant("RESTAURANTE LA COMIDITA","123456789","$8000-$10000000","SALCHIPAPAS",R.drawable.lresraurante1));
        liesta_restaurantes.add(new Molderestaurant("RESTAURANTE HOZA","356987412","$9000-$200000","PERAS SALADAS",R.drawable.lresraurante2));
        liesta_restaurantes.add(new Molderestaurant("RESTAURANTE EL RESTAURANT","147852369","$2000-$10000000","LIMAS",R.drawable.lresraurante3));
        liesta_restaurantes.add(new Molderestaurant("RESTAURANTE DON TOÑO","321654987","$1000-$30000000","PERRO COSIDO",R.drawable.lrestaurante4));;
        liesta_restaurantes.add(new Molderestaurant("RESTAURANTE GOZALO","963258741","$1000-$30000","CHORIZO",R.drawable.lrestaurante5));
    }
}