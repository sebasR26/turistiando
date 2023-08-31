package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.turistiandov2.adaptadores.adaptadoresTurismos;
import com.example.turistiandov2.moldes.Moldeturismo;

import java.util.ArrayList;

public class ListaSitiosTuristicos extends AppCompatActivity {

    ArrayList<Moldeturismo> ListaSitiosTuristicos=new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_sitios_turisticos);
        recyclerView=findViewById(R.id.listdinamicasitiosturisticos);

        recyclerView.setLayoutManager(new LinearLayoutManager(this,recyclerView.VERTICAL,false));

        llenarListConDatos();
        adaptadoresTurismos adaptadoresTurismos = new adaptadoresTurismos( ListaSitiosTuristicos);
        recyclerView.setAdapter(adaptadoresTurismos);

    }

    public void llenarListConDatos(){
        ListaSitiosTuristicos.add(new Moldeturismo("EL JABALI ARDIENTE","JUAN PEREZ","123456789","$10000",R.drawable.lturismo1));
        ListaSitiosTuristicos.add(new Moldeturismo("EL LAGO OSCURO","RGELIO MARTES","321654987","$1000",R.drawable.lturismo2));
        ListaSitiosTuristicos.add(new Moldeturismo("EL CARAMBA","JORGEN MARTIN","963258741","$20000",R.drawable.lturismo3));
        ListaSitiosTuristicos.add(new Moldeturismo("MARTES DE GALERIA","YERSON LUZ","741258963","$16000",R.drawable.lturismo4));
        ListaSitiosTuristicos.add(new Moldeturismo("CHA CHA CHA","SEBASTIAN POLO","357894126","$28000",R.drawable.lturismo5));
    }
}