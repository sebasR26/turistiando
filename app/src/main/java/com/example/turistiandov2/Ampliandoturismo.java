package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.turistiandov2.moldes.Moldeturismo;

public class Ampliandoturismo extends AppCompatActivity {

    Moldeturismo moldetuRismo;

    TextView nombreAmpliandoTurismo;

    ImageView imagenAmpliandoTurismo;

    TextView precioAmpliandoTurismo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliandoturismo);
        nombreAmpliandoTurismo=findViewById(R.id.nombreAmpliandoTurismo);
        imagenAmpliandoTurismo=findViewById(R.id.imagenAmpliandoTurismo);
        precioAmpliandoTurismo=findViewById(R.id.PrecioAmpliarTurismo);

        moldetuRismo=(Moldeturismo)getIntent().getSerializableExtra("datosTurismo");
        Toast.makeText(this, moldetuRismo.getNombre(), Toast.LENGTH_SHORT).show();
        nombreAmpliandoTurismo.setText(moldetuRismo.getNombre());
        imagenAmpliandoTurismo.setImageResource(moldetuRismo.getFoto());
        precioAmpliandoTurismo.setText(moldetuRismo.getPrecio());
    }
}