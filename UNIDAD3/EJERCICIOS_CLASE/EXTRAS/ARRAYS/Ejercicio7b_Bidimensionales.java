package com.company;
import java.util.Scanner;

// LAS FILAS SON LOS TRIMESTRES

public class Ejercicio7b_Bidimensionales {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[][] notas = new int[3][5];
        int[][] sumaAlumno = new int[1][5];

        byte alumno;
        double suma;

        for (int i = 1; i <= notas.length; i++) {
            suma = 0;
            for (int j = 1; j <= notas[i].length; j++) {
                System.out.println("INTRODUZCA LAS NOTAS DEL ALUMNO " + j + " EN EL " + i + "º TRIMESTRE");
                notas[i-1][j-1] = teclado.nextInt();

                suma += notas[i][j];
                sumaAlumno[1][j] = notas[i][j] + notas[i][j] + notas[i][j];
            }

            System.out.println("LA MEDDIA DEL GRUPO EN EL " + i + "º TRIMESTRE ES: " + suma);
        }

        System.out.println();
        System.out.println("¿DE QUE ALUMNO QUIERE SABER LA NOTA? (1-5)");
        alumno = teclado.nextByte();

        System.out.println("LA MEDIA DEL ALUMNO " + alumno + " ES: " + sumaAlumno[0][alumno-1] / 3);


    }


}
