package com.company;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = {3, 5, 6, 2, 4, 23, 11, 3, 6};

        System.out.println(Arrays.toString(numeros));
        System.out.println("EL ARRAY SIN REPETIDOS QUEDA: " + Arrays.toString(sinRepetidos(numeros)));

    }

    public static int[] sinRepetidos(int[] vector){

        int[] resultado = new int[0];

        for (int i = 0; i < vector.length; i++) {
            if (!sonIguales(resultado, vector[i])) {
                resultado = Arrays.copyOf(resultado, resultado.length + 1);
                resultado[resultado.length-1] = vector[i];
            }
        }

        return resultado;
    }

    public static boolean sonIguales(int[] vector, int elemento){

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == elemento){
                return true;
            }
        }

        return false;
    }
}
