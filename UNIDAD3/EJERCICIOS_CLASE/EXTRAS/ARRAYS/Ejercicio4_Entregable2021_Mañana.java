package com.company;
import java.util.Arrays;

public class Ejercicio4_Entregable2021_Mañana {
    public static void main(String[] args) {
        int[][] numeros = new int[5][9];
        int menor = 1001, mayor = 0;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {

                int valor = (int)(Math.random() * 901 + 100);

                if (esta(valor, numeros)){
                    while (esta(valor, numeros)){
                        valor = (int)(Math.random() * 901 + 100);
                    }
                }

                numeros[i][j] = valor;
            }
        }

        for (int[] row:numeros) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println();
        System.out.println("EL NÚMERO MAYOR ESTÁ EN LA POSICIÓN " + Arrays.toString(maximo(mayor, numeros)));
        System.out.println("EL NÚMERO MENOR ESTÁ EN LA POSICIÓN " + Arrays.toString(minimo(menor, numeros)));

    }

    public static boolean esta (int num, int[][] array){

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (num == array[i][j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static int[] maximo (int num, int[][] numeros){

        int[] posicion = new int[2];
        int maximo = num;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if (numeros[i][j] > maximo){
                    maximo = numeros[i][j];
                    posicion[0] = i;
                    posicion[1] = j;
                }
            }
        }

        return posicion;
    }

    public static int[] minimo (int num, int[][] numeros){

        int[] posicion = new int[2];
        int minimo = num;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if (numeros[i][j] < minimo){
                    minimo = numeros[i][j];
                    posicion[0] = i;
                    posicion[1] = j;
                }
            }
        }

        return posicion;
    }
}
