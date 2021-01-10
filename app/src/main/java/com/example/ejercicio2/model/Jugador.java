package com.example.ejercicio2.model;

import android.widget.ImageView;

import java.io.Serializable;

public class Jugador implements Serializable {

    private long id;
    private String nombre;
    private String equipo;
    private String numPlayera;
    private ImageView imagen;

    public Jugador(long id, String nombre, String equipo, String numPlayera, ImageView imagen) {
        this.id = id;
        this.nombre = nombre;
        this.equipo = equipo;
        this.numPlayera = numPlayera;
        this.imagen = imagen;
    }

    public Jugador(long id, String nombre, String equipo, String numPlayera) {
        this.id = id;
        this.nombre = nombre;
        this.equipo = equipo;
        this.numPlayera = numPlayera;
    }

    public ImageView getImagen() {
        return imagen;
    }

    public void setImagen(ImageView imagen) {
        this.imagen = imagen;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getNumPlayera() {
        return numPlayera;
    }

    public void setNumPlayera(String numPlayera) {
        this.numPlayera = numPlayera;
    }


}
