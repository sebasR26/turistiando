package com.example.turistiandov2.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.turistiandov2.R;
import com.example.turistiandov2.moldes.moldeturismo;

import java.util.ArrayList;

public class adaptadoresTurismos extends RecyclerView.Adapter<adaptadoresTurismos.viewHolder> {

    //todos adaptador tiene unalista de elementos

    public ArrayList<moldeturismo> listaTurismo;

    //creamos un consructor vacio

    public adaptadoresTurismos() {
    }


    //creamos un constructor lleno


    public adaptadoresTurismos(ArrayList<moldeturismo> listaTurismo) {
        this.listaTurismo = listaTurismo;
    }

    @NonNull
    @Override
    public adaptadoresTurismos.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //esta porcion de codigo permite crear N copias del molde grafico
        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.moldeturismo,null,false);
        return new viewHolder(vista);

    }

    @Override
    public void onBindViewHolder(@NonNull adaptadoresTurismos.viewHolder holder, int position) {
        holder.actualizarDatos(listaTurismo.get(position));
    }

    @Override
    public int getItemCount() {
        return listaTurismo.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        TextView nombreTurismo;
        ImageView fotoTurismo;
        TextView contactoTurismo;
        TextView telefonoTurismo;
        TextView precioTurismo;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            nombreTurismo = itemView.findViewById(R.id.nombreturismocambiante);
            fotoTurismo = itemView.findViewById(R.id.imagenturismo);
            contactoTurismo = itemView.findViewById(R.id.nombreContatoTurismoCambiante);
            telefonoTurismo = itemView.findViewById(R.id.telefonoCambianteTurismo);
            precioTurismo = itemView.findViewById(R.id.precioTurismo);

        }

        public void actualizarDatos(moldeturismo moldeturismo) {
            nombreTurismo.setText(moldeturismo.getNombre());
            fotoTurismo.setImageResource(moldeturismo.getFoto());
            contactoTurismo.setText(moldeturismo.getContacto());
            telefonoTurismo.setText(moldeturismo.getTelefono());
            precioTurismo.setText(moldeturismo.getPrecio());
        }
    }
}
