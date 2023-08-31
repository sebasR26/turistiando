package com.example.turistiandov2.adaptadores;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.turistiandov2.AmpliandoHotel;
import com.example.turistiandov2.R;
import com.example.turistiandov2.moldes.MoldeHotel;

import java.util.ArrayList;

public class    adaptadorHoteles extends RecyclerView.Adapter<adaptadorHoteles.viewHolder> {


    //todos adaptador tiene unalista de elementos

    public ArrayList<MoldeHotel> listaHoteles;

    //creamos un consructor vacio

    public adaptadorHoteles() {
    }


    //creamos un constructor lleno


    public adaptadorHoteles(ArrayList<MoldeHotel> listaHoteles) {
        this.listaHoteles = listaHoteles;
    }

    @NonNull
    @Override
    public adaptadorHoteles.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //esta porcion de codigo permite crear N copias del molde grafico
        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_moldehoteles,null,false);
        return new viewHolder(vista);

    }

    @Override
    public void onBindViewHolder(@NonNull adaptadorHoteles.viewHolder holder, int position) {
    holder.actualizarDatos(listaHoteles.get(position));
    }

    @Override
    public int getItemCount() {
        return listaHoteles.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView fotoHotel;
        TextView nombreHoel;
        TextView precioHotel;
        TextView contctoHotel;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            fotoHotel = itemView.findViewById(R.id.fotolistahotel);
            nombreHoel=itemView.findViewById(R.id.nombeListaHotel);
            precioHotel = itemView.findViewById(R.id.precioListaHotel);
            contctoHotel = itemView.findViewById(R.id.numTelListaHotel);

        }

        public void actualizarDatos(MoldeHotel moldeHotel) {
            fotoHotel.setImageResource(moldeHotel.getFoto());
            nombreHoel.setText(moldeHotel.getNombre());
            precioHotel.setText(moldeHotel.getPrecio());
            contctoHotel.setText(moldeHotel.getTelefono());


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(), AmpliandoHotel.class);
                    intent.putExtra("datosHotel",moldeHotel);
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}
