package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2_Examen2021_Mañana_Rojo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int longitud, puntero = 0;

        System.out.println("INTRODUCE LA LONGITUD DEL VECTOR");
        longitud = teclado.nextInt();

        int[] vector = new int[longitud];

        do {
            if(puntero < vector.length){
                System.out.println("INTRODUCE EL DATO " + (puntero + 1) + " DEL VECTOR");
                vector[puntero] = teclado.nextInt();
            }

            puntero++;
        } while (puntero < vector.length);

        System.out.println();
        System.out.println("EL VECTOR QUE USTED HA CREADO ES: " + Arrays.toString(vector));
        System.out.println("EL VECTOR TRADUCIDO A STRING QUEDARÍA: ");
        System.out.print(convierteArrayEnString(vector));
    }

    public static String convierteArrayEnString(int[] a){

        String resultado = "";

        for (int i = 0; i < a.length; i++) {
            resultado += "" + a[i];
        }

        return resultado;
    }

}
