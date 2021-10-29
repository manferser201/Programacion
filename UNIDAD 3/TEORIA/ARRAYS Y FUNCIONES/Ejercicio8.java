package com.company;
import java.util.Scanner;

/* Escribir una función a la que se le pase un número entero
y devuelva el número de divisores primos que tiene.
*/

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;

        System.out.println("INTRODUCE UN NÚMERO");
        num = teclado.nextInt();

        System.out.println(num + " TIENE " + numDivisores(num) + " DIVISORES PRIMOS");
    }

    public static boolean primo (int num){
        boolean primo = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0){
                primo = false;
                break;
            }
        }
        return primo;
    }

    public static int numDivisores (int num){
        int divisores = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0 && primo(i) == true){
                divisores++;

                System.out.println(i);
            }
        }
        return divisores;
    }
}
