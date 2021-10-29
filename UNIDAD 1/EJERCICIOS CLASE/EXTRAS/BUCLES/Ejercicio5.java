package com.company;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int max, min, num, aux;

        System.out.println("POR FAVOR INTRODUCE EL MÍNIMO DEL RANGO");
        min = teclado.nextInt();

        System.out.println("POR FAVOR INTRODUCE EL MÁXIMO DEL RANGO");
        max = teclado.nextInt();

        if (min > max){
            aux = min;
            min = max;
            max = aux;
        }

        do {
            System.out.println("INTRODUZCA UN NÚMERO DENTRO DEL RANGO ESTABLECIDO");
            num = teclado.nextInt();

            if (num > min && num < max){
                break;
            }

        } while (num < min || num > max);

    }
}
