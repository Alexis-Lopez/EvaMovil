package com.platzi.evatransportes.Model;

import android.graphics.Path;

/**
 * Created by trini on 26/10/17.
 */

public class Cliente {
    private String Nombre;
    private String Dirrecion;
    private String NumeroViajes;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDirrecion() {
        return Dirrecion;
    }

    public void setDirrecion(String dirrecion) {
        Dirrecion = dirrecion;
    }

    public String getNumeroViajes() {
        return NumeroViajes;
    }

    public void setNumeroViajes(String estado) {
        NumeroViajes = estado;
    }

    public Cliente(String nombre, String dirrecion, String estado) {
        this.Nombre = nombre;
        this.Dirrecion = dirrecion;
        this.NumeroViajes = estado;
    }
}
