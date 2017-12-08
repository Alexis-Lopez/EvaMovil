package com.platzi.evatransportes.Model;

/**
 * Created by ISA on 10/11/2017.
 */

public class Travels  {
    public String getDestino() {
        return Destino;
    }

    public void setDestino(String destino) {
        Destino = destino;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public Travels(String destino, String estado) {
        Destino = destino;
        Estado = estado;
    }

    private String Destino;
    private String Estado;

}
