package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.turistiandov2.moldes.MoldeHotel;

public class AmpliandoHotel extends AppCompatActivity {

    MoldeHotel moldeHotel;
    ImageView fotoAmpliandoHotel;
    TextView nombreAmpliandoHotel;

    TextView precioAmpliandoHotel;

    TextView telefonoAmpliandoHotel;

    TextView descripcionAmplinadoHotel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_hotel);
        fotoAmpliandoHotel=findViewById(R.id.imagenAmpliando);
        nombreAmpliandoHotel=findViewById(R.id.nombreAmpliando);
        precioAmpliandoHotel=findViewById(R.id.precioAmpliando);
        telefonoAmpliandoHotel=findViewById(R.id.telefonoAmpliano);
        descripcionAmplinadoHotel=findViewById(R.id.descripcionAmpliando);


        moldeHotel=(MoldeHotel)getIntent().getSerializableExtra("datosHotel");
        Toast.makeText(this,moldeHotel.getNombre(), Toast.LENGTH_SHORT).show();

        //cargando info e los componentes graficos

        fotoAmpliandoHotel.setImageResource(moldeHotel.getFoto());
        nombreAmpliandoHotel.setText(moldeHotel.getNombre());
        precioAmpliandoHotel.setText(moldeHotel.getPrecio());
        telefonoAmpliandoHotel.setText(moldeHotel.getTelefono());
        descripcionAmplinadoHotel.setText(moldeHotel.getDescripcion());


    }
}