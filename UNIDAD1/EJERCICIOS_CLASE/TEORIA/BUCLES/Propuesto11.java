package com.company;
import java.util.Scanner;

public class Propuesto11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2, suma;

        do {
            System.out.println("INTRODUCE DOS NUMERO QUE QUIERA SUMAR");
            num1 = teclado.nextInt();
            num2 = teclado.nextInt();
            suma = num1 + num2;

            System.out.println("LA SUMA DE ESTOS NÚMEROS ES: " + suma);

        } while (suma != 0 && (num1 != 0 || num2 != 0));
    }
}
