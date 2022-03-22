package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class COAC{
    private AgrupacionOficial[] agrupacionesOficiales;

    public COAC() {
        agrupacionesOficiales = new AgrupacionOficial[0];
    }

    public AgrupacionOficial[] getAgrupacionesOficiales() {
        return agrupacionesOficiales;
    }

    public void setAgrupacionesOficiales(AgrupacionOficial[] agrupacionesOficiales) {
        this.agrupacionesOficiales = agrupacionesOficiales;
    }

    @Override
    public String toString() {
        return "COAC{" +
                "agrupacionesOficiales=" + Arrays.toString(agrupacionesOficiales) +
                '}';
    }


    public void inscribir_agrupacion(AgrupacionOficial a){
        agrupacionesOficiales = Arrays.copyOf(agrupacionesOficiales, agrupacionesOficiales.length + 1);
        agrupacionesOficiales[agrupacionesOficiales.length - 1] = a;
    }

    public boolean eliminar_agrupacion(AgrupacionOficial a){

        if (esta(a)){

            AgrupacionOficial[] resultado = new AgrupacionOficial[0];

            for (int j = 0; j < agrupacionesOficiales.length; j++) {
                if (!agrupacionesOficiales[j].equals(a)){
                    resultado = Arrays.copyOf(resultado, resultado.length + 1);
                    resultado[resultado.length - 1] = agrupacionesOficiales[j];
                }
            }

            agrupacionesOficiales = resultado;
        }

        return false;
    }

    private boolean esta(AgrupacionOficial a){

        for (int j = 0; j < agrupacionesOficiales.length; j++) {
            if (agrupacionesOficiales[j].equals(a)){
                return true;
            }
        }

        return false;
    }

    private void ordenar_por_puntos(){
    }

    private void ordenar_por_nombre(){

    }

    private void ordenar_por_autor(){

    }


}
