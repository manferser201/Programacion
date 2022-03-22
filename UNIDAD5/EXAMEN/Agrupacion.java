package com.company;

import java.util.Objects;

abstract class Agrupacion implements Comparable<Agrupacion>{
    private String nombre;
    private String autor;
    private String autorMusica;
    private String autorLetras;
    private String tipo;
    private static Integer NUMTOTAL = 0;

    public Agrupacion(String nombre, String autor, String autorMusica, String autorLetras, String tipo) {
        this.nombre = nombre;
        this.autor = autor;
        this.autorMusica = autorMusica;
        this.autorLetras = autorLetras;
        this.tipo = tipo;
        NUMTOTAL += 1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutorMusica() {
        return autorMusica;
    }

    public void setAutorMusica(String autorMusica) {
        this.autorMusica = autorMusica;
    }

    public String getAutorLetras() {
        return autorLetras;
    }

    public void setAutorLetras(String autorLetras) {
        this.autorLetras = autorLetras;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public static Integer getNUMTOTAL() {
        return NUMTOTAL;
    }

    public static void setNUMTOTAL(Integer NUMTOTAL) {
        Agrupacion.NUMTOTAL = NUMTOTAL;
    }

    @Override
    public String toString() {
        return  "nombre: " + nombre + '\n'+
                "autor: " + autor + '\n' +
                "autor de la Música: " + autorMusica + '\n' +
                "autor de las Letras: " + autorLetras + '\n' +
                "tipo: " + tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Agrupacion that = (Agrupacion) o;
        return nombre.equals(that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    abstract void cantar_la_presentacion();

    abstract void hacer_tipo();

    public void numAgrupaciones(){
        System.out.println("El número de agrupaciones totales son: " + NUMTOTAL);
    }

    @Override
    public int compareTo(Agrupacion agrupacion) {
        return 0;
    }
}
