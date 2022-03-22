package com.company;

public class Integrante {
    private Integer numParticipante;
    private String nombre;
    private Integer edad;
    private String loccalidad;

    public Integrante(Integer numParticipante, String nombre, Integer edad, String loccalidad) {
        this.numParticipante = numParticipante;
        this.nombre = nombre;
        this.edad = edad;
        this.loccalidad = loccalidad;
    }

    public Integer getNumParticipante() {
        return numParticipante;
    }

    public void setNumParticipante(Integer numParticipante) {
        this.numParticipante = numParticipante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getLoccalidad() {
        return loccalidad;
    }

    public void setLoccalidad(String loccalidad) {
        this.loccalidad = loccalidad;
    }

    @Override
    public String toString() {
        return  "Número participante: " + numParticipante + '\n' +
                "Nombre: " + nombre + '\n' +
                "Edad: " + edad + '\n' +
                "Loccalidad: " + loccalidad;
    }

}
