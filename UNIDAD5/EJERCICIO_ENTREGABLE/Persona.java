package com.company;

import java.util.Objects;

public class Persona {
    private Integer ID;
    private String NIF;
    private String nombre;
    private String apellidos;
    private static Integer CONTADORID = 0;

    public Persona(String NIF, String nombre, String apellidos) {
        this.NIF = NIF;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.ID = CONTADORID;
        CONTADORID ++;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public static Integer getCONTADORID() {
        return CONTADORID;
    }

    public static void setCONTADORID(Integer CONTADORID) {
        Persona.CONTADORID = CONTADORID;
    }

    @Override
    public String toString() {
        return  "NIF: " + NIF + " " +
                "Nombre: " + nombre + " " +
                "Apellidos: " + apellidos + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return NIF.equals(persona.NIF);
    }

    @Override
    public int hashCode() {
        return Objects.hash(NIF);
    }
}
