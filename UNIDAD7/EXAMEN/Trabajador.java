package com.company;

import java.io.Serializable;
import java.util.Objects;

public class Trabajador implements Comparable, Serializable {
    private String dni;
    private String nombre;
    private String apellidos;
    private Integer edad;
    private String estudios;

    public Trabajador(String dni, String nombre, String apellidos, Integer edad, String estudios) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.estudios = estudios;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getEstudios() {
        return estudios;
    }

    public void setEstudios(String estudios) {
        this.estudios = estudios;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "dni='" + dni +
                ", nombre=" + nombre +
                ", apellidos=" + apellidos +
                ", edad=" + edad +
                ", estudios=" + estudios + '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trabajador that = (Trabajador) o;
        return dni.equals(that.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    @Override
    public int compareTo(Object o) {
        Trabajador t = (Trabajador) o;

        return getApellidos().compareTo(t.getApellidos());
    }
}
