package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class Registro{
    private Propiedad[] propiedades;

    public Registro() {
        this.propiedades = new Propiedad[0];
    }

    @Override
    public String toString() {
        return  "Propiedades: " + Arrays.toString(propiedades) + "\n";
    }

    public void addPropiedad (Propiedad propiedad){

        propiedades = Arrays.copyOf(propiedades, propiedades.length + 1);
        propiedades[propiedades.length - 1] = propiedad;
    }

    public boolean eliminarPropiedad (Propiedad propiedad){

        if (esta(propiedad)){
            Propiedad[] resultado = new Propiedad[0];

            for (int i = 0; i < propiedades.length; i++) {
                if (!propiedades[i].equals(propiedad)){
                    resultado = Arrays.copyOf(resultado, resultado.length + 1);
                    resultado[resultado.length - 1] = propiedades[i];
                }
            }

            propiedades = resultado;
            return true;
        }

        return false;
    }

    private boolean esta (Propiedad propiedad){

        for (Propiedad p: this.propiedades) {
            if (p.equals(propiedad)){
                return true;
            }
        }

        return false;
    }

    public void informeSuperficie(){
        Arrays.sort(propiedades);
        System.out.println(Arrays.toString(propiedades));
    }

    public void informeAntiguedad(){

        Arrays.sort(propiedades, new Comparator<Propiedad>() {
            @Override
            public int compare(Propiedad p1, Propiedad p2) {
                if (p1.getYear().equals(p2.getYear())){
                    return p2.getmCuadrados() - p1.getmCuadrados();
                }

                return p2.getYear() - p1.getYear();
            }
        });

        System.out.println(Arrays.toString(propiedades));
    }

}
