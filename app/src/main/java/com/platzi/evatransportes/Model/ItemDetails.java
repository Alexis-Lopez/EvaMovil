package com.platzi.evatransportes.Model;

/**
 * Created by trini on 24/10/17.
 */

public class ItemDetails {

    private String titulo;

    private String contenido;


    public ItemDetails(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
