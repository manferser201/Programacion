package com.company;

import java.util.Scanner;

public class Ejercicio7a {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] primerTrimestre = new double[5];
        double[] segundoTrimestre = new double[5];
        double[] tercerTrimestre = new double[5];
        double[] sumaAlumno = new double[5];


        double sumaPrimerTrimestre = 0, sumaSegundoTrimestre = 0, sumaTercerTrimestre = 0;
        byte alumno;


        for (int i = 1; i <= primerTrimestre.length; i++) {
            System.out.println("INTRODUCE LA NOTA DEL ALUMNO " + i + " EL EL PRIMER TRIMESTRE");
            primerTrimestre[i-1] = teclado.nextDouble();
        }

        System.out.println();

        for (int i = 1; i <= primerTrimestre.length; i++) {
            System.out.println("INTRODUCE LA NOTA DEL ALUMNO " + i + " EL EL SEGUNDO TRIMESTRE");
            segundoTrimestre[i-1] = teclado.nextDouble();
        }

        System.out.println();

        for (int i = 1; i <= primerTrimestre.length; i++) {
            System.out.println("INTRODUCE LA NOTA DEL ALUMNO " + i + " EL EL TERCER TRIMESTRE");
            tercerTrimestre[i-1] = teclado.nextDouble();
        }

        System.out.println();

        for (int i = 0; i < primerTrimestre.length; i++) {
            sumaAlumno[i] = primerTrimestre[i] + segundoTrimestre[i] + tercerTrimestre [i];
            sumaPrimerTrimestre += primerTrimestre[i];
            sumaSegundoTrimestre += segundoTrimestre[i];
            sumaTercerTrimestre += tercerTrimestre[i];

        }

        System.out.println("LA MEDIA DEL GRUPO EN EL PRIMER TRIMESTRE ES: " + sumaPrimerTrimestre / primerTrimestre.length);
        System.out.println("LA MEDIA DEL GRUPO EN EL SEGUNDO TRIMESTRE ES: " + sumaSegundoTrimestre / primerTrimestre.length);
        System.out.println("LA MEDIA DEL GRUPO EN EL TERCER TRIMESTRE ES: " + sumaTercerTrimestre / primerTrimestre.length);

        System.out.println();
        System.out.println("¿DE QUE ALUMNO QUIERE SABER LA NOTA? (1-5)");
        alumno = teclado.nextByte();

        System.out.println("LA MEDIA DEL ALUMNO " + alumno + " ES: " + sumaAlumno[alumno - 1] / 3);
    }
}
