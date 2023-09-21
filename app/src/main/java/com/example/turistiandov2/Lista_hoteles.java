package com.example.turistiandov2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.turistiandov2.adaptadores.adaptadorHoteles;
import com.example.turistiandov2.moldes.MoldeHotel;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

public class Lista_hoteles extends AppCompatActivity {

    ArrayList<MoldeHotel> listaHoteles = new ArrayList<>();
    RecyclerView recyclerView;

    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_hoteles);

        recyclerView=findViewById(R.id.litadinmicahoteles);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));


        db.collection("hoteles")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {

                                String nombreHotel = document.getString("nombre");
                                String precioHotel = document.getString("precio");
                                String  fotoHotel = document.getString("foto");
                                String telefonoHotel = document.getString("telefono");
                                String descripcionHotel = document.getString("descripcion");
                                Toast.makeText(Lista_hoteles.this, nombreHotel, Toast.LENGTH_SHORT).show();
                                Toast.makeText(Lista_hoteles.this, precioHotel, Toast.LENGTH_SHORT).show();
                                Toast.makeText(Lista_hoteles.this, fotoHotel, Toast.LENGTH_SHORT).show();
                                Toast.makeText(Lista_hoteles.this, telefonoHotel, Toast.LENGTH_SHORT).show();
                                Toast.makeText(Lista_hoteles.this, descripcionHotel, Toast.LENGTH_SHORT).show();


                            }
                        } else {
                           // Log.w(TAG, "Error getting documents.", task.getException());
                        }
                    }
                });


        llenarListaConDatos();
        adaptadorHoteles adaptadoreHoteles = new adaptadorHoteles(listaHoteles);
        recyclerView.setAdapter(adaptadoreHoteles);

    }

    public void llenarListaConDatos(){
        listaHoteles.add(new MoldeHotel("HOTEL BIMO","$150000","123456789",R.drawable.lhotel1,"esta es la reseña del hotel de tus sueños.... eso creo",R.drawable.lhotel3,"3.3"));
        listaHoteles.add(new MoldeHotel("HOTEL EL POLO","$160000","987654321",R.drawable.lhotel2,"esta vivo",R.drawable.lhotel2,"4.9"));
        listaHoteles.add(new MoldeHotel("HOTEL QUIERE ÑOÑO","$170000","147852369",R.drawable.lhotel3,"no existe",R.drawable.lhotel1,"3.8"));
        listaHoteles.add(new MoldeHotel("HOTEL PUES JAJA","$180000","369852147",R.drawable.lhotel4,"es el mejor",R.drawable.lhotel2,"1.1"));
        listaHoteles.add(new MoldeHotel("HOTEL BAJANDO POR PALMAS","$190000","951235786",R.drawable.lhotel5,"pues es un hotel",R.drawable.lhotel4,"2.5"));
    }
}