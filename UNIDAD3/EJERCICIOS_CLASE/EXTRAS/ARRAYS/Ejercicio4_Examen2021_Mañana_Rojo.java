package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4_Examen2021_Mañana_Rojo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dimension, dimension2;

        System.out.println("INTRODUCE LA DIMENSIÓN DEL PRIMER VECTOR");
        dimension = teclado.nextInt();

        System.out.println("INTRODUCE LA DIMENSIÓN DEL SEGUNDO VECTOR");
        dimension2 = teclado.nextInt();
        teclado.nextLine();

        String[][] vector = new String[dimension][dimension];
        String[][] vector2 = new String[dimension2][dimension2];
        String[][] error = new String[dimension][dimension2];

        if (dimension > dimension2 || dimension < dimension2){
            System.out.println(error);
        } else {

            for (int i = 0; i < vector.length; i++) {
                for (int j = 0; j < vector[i].length; j++) {
                    System.out.println("INTRODUCE LOS DATOS DEL ARRAY 1");
                    vector[i][j] = teclado.nextLine();
                }
            }

            for (int i = 0; i < vector2.length; i++) {
                for (int j = 0; j < vector2[i].length; j++) {
                    System.out.println("INTRODUCE LOS DATOS DEL ARRAY 2");
                    vector2[i][j] = teclado.nextLine();
                }
            }

            for (String[] row:unirMatrices(vector, vector2)) {
                System.out.println(Arrays.toString(row));
            }
        }

    }

    public static String[][] unirMatrices (String[][] vector, String[][] vector2){

        String[][] resultado = new String[vector.length][vector.length * 2];
        int puntero = 0;

        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[i].length; j++) {
                resultado[i][j] = vector[i][j];
            }
        }

        for (int i = 0; i < vector2.length; i++) {
            for (int j = vector2.length; j < vector.length * 2; j++) {
                resultado[i][j] = vector2[i][puntero];
                puntero++;
            }

            puntero = 0;
        }

        return resultado;
    }
}
