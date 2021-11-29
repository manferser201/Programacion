package com.company;
import java.util.Arrays;
import java.util.Scanner;

// LAS FILAS SON LOS ALUMNOS

public class Ejercicio7c_Bidimensional {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[][] notas = new int[5][3];
        String[] nombreAlumno = new String[notas.length];

        String alumno;
        double suma = 0;
        int contador = 0;

        for (int i = 1; i <= nombreAlumno.length; i++) {
            System.out.println("INTRODUCE EL NOMBRE DEL ALUMNO " + i);
            nombreAlumno[i-1] = teclado.nextLine();
            System.out.println();
        }

        for (int i = 1; i <= notas.length; i++) {

            for (int j = 1; j <= notas[i-1].length; j++) {
                System.out.println("INTRODUZCA LAS NOTAS DE " + nombreAlumno[i-1] + " EN EL " + j + "º TRIMESTRE");
                notas[i-1][j-1] = teclado.nextInt();
                System.out.println();
            }
        }

        for (int j = 0; j < notas[j].length; j++) {
            suma = 0;
            for (int i = 0; i < notas.length; i++) {
                suma += notas[i][j];
            }
            System.out.println("LA NOTA MEDIA DEL " + (j + 1) + "º TRIMESTRE ES: " + suma/ notas.length);
        }

        teclado.nextLine();
        System.out.println();
        System.out.println("¿DE QUÉ ALUMNO CONCRETO QUIERE SABER LA MEDIA?");
        alumno = teclado.nextLine();

        for (int i = 0; i < nombreAlumno.length; i++) {

            if (alumno.equals(nombreAlumno[i])){

                for (int j = 0; j < notas[i].length; j++) {
                    suma += notas[i][j];
                    contador++;
                }

            }
        }

        System.out.println("LA MEDIA DE " + alumno + " ES: " + suma / contador);

    }
}
