package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int filas, columnas;

        System.out.println("INTRODUCE EL NUMERO DE FILAS DEL ARRAY (ESTE NÚMERO SIEMPRE TIENE QUE SER PAR)");
        filas = teclado.nextInt();

        System.out.println("INTRODUCE EL NÚMERO DE COLUMNAS DEL ARRAY");
        columnas = teclado.nextInt();

        if (filas % 2 != 0){
            System.out.println("LO SENTIMOS, EL NÚMERO DE FILAS INTRODUCIDAS NO ES CORRECTO");
        } else {

            int[][] numeros = new int[filas][columnas];

            for (int i = 0; i < numeros.length; i++) {
                for (int j = 0; j < numeros[i].length; j++) {
                    numeros[i][j] = (int)(Math.random() * 101);
                }

                System.out.println(Arrays.toString(numeros[i]));
            }

            System.out.println();

            System.out.println("EL RESULTADO DE LA MATRIZ SIN FILAS PARES SERÍA: ");
            for (int[] row : eliminarFilasPares(numeros)) {
                System.out.println(Arrays.toString(row));
            }

            System.out.println();

            System.out.println("EL RESULTADO DE LA MATRIZ SIN FILAS IMPARES SERÍA: ");
            for (int[] row : eliminarFilasImpares(numeros)) {
                System.out.println(Arrays.toString(row));
            }

        }
    }

    public static int[][] eliminarFilasPares(int[][] matriz){

        int[][] solucion = new int[matriz.length / 2][matriz[0].length];
        int puntero = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i % 2 != 0){
                    solucion[puntero][j] = matriz[i][j];
                }
            }

            if (i % 2 != 0){
                puntero++;
            }
        }



        return solucion;
    }

    public static int[][] eliminarFilasImpares(int[][] matriz){

        int[][] solucion = new int[matriz.length / 2][matriz[0].length];
        int puntero = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i % 2 == 0){
                    solucion[puntero][j] = matriz[i][j];
                }
            }

            if (i % 2 == 0){
                puntero++;
            }
        }

        return solucion;
    }
}
