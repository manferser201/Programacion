package com.company;

public class Chirigota extends AgrupacionOficial implements Callejera{
    private Integer numCumples;

    public Chirigota(String nombre, String autor, String autorMusica, String autorLetras, String tipo, Integer puntos, Integer numCumples) {
        super(nombre, autor, autorMusica, autorLetras, tipo, puntos);
        this.numCumples = numCumples;
    }

    public Integer getNumCumples() {
        return numCumples;
    }

    public void setNumCumples(Integer numCumples) {
        this.numCumples = numCumples;
    }

    @Override
    public String toString() {
        return "Chirigota -> " +
                super.toString() + '\n' +
                "Número de Cumplés: " + numCumples;
    }

    @Override
    void caminito_del_falla() {
        System.out.println("La CHIRIGOTA" + super.getNombre() + " va caminito del falla");
    }

    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escucha la CHIRIGOTA " + super.getNombre());
    }

    @Override
    void cantar_la_presentacion() {
        System.out.println("Cantando la presentación de la CHIRIGOTA con nombre " + super.getNombre());
    }

    @Override
    void hacer_tipo() {
        System.out.println("La CHIRIGOTA " + super.getNombre() + "va de " + super.getTipo());
    }
}
