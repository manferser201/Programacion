package com.company;
import java.util.Scanner;

// Crea un programa que pida al usuario dos números enteros y cuántos de ellos son pares.

public class Propuesto7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2;

        System.out.println("INTRODUZCA DOS NÚMEROS");
        num1 = teclado.nextInt();
        num2 = teclado.nextInt();

        if (num1 % 2 == 0 && num2 % 2 != 0) {
            System.out.println(num1 + " ES PAR");
        } else if (num2 % 2 == 0 && num1 % 2 != 0) {
            System.out.println(num2 + " ES PAR");
        } else if (num2 % 2 == 0 && num1 % 2 == 0) {
            System.out.println("LOS DOS NÚMEROS SON PARES");
        } else {
            System.out.println("NINGUNO DE LOS DOS SON PARES");
        }
    }
}
