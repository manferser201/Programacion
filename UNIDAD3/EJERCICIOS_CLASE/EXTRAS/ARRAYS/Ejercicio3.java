package com.company;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cantidadDatos, sumaPositivos = 0, sumaNegativos = 0, numCeros = 0, numNegativos = 0, numPositivos = 0;

        System.out.println("¿CUÁNTOS DATOS QUIERE INTRODUCIR?");
        cantidadDatos = teclado.nextInt();

        int[] numeros = new int[cantidadDatos];

        for (int i = 1; i <= numeros.length; i++) {
            System.out.println("INTRODUCE EL DATO " + i + ": ");
            numeros[i-1] = teclado.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 0){
                numCeros++;
            } else if (numeros[i] < 0){
                sumaNegativos += numeros[i];
                numNegativos++;
            } else {
                sumaPositivos += numeros[i];
                numPositivos++;
            }
        }

        System.out.println("LA MEDIA DE LOS NÚMEROS NEGATIVOS INTRODUCIDOS ES: " + sumaNegativos / numNegativos);
        System.out.println("LA MEDIA DE LOS NÚMEROS POSITIVOS INTRODUCIDOS ES: " + sumaPositivos / numPositivos);
        System.out.println("EL NÚMERO INTRODUCIDO DE CEROS HA SIDO DE: " + numCeros);
    }
}
