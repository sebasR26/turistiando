package com.example.turistiandov2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.turistiandov2.adaptadores.adaptadoresTurismos;
import com.example.turistiandov2.moldes.Moldeturismo;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

public class ListaSitiosTuristicos extends AppCompatActivity {

    ArrayList<Moldeturismo> ListaSitiosTuristicos=new ArrayList<>();
    RecyclerView recyclerView;

    FirebaseFirestore db = FirebaseFirestore.getInstance();

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
        ListaSitiosTuristicos.add(new Moldeturismo("EL JABALI ARDIENTE","JUAN PEREZ","123456789","$10000",R.drawable.lturismo1,R.drawable.lturismo5,"1.0","es un hotel que esta muy bonito ñeaa"));
        ListaSitiosTuristicos.add(new Moldeturismo("EL LAGO OSCURO","RGELIO MARTES","321654987","$1000",R.drawable.lturismo2,R.drawable.lturismo4,"2.0","algunas veces aparece un anñapero todo bien"));
        ListaSitiosTuristicos.add(new Moldeturismo("EL CARAMBA","JORGEN MARTIN","963258741","$20000",R.drawable.lturismo3,R.drawable.lturismo3,"3.0","se me acabaron las papitas estoy muy triste"));
        ListaSitiosTuristicos.add(new Moldeturismo("MARTES DE GALERIA","YERSON LUZ","741258963","$16000",R.drawable.lturismo4,R.drawable.lturismo2,"4.0","algun dia saldre de este infierno"));
        ListaSitiosTuristicos.add(new Moldeturismo("CHA CHA CHA","SEBASTIAN POLO","357894126","$28000",R.drawable.lturismo5,R.drawable.lturismo1,"5.0","vi un concierto de canserbero en vivo"));
    }
}