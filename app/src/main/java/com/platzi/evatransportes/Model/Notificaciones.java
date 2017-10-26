package com.platzi.evatransportes.Model;

/**
 * Created by trini on 26/10/17.
 */

public class Notificaciones {

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public Notificaciones(String titulo, String description, String status) {
        Titulo = titulo;
        Description = description;
        Status = status;
    }

    private String Titulo;
    private String Description;
    private String Status;

}
