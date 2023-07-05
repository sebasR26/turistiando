package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    //zon atributos
    Button botonHoteles;
    Button botonRestaurantes;
    Button botonTurismo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        botonHoteles =findViewById(R.id.botonhoteles);
        botonRestaurantes=findViewById(R.id.botonrestaurante);
        botonTurismo=findViewById(R.id.botonturismo);

        //detectando eventos

        botonHoteles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Home.this, "en algun momento aqui abra algo", Toast.LENGTH_SHORT).show();
            }
        });

        botonRestaurantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Home.this, "en algun momento aqui abra algo", Toast.LENGTH_SHORT).show();
            }
        });

        botonTurismo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Home.this, "en algun momento aqui abra algo", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public boolean onCrateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }


    public  boolean onOptionsItemSelected(MenuItem item){
        int itemSeleccionado = item.getItemId();
        switch (itemSeleccionado){
            case (R.id.opcion1):
                break;
            case (R.id.opcion2):
                break;
            case (R.id.opcion3):
                break;
            case (R.id.opcion4):
                break;

        }

        return super.onOptionsItemSelected(item);

    }
}