package com.company;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        byte num,primo;
        int i, j;
        primo = 0;
        boolean es_primo = true;

        System.out.println("INTRODUCE UN NÚMERO LÍMITE");
        num = teclado.nextByte();

        for (i = 2; i <= num; i++) {
            es_primo = true;
            for (j = 2; j < i; j++) {
                if (i % j == 0){
                    es_primo = false;
                    break;
                }
            }

            if (es_primo){
                System.out.println(i + " -> primo");
                primo++;
            } else {
                System.out.println(i + " -> no primo");
            }
        }

        System.out.println("ENTRE 1 Y "+ num + " HAY " + primo + " NÚMEROS PRIMOS");
    }
}
