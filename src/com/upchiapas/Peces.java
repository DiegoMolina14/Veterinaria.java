package com.upchiapas;

public class Peces extends Mascota {

    String SalinidadVivienda;
    String Region;

    public Peces(String salinidadVivienda, String region) {
        SalinidadVivienda = salinidadVivienda;
        Region = region;
    }

    public Peces(
            String especie,
            String nombre,
            int edad,
            String indicaciones,
            String salinidadVivienda,
            String region
    ) {
        super(especie, nombre, edad, indicaciones);
        SalinidadVivienda = salinidadVivienda;
        Region = region;
    }

    public String getSalinidadVivienda() {
        return SalinidadVivienda;
    }

    public void setSalinidadVivienda(String salinidadVivienda) {
        SalinidadVivienda = salinidadVivienda;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }
}
