package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.turistiandov2.adaptadores.adaptadorHoteles;
import com.example.turistiandov2.moldes.MoldeHotel;

import java.util.ArrayList;

public class Lista_hoteles extends AppCompatActivity {

    ArrayList<MoldeHotel> listaHoteles = new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_hoteles);

        recyclerView=findViewById(R.id.litadinmicahoteles);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        llenarListaConDatos();
        adaptadorHoteles adaptadoreHoteles = new adaptadorHoteles(listaHoteles);
        recyclerView.setAdapter(adaptadoreHoteles);

    }

    public void llenarListaConDatos(){
        listaHoteles.add(new MoldeHotel("HOTEL BIMO","$150000","123456789",R.drawable.lhotel1,"esta es la reseña del hotel de tus sueños.... eso creo",R.drawable.lhotel2));
        listaHoteles.add(new MoldeHotel("HOTEL EL POLO","$160000","987654321",R.drawable.lhotel2,"esta vivo",R.drawable.lhotel2));
        listaHoteles.add(new MoldeHotel("HOTEL QUIERE ÑOÑO","$170000","147852369",R.drawable.lhotel3,"no existe",R.drawable.lhotel2));
        listaHoteles.add(new MoldeHotel("HOTEL PUES JAJA","$180000","369852147",R.drawable.lhotel4,"es el mejor",R.drawable.lhotel2));
        listaHoteles.add(new MoldeHotel("HOTEL BAJANDO POR PALMAS","$190000","951235786",R.drawable.lhotel5,"pues es un hotel",R.drawable.lhotel2));
    }
}