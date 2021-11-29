package com.company;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float[] numeros = new float[5];

        for (int i = 1; i <= numeros.length; i++) {
            System.out.println("INTRODUCE EL VALOR " + i + " DEL ARRAY");
            numeros[i-1] = teclado.nextFloat();
        }

        for (int i = 0; i < numeros.length; i++) {
            if (i < numeros.length - 1){
                System.out.print(numeros[i] + ", ");
            } else {
                System.out.println(numeros[i]);
            }
        }
    }
}
