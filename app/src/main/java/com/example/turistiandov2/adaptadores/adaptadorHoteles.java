package com.example.turistiandov2.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.turistiandov2.R;
import com.example.turistiandov2.moldes.MoldeHotel;

import java.util.ArrayList;

public class adaptadorHoteles extends RecyclerView.Adapter<adaptadorHoteles.viewHolder> {


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
        //esta porcion de codigo permite crear n copias del molde grafico
        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_moldehoteles,null,false);
        return new parent(vista);

    }

    @Override
    public void onBindViewHolder(@NonNull adaptadorHoteles.viewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
