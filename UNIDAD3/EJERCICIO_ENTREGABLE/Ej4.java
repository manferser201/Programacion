package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int desplazamiento, filas, columnas;

        System.out.println("INTRODUCE EL NÚMERO DE FILAS DEL VECTOR");
        filas = teclado.nextInt();

        System.out.println("INTRODUCE EL NÚMERO DE COLUMNAS DEL VECTOR");
        columnas = teclado.nextInt();

        int[][] vector = new int[filas][columnas];

        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[i].length; j++) {
                vector[i][j] = (int)(Math.random() * 21);
            }
        }

        for (int[] row:vector) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println();
        System.out.println("INTRODUCE EL NÚMERO DE COLUMNAS QUE QUIERA DESPLAZAR EL VECTOR");
        desplazamiento = teclado.nextInt();


        System.out.println("EL VECTOR DESPLAZADO " + desplazamiento + " COLUMNAS QUEDARÍA:");
        for (int[] row:desplazarMatriz(vector, desplazamiento)) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[][] desplazarMatriz (int[][] vector, int desplazamientos){

        int[][] desplazada = new int[vector.length][vector[1].length];

        while (desplazamientos >= vector[1].length){
            desplazamientos -= vector[1].length;
        }

        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[i].length; j++) {
                if (j + desplazamientos < vector[i].length){
                    desplazada[i][j + desplazamientos] = vector[i][j];
                } else {
                    desplazada[i][j + desplazamientos - vector[i].length] = vector[i][j];
                }
            }
        }

        return desplazada;
    }
}
