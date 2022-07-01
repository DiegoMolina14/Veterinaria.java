package com.upchiapas;

import java.util.ArrayList;

public class Mascota {

    String Especie;
    String Nombre;
    int Edad;
    String Indicaciones;

    public static ArrayList<Mascota> listaPets = new ArrayList<Mascota>();

    public ArrayList<Mascota> getListaPets() {
        return listaPets;
    }

    public Mascota() {}

    public Mascota(
            String especie,
            String nombre,
            int edad,
            String indicaciones
    ) {
        Especie = especie;
        Nombre = nombre;
        Edad = edad;
        Indicaciones = indicaciones;
    }

    public String getEspecie() {
        return Especie;
    }

    public void setEspecie(String especie) {
        Especie = especie;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String getIndicaciones() {
        return Indicaciones;
    }

    public void setIndicaciones(String indicaciones) {
        Indicaciones = indicaciones;
    }

    public void addPet(Mascota pet) {
        listaPets.add(pet);
        System.out.println("Mascota Guardada");
    }
}
