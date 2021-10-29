package com.company;
import java.util.Scanner;

// Diseñar una función que nos diga si un número es primo

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;

        System.out.println("INTRODUCE UN NÚMERO");
        num = teclado.nextInt();

        if (primo(num) == true){
            System.out.println("EL NÚMERO ES PRIMO");
        } else {
            System.out.println("EL NUMERO NO ES PRIMO");
        }

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
}
