package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.turistiandov2.moldes.Moldeturismo;

public class Ampliandoturismo extends AppCompatActivity {

    Moldeturismo moldetuRismo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliandoturismo);

        moldetuRismo=(Moldeturismo)getIntent().getSerializableExtra("datosTurismo");
        Toast.makeText(this, moldetuRismo.getNombre(), Toast.LENGTH_SHORT).show();
    }
}