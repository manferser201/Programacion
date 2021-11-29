package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1_Examen2021_Mañana_Rojo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dimension1, dimension2;

        System.out.println("INTRODUCE LA DIMENSIÓN DEL PRIMER ARRAY");
        dimension1 = teclado.nextInt();

        System.out.println("INTRODUCE LA DIMENSIÓN DEL SEGUNDO ARRAY");
        dimension2 = teclado.nextInt();

        int[] array1 = new int[dimension1];
        int[] array2 = new int[dimension2];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int)(Math.random() * 10 + 1);
        }

        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int)(Math.random() * 10 + 1);
        }

        System.out.println("v1: " + Arrays.toString(array1));
        System.out.println("v2: " + Arrays.toString(array2));

        System.out.println();
        System.out.println("EL RESULTADO DE LA UNIÓN DE LOS DOS VECTORES ES: " );
        System.out.print(Arrays.toString(unirSinRepetidos(array1, array2)));
    }

    public static int[] unirSinRepetidos(int v1[],int[] v2){

        int[] resultado = new int[0];

        for (int i = 0; i < v1.length; i++) {
            if (!esta(resultado, v1[i])){
                resultado = Arrays.copyOf(resultado, resultado.length + 1);
                resultado[resultado.length - 1] = v1[i];
            }
        }

        for (int i = 0; i < v2.length; i++) {
            if (!esta(resultado, v2[i])){
                resultado = Arrays.copyOf(resultado, resultado.length + 1);
                resultado[resultado.length - 1] = v2[i];
            }
        }
        
        return resultado;
    }

    public static boolean esta(int[] vector, int num){

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == num){
                return true;
            }
        }
        
        return false;
    }
}
