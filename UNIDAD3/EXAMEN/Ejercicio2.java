package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dimensiones, posicion, valor;

        System.out.println("INTRODUZCA LAS DIMENSIONES DEL VECTOR");
        dimensiones = teclado.nextInt();

        int[] numeros = new int[dimensiones];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random() * 31);
        }

        System.out.println("INTRODUZCA EL VALOR QUE QUIERES INTRODUCIR EN EL VECTOR");
        valor = teclado.nextInt();
        System.out.println("INTRODUZCA LA POSICIÓN EN LA QUE QUIERE AÑADIR ESE VALOR");
        posicion = teclado.nextInt();

        System.out.println();
        System.out.println("EL VECTOR GENERADO DE DIMENSION " + dimensiones + " ES: " + Arrays.toString(numeros));

        System.out.println();

        System.out.println("EL VECTOR CON EL VALOR INTRODUCIDO QUEDA: " + Arrays.toString(insertaValor(numeros, valor, posicion)));

    }

    public static int[] insertaValor (int[] vector, int valor, int posicion){

        int[] solucion = new int[0];

        for (int i = 0; i < vector.length; i++) {
            if (i == posicion){
                solucion = Arrays.copyOf(solucion, solucion.length + 1);
                solucion[solucion.length - 1] = valor;
            }

            solucion = Arrays.copyOf(solucion, solucion.length + 1);
            solucion[solucion.length - 1] = vector[i];
        }

        return solucion;
    }
}
