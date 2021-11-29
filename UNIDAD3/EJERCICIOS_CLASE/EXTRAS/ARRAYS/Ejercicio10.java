package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        int[] prueba = new int[5];

        System.out.println("NÚMERO DE IMPARES DERECHADOS: " + rellenaPares(prueba));
        System.out.println(Arrays.toString(prueba));

    }

    public static int rellenaPares (int[] tabla){
        Scanner teclado = new Scanner(System.in);
        int impares = 0, pares = 0, num;

        do {
            System.out.println("INTRODUCE UN NÚMERO");
            num = teclado.nextInt();

            if (num % 2 == 0){
                tabla[pares] = num;
                pares++;
            } else {
                impares++;
            }

        } while (pares < tabla.length);

        return impares;
    }
}
