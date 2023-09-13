package com.example.turistiandov2.moldes;

import java.io.Serializable;

public class Molderestaurant implements Serializable {

    private String nombre;
    private String telefono;
    private String rangoPrecio;
    private String plato;
    private Integer imagen;

    private Integer fotoAdicionalRestaurante;

    private String valoracionAmpliandoRestauant;

    private  String descripcionAmpliandoRestaurante;

    public Molderestaurant() {
    }

    public Molderestaurant(String nombre, String telefono, String rangoPrecio, String plato, Integer imagen, Integer fotoAdicionalRestaurante, String valoracionAmpliandoRestauant, String descripcionAmpliandoRestaurante) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.rangoPrecio = rangoPrecio;
        this.plato = plato;
        this.imagen = imagen;
        this.fotoAdicionalRestaurante = fotoAdicionalRestaurante;
        this.valoracionAmpliandoRestauant = valoracionAmpliandoRestauant;
        this.descripcionAmpliandoRestaurante = descripcionAmpliandoRestaurante;
    }

    public String getDescripcionAmpliandoRestaurante() {
        return descripcionAmpliandoRestaurante;
    }

    public void setDescripcionAmpliandoRestaurante(String descripcionAmpliandoRestaurante) {
        this.descripcionAmpliandoRestaurante = descripcionAmpliandoRestaurante;
    }

    public String getValoracionAmpliandoRestauant() {
        return valoracionAmpliandoRestauant;
    }

    public void setValoracionAmpliandoRestauant(String valoracionAmpliandoRestauant) {
        this.valoracionAmpliandoRestauant = valoracionAmpliandoRestauant;
    }

    public Integer getFotoAdicionalRestaurante() {
        return fotoAdicionalRestaurante;
    }

    public void setFotoAdicionalRestaurante(Integer fotoAdicionalRestaurante) {
        this.fotoAdicionalRestaurante = fotoAdicionalRestaurante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRangoPrecio() {
        return rangoPrecio;
    }

    public void setRangoPrecio(String rangoPrecio) {
        this.rangoPrecio = rangoPrecio;
    }

    public String getPlato() {
        return plato;
    }

    public void setPlato(String plato) {
        this.plato = plato;
    }

    public Integer getImagen() {
        return imagen;
    }

    public void setImagen(Integer imagen) {
        this.imagen = imagen;
    }
}
