package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    //zon atributos
    Button botonHoteles;
    Button botonRestaurantes;
    Button botonTurismo;

    TextView nombrecliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        String nombre = getIntent().getStringExtra("nombre");


        botonHoteles =findViewById(R.id.botonhoteles);
        botonRestaurantes=findViewById(R.id.botonrestaurante);
        botonTurismo=findViewById(R.id.botonturismo);

        nombrecliente=findViewById(R.id.cliente);

        //enlazando el puextra con el textview

        nombrecliente.setText(nombre);

        //detectando eventos

        botonHoteles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHoteles  = new  Intent(Home.this,HotelesHome.class);
                startActivity(intentHoteles)
;            }
        });

        botonRestaurantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRestaurante  = new  Intent(Home.this,RestaurantesHome.class);
                startActivity(intentRestaurante)
                ;            }
        });

        botonTurismo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTurismo  = new  Intent(Home.this,Turismo.class);
                startActivity(intentTurismo)
                ;            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }


    public  boolean onOptionsItemSelected(MenuItem item){
        int itemSeleccionado = item.getItemId();
        switch (itemSeleccionado){
            case (R.id.opcion1):

                break;
            case (R.id.opcion2):
                Toast.makeText(this, "quiero que este en español", Toast.LENGTH_SHORT).show();
                break;
            case (R.id.opcion3):
                Toast.makeText(this, "quiero que este en italiano", Toast.LENGTH_SHORT).show();
                break;
            case (R.id.opcion4):
                Intent intent = new Intent(Home.this,acerca.class);
                startActivity(intent);

                break;

        }

        return super.onOptionsItemSelected(item);

    }

    public void cambiaIdioma(){}

}