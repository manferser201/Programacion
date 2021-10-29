package com.company;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, negativo, positivo, i;

        negativo = 0;
        positivo = 0;
        i = 0;

        do {
            System.out.println("INTRODUCE UN NÚMERO");
            num = teclado.nextInt();

            if (num < 0){
                negativo++;
            } else{
                positivo++;
            }
            i++;
        } while (i < 10);

        System.out.println("HAY " + positivo + " NÚMEROS POSITIVOS Y " + negativo + " NÚMEROS NEGATIVOS");

    }
}
