package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dimensiones;

        System.out.println("INTRODUZCA LAS DIMENSIONES DEL VECTOR");
        dimensiones = teclado.nextInt();

        int[][] numeros = new int[dimensiones][dimensiones];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = (int)(Math.random() * 101 + 100);
            }
        }

        for (int[] row : numeros) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println("HAY " + numPicos(numeros) + " PICOS");
    }

    public static int numPicos (int[][] numeros){

        int numeroPicos = 0;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                if (mayor(numeros, i, j)){
                    numeroPicos++;
                }

                if (igual(numeros, i, j)){
                    numeroPicos++;
                }

            }
        }

        return numeroPicos;
    }

    public static boolean mayor (int[][] numeros, int x, int y){

        int mayor = 0;
        // vertical
        int i = x - 1;
        int j = y;

        while (estaDentro(numeros, i, j)){
            if (){

            }
            if (numeros[x][y] > numeros[i][j]){
                mayor++;
            }
            i++;
        }

        return false;
    }

    public static boolean igual (int[][] numeros, int x, int y){

        int i = x, j = y, mayor = 0;
        int i = x - 1;
        int j = y - 1;
        while (estaDentro(numeros, i, j)){
            if ()
        }

        return false;
    }

    public static boolean estaDentro (int[][] numeros, int i, int j){
        if (i >= 0 && i <= numeros.length && j >= 0 && j <= numeros[0].length){
            return true;
        }

        return false;
    }
}
