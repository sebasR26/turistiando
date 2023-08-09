package com.example.turistiandov2.moldes;

public class molderestaurant {

    private String nombre;
    private String telefono;
    private String rangoPrecio;
    private String plato;
    private Integer imagen;

    public molderestaurant() {
    }

    public molderestaurant(String nombre, String telefono, String rangoPrecio, String plato, Integer imagen) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.rangoPrecio = rangoPrecio;
        this.plato = plato;
        this.imagen = imagen;
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
