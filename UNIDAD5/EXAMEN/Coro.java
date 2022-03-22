package com.company;

public class Coro extends AgrupacionOficial{
    private Integer numBandurrias;
    private Integer numGuitarras;

    public Coro(String nombre, String autor, String autorMusica, String autorLetras, String tipo, Integer puntos, Integer numBandurrias, Integer numGuitarras) {
        super(nombre, autor, autorMusica, autorLetras, tipo, puntos);
        this.numBandurrias = numBandurrias;
        this.numGuitarras = numGuitarras;
    }

    public Integer getNumBandurrias() {
        return numBandurrias;
    }

    public void setNumBandurrias(Integer numBandurrias) {
        this.numBandurrias = numBandurrias;
    }

    public Integer getNumGuitarras() {
        return numGuitarras;
    }

    public void setNumGuitarras(Integer numGuitarras) {
        this.numGuitarras = numGuitarras;
    }

    @Override
    public String toString() {
        return "Coro -> " +
                super.toString() + '\n' +
                "Número de Bandurrias: " + numBandurrias + '\n' +
                "Número de Guitarras: " + numGuitarras;
    }

    @Override
    void caminito_del_falla() {
        System.out.println("El CORO " + super.getNombre() + " va caminito del falla");
    }

    @Override
    void cantar_la_presentacion() {
        System.out.println("Cantando la presentación del CORO con nombre " + super.getNombre());
    }

    @Override
    void hacer_tipo() {
        System.out.println("El CORO " + super.getNombre() + "va de " + super.getTipo());
    }


}
