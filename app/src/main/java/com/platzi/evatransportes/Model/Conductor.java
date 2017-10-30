package com.platzi.evatransportes.Model;

/**
 * Created by trini on 26/10/17.
 */

public class Conductor {

    private String Nombre;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String destino) {
        Destino = destino;
    }

    public String getHoraLlegada() {
        return HoraLlegada;
    }

    public void setHoraLlegada(String horaLlegada) {
        HoraLlegada = horaLlegada;
    }

    private String Destino;
    private String HoraLlegada;


    public Conductor(String nombre, String destino, String horaLlegada) {
        Nombre = nombre;
        Destino = destino;
        HoraLlegada = horaLlegada;
    }
}
