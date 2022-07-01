package com.upchiapas;

public class Gato extends Mascota{

    String Raza;
    String tipoAlimentacion;


    public Gato(String raza, String tipoAlimentacion) {
        Raza = raza;
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public Gato(String especie, String nombre, int edad, String indicaciones, String raza, String tipoAlimentacion) {
        super(especie, nombre, edad, indicaciones);
        Raza = raza;
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String raza) {
        Raza = raza;
    }

    public String getTipoAlimentacion() {
        return tipoAlimentacion;
    }

    public void setTipoAlimentacion(String tipoAlimentacion) {
        this.tipoAlimentacion = tipoAlimentacion;
    }
}

