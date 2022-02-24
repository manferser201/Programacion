package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Persona p1 = new Persona("123123132", "Manuel", "Fernández");
        Persona p2 = new Persona("1524584", "Javier", "Coronel");
        Persona p3 = new Persona("7987998798", "Mario", "Cantero");
        Persona p4 = new Persona("123123132", "JJ", "Nose");
        Persona p5 = new Persona("456465465", "Xavi", "Hernández");
        Persona p6 = new Persona("1456845678", "Adrian", "Tellado");

	    Vivienda v1 = new Vivienda(2001, "Los limones", 200, 2, 4, 5, 2000.0);
	    Vivienda v2 = new Vivienda(2020, "Mi casa", 220, 4, 8, 12, 2500.0);

        // COMPROBAMOS QUE EL MÉTODO AÑADIR PERSONA FUNCIONA Y ACEPTA EL LÍMITE
        v1.addPersona(p1);
        v1.addPersona(p2);
        v1.addPersona(p3);
        v1.addPersona(p4);
        v1.addPersona(p5);
        v1.addPersona(p6);

        System.out.println(v1.mostrarPropiedad());

        // COMPROBAMOS QUE EL MÉTODO ELIMINAR PERSONA FUNCIONA
        v1.eliminarPersona(p5);

        System.out.println(v1.toString());


        LocalIndustrial li1 = new LocalIndustrial(2001, "Mi casa", 250, p1, 250000.0, 250);

        System.out.println(li1.mostrarPropiedad());

        li1.mostrarPrecioVenta();

        LocalComercial lc1 = new LocalComercial(2020, "la casa del vecino", 200, p1, 25000.0, "Venta de ropa");

        System.out.println(lc1.mostrarPropiedad());

        // COMPROBAMOS QUE EL MÉTODO MOSTRAR PRECIO VENTA FUNCIONA EN TODOS LOS CASOS
        lc1.mostrarPrecioVenta();
        v1.mostrarPrecioVenta();
        li1.mostrarPrecioVenta();
        System.out.println();


        Registro r1 = new Registro();

        r1.addPropiedad(v1);
        r1.addPropiedad(li1);
        r1.addPropiedad(lc1);

        r1.informeSuperficie();

        r1.informeAntiguedad();

        Vivienda[] viviendas = {v1, v2};

        Arrays.sort(viviendas, new Comparator<Vivienda>() {
            @Override
            public int compare(Vivienda v1, Vivienda v2) {
                return v1.getNumHabitaciones() - v2.getNumHabitaciones();
            }
        });

        System.out.println(Arrays.toString(viviendas));

    }
}
