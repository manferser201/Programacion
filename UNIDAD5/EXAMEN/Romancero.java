package com.company;

public class Romancero extends Agrupacion implements Callejera{
    private String tematica;

    public Romancero(String nombre, String autor, String autorMusica, String autorLetras, String tipo, String tematica) {
        super(nombre, autor, autorMusica, autorLetras, tipo);
        this.tematica = tematica;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    @Override
    public String toString() {
        return "Romancero{" +
                super.toString() +
                "tematica='" + tematica + '\'' +
                '}';
    }

    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escucha el ROMANCERO " + super.getNombre());
    }

    @Override
    void cantar_la_presentacion() {
        System.out.println("Cantando la presentación del ROMANCERO con nombre " + super.getNombre());
    }

    @Override
    void hacer_tipo() {
        System.out.println("El ROMANCERO " + super.getNombre() + "va de " + super.getTipo());
    }
}
