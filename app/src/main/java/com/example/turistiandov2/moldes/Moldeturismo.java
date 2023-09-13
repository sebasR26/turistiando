package com.example.turistiandov2.moldes;

import java.io.Serializable;

public class Moldeturismo implements Serializable {

    private String nombre;
    private String contacto;
    private String telefono;
    private String precio;
    private Integer foto;

    private Integer fotoAdicionalTurismo;

    private  String valoracionAmpliandoRestauant;

    private String descripcionAmpliandoTurismo;

    public Moldeturismo() {
    }

    public Moldeturismo(String nombre, String contacto, String telefono, String precio, Integer foto, Integer fotoAdicionalTurismo, String valoracionAmpliandoRestauant, String descripcionAmpliandoTurismo) {
        this.nombre = nombre;
        this.contacto = contacto;
        this.telefono = telefono;
        this.precio = precio;
        this.foto = foto;
        this.fotoAdicionalTurismo = fotoAdicionalTurismo;
        this.valoracionAmpliandoRestauant = valoracionAmpliandoRestauant;
        this.descripcionAmpliandoTurismo = descripcionAmpliandoTurismo;
    }

    public String getDescripcionAmpliandoTurismo() {
        return descripcionAmpliandoTurismo;
    }

    public void setDescripcionAmpliandoTurismo(String descripcionAmpliandoTurismo) {
        this.descripcionAmpliandoTurismo = descripcionAmpliandoTurismo;
    }

    public String getValoracionAmpliandoRestauant() {
        return valoracionAmpliandoRestauant;
    }

    public void setValoracionAmpliandoRestauant(String valoracionAmpliandoRestauant) {
        this.valoracionAmpliandoRestauant = valoracionAmpliandoRestauant;
    }

    public Integer getFotoAdicionalTurismo() {
        return fotoAdicionalTurismo;
    }

    public void setFotoAdicionalTurismo(Integer fotoAdicionalTurismo) {
        this.fotoAdicionalTurismo = fotoAdicionalTurismo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public Integer getFoto() {
        return foto;
    }

    public void setFoto(Integer foto) {
        this.foto = foto;
    }
}
