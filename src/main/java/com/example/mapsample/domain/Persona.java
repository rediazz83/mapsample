package com.example.mapsample.domain;

public class Persona {
    private int id;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String apodoSlack;
    private static final String BLANCO = " ";

    public Persona(int id, String nombre, String apellidoPaterno, String apellidoMaterno, String apodoSlack) {
        this.id = id;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.apodoSlack = apodoSlack;
    }

    public String obtenerNombreCompleto() {
        return new StringBuilder(nombre).append(BLANCO).append(apellidoPaterno)
                .append(BLANCO).append(apellidoMaterno).append(BLANCO).append(apodoSlack).toString();
    }

    public void setApodoSlack(String apodoSlack) {
        this.apodoSlack = apodoSlack;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Persona other = (Persona) obj;
        if (this.id != other.getId())
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + this.id;
        return result;
    }
}
