package com.example.turistiandov2.adaptadores;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.turistiandov2.AmpliandoRestaurantes;
import com.example.turistiandov2.R;
import com.example.turistiandov2.moldes.Molderestaurant;

import java.util.ArrayList;

public class adaptadorRestaurantes extends RecyclerView.Adapter<adaptadorRestaurantes.viewHolder>{
    //todos adaptador tiene unalista de elementos

    public ArrayList<Molderestaurant> listarestaurante;

    //creamos un consructor vacio

    public adaptadorRestaurantes() {
    }


    //creamos un constructor lleno


    public adaptadorRestaurantes(ArrayList<Molderestaurant> listarestaurante) {
        this.listarestaurante = listarestaurante;
    }

    @NonNull
    @Override
    public adaptadorRestaurantes.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //esta porcion de codigo permite crear N copias del molde grafico
        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.molderestaurante,null,false);
        return new viewHolder(vista);

    }

    @Override
    public void onBindViewHolder(@NonNull adaptadorRestaurantes.viewHolder holder, int position) {
        holder.actualizarDatos(listarestaurante.get(position));
    }

    @Override
    public int getItemCount() {
        return listarestaurante.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        TextView nombreRetaurante;
        ImageView fotoRestaurante;
        TextView precioRestaurante;
        TextView contactoRestaurante;
        TextView platoRestaurante;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            nombreRetaurante = itemView.findViewById(R.id.nombrerestaurante);
            fotoRestaurante = itemView.findViewById(R.id.fotorestaurante);
            precioRestaurante = itemView.findViewById(R.id.preciorestaurante);
            platoRestaurante = itemView.findViewById(R.id.comidadrestaurante);
            contactoRestaurante = itemView.findViewById(R.id.numerostelefonosrestaurante);


        }

        public void actualizarDatos(Molderestaurant molderestaurant) {

            nombreRetaurante.setText(molderestaurant.getNombre());
            fotoRestaurante.setImageResource(molderestaurant.getImagen());
            precioRestaurante.setText(molderestaurant.getRangoPrecio());
            platoRestaurante.setText(molderestaurant.getPlato());
            contactoRestaurante.setText(molderestaurant.getTelefono());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(), AmpliandoRestaurantes.class);
                    intent.putExtra("datosRestaurant",molderestaurant);
                    itemView.getContext().startActivity(intent);
                }
            });



        }
    }

}
