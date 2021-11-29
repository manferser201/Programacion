package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1_Entregable2021_Tarde {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[0];
        int numero;

        do {
            System.out.println("INTRODUCE UN NÚMERO (PARA SALIR DEL BUCLE INTROUCE -1)");
            numero = teclado.nextInt();

            if (numero != -1){
                numeros = Arrays.copyOf(numeros, numeros.length + 1);
                numeros[numeros.length - 1] = numero;
            }

        }while (numero != -1);

        System.out.println("DE LOS NÚMEROS INTRODUCIDOS, SON PRIMOS LOS SIGUIENTES: " + Arrays.toString(filtraPrimos(numeros)));

    }

    public static int[] filtraPrimos(int[] numeros){

        int[] primos = new int[0];

        for (int i = 0; i < numeros.length; i++) {
            if (esPrimo(numeros[i])){
                primos = Arrays.copyOf(primos, primos.length + 1);
                primos[primos.length - 1] = numeros[i];
            }
        }

        if (primos.length == 0){
            primos = Arrays.copyOf(primos, primos.length + 1);
            primos[primos.length - 1] = -1;
        }

        return primos;
    }

    public static boolean esPrimo (int num){

        for (int i = 2; i < num; i++) {
            if (num % i == 0){
                return false;
            }
        }

        return true;
    }
}
