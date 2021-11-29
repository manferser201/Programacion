package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3_Entregable2021_Mañana {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int filas, columnas;

        System.out.println("INTRODUCE EL NÚMERO DE FILAS DEL ARRAY");
        filas = teclado.nextInt();

        System.out.println("INTRODUCE EL NÚMERO DE COLUMNAS DEL ARRAY");
        columnas = teclado.nextInt();

        int[][] numero = new int[filas][columnas];

        for (int i = 0; i < numero.length; i++) {
            for (int j = 0; j < numero[i].length; j++) {
                numero[i][j] = (int)(Math.random() * 101);
            }
        }

        for (int[] row:numero) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println();

        System.out.println(Arrays.toString(corteza(numero)));
    }

    public static int[] corteza (int[][] n){

        int[] corteza = new int[0];

        // RECORRE EL ARRAY AL DERECHO
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                if (i == 0){
                    corteza = Arrays.copyOf(corteza, corteza.length + 1);
                    corteza[corteza.length - 1] = n[i][j];
                }


                if (i != 0 && i != n.length - 1){
                    if (j == n[i].length - 1){
                        corteza = Arrays.copyOf(corteza, corteza.length + 1);
                        corteza[corteza.length - 1] = n[i][j];
                    }
                }
            }
        }

        // RECORRE EL ARRAY AL REVES
        for (int i = n.length - 1; i >= 0; i--) {
            for (int j = n[i].length - 1; j >= 0; j--) {
                if (i == n.length - 1){
                    corteza = Arrays.copyOf(corteza, corteza.length + 1);
                    corteza[corteza.length - 1] = n[i][j];
                }


                if (i != 0 && i != n.length - 1){
                    if (j == 0){
                        corteza = Arrays.copyOf(corteza, corteza.length + 1);
                        corteza[corteza.length - 1] = n[i][j];
                    }
                }
            }
        }

        return corteza;
    }
}