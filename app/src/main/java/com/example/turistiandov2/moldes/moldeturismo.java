package com.example.turistiandov2.moldes;

public class moldeturismo {

    private String nombre;
    private String contacto;
    private String telefono;
    private String precio;
    private Integer foto;

    public moldeturismo() {
    }

    public moldeturismo(String nombre, String contacto, String telefono, String precio, Integer foto) {
        this.nombre = nombre;
        this.contacto = contacto;
        this.telefono = telefono;
        this.precio = precio;
        this.foto = foto;
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
