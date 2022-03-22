package com.company;

import java.util.Arrays;
import java.util.Comparator;

abstract class AgrupacionOficial extends Agrupacion implements Comparator<AgrupacionOficial> {
    private Integrante[] integrantes;
    private Integer puntos;

    public AgrupacionOficial(String nombre, String autor, String autorMusica, String autorLetras, String tipo, Integer puntos) {
        super(nombre, autor, autorMusica, autorLetras, tipo);
        integrantes = new Integrante[0];
        this.puntos = puntos;
    }

    public Integrante[] getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(Integrante[] integrantes) {
        this.integrantes = integrantes;
    }

    public Integer getPuntos() {
        return puntos;
    }

    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "Integrantes: " + Arrays.toString(integrantes);
    }

    public void insertar_integrante(Integrante i){
        integrantes = Arrays.copyOf(integrantes, integrantes.length + 1);
        integrantes[integrantes.length - 1] = i;
    }

    public boolean eliminar_integrante(Integrante i){

        if (esta(i)){

            Integrante[] resultado = new Integrante[0];

            for (int j = 0; j < integrantes.length; j++) {
                if (!integrantes[j].equals(i)){
                    resultado = Arrays.copyOf(resultado, resultado.length + 1);
                    resultado[resultado.length - 1] = integrantes[j];
                }
            }

            integrantes = resultado;
        }

        return false;
    }

    private boolean esta(Integrante i){

        for (int j = 0; j < integrantes.length; j++) {
            if (integrantes[j].equals(i)){
                return true;
            }
        }

        return false;
    }

    abstract void caminito_del_falla();

    @Override
    public int compare(AgrupacionOficial agrupacionOficial, AgrupacionOficial t1) {
        return agrupacionOficial.getPuntos() - t1.getPuntos();
    }
}
