package com.company;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cantidadDatos;

        System.out.println("¿CUÁNTOS DATOS QUIERE INTRODUCIR?");
        cantidadDatos = teclado.nextInt();

        int[] numeros = new int[cantidadDatos];

        for (int i = 1; i <= numeros.length; i++) {
            System.out.println("INTRODUCE EL DATO " + i + ": ");
            numeros[i-1] = teclado.nextInt();
        }

        for (int i = numeros.length - 1; i >= 0 ; i--) {
            if (i > 0){
                System.out.print(numeros[i] + ", ");
            } else {
                System.out.println(numeros[i]);
            }
        }
    }
}
