package com.company;

public class Cuarteto extends AgrupacionOficial implements Callejera{
    private Integer numMiembros;

    public Cuarteto(String nombre, String autor, String autorMusica, String autorLetras, String tipo, Integer puntos, Integer numMiembros) {
        super(nombre, autor, autorMusica, autorLetras, tipo, puntos);
        this.numMiembros = numMiembros;
    }

    public Integer getNumMiembros() {
        return numMiembros;
    }

    public void setNumMiembros(Integer numMiembros) {
        this.numMiembros = numMiembros;
    }

    @Override
    public String toString() {
        return "Cuarteto -> " +
                super.toString() + '\n' +
                "Número de Miembros: " + numMiembros;
    }

    @Override
    void caminito_del_falla() {
        System.out.println("El CUARTETO " + super.getNombre() + " va caminito del falla");
    }

    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escucha el CUARTETO " + super.getNombre());
    }

    @Override
    void cantar_la_presentacion() {
        System.out.println("Cantando la presentación del CUARTETO con nombre " + super.getNombre());
    }

    @Override
    void hacer_tipo() {
        System.out.println("El CUARTETO " + super.getNombre() + "va de " + super.getTipo());
    }

    @Override
    public void insertar_integrante(Integrante i) {
        if(super.getIntegrantes().length + 1 <= numMiembros){
            super.insertar_integrante(i);
        }
    }
}
