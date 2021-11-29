package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros1 = new int[6];
        int[] numeros2 = new int[6];
        int inicial = 0;

        for (int i = 1; i <= numeros1.length; i++) {
            System.out.println("INTRODUCE EL DATO " + i + " DEL PRIMER ARRAY: ");
            numeros1[i-1] = teclado.nextInt();
        }

        for (int i = 1; i <= numeros2.length; i++) {
            System.out.println("INTRODUCE EL DATO " + i + " DEL SEGUNDO ARRAY: ");
            numeros2[i-1] = teclado.nextInt();
        }

        Arrays.sort(numeros1);
        System.out.println(Arrays.toString(numeros1));

        Arrays.sort(numeros2);
        System.out.println(Arrays.toString(numeros2));

        int[] numeros3 = new int[12];

        for (int i = 0; i < numeros3.length / 2; i++) {
            numeros3[i] = numeros1[i];
        }

        for (int i = numeros3.length / 2; i < numeros3.length; i++) {
            numeros3[i] = numeros2[inicial];
            inicial++;
        }

        Arrays.sort(numeros3);
        System.out.println(Arrays.toString(numeros3));
    }
}
