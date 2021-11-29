package com.company;
import java.util.Scanner;

/* Realizar una función que calcule a elevado a n, donde a es real, y n entero no negativo.
Realizar una versión iterativa y otra recursiva.
 */

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float num1;
        int num2;

        System.out.println("INTRODUZCA UN NÚMERO");
        num1 = teclado.nextFloat();

        do {
            System.out.println("INTRODUCE LA ELEVACIÓN (NÚMERO ENTERO POSITIVO)");
            num2 = teclado.nextInt();

        } while (num2 < 0);

        System.out.println(num1 + " ELEVADO A " + num2 + " ES: " + elevado(num1, num2));
        System.out.println(num1 + " ELEVADO A " + num2 + " ES: " + elevado2(num1, num2));

    }

    public static double elevado(double num1, int num2){
        double resultado = 1;

        for (int i = 0; i < num2; i++) {
            resultado *= num1;
        }

        return resultado;
    }

    public static double elevado2(double num1, int num2){
        double resultado = 1;

        if (num2 > 0){
            resultado = num1 * elevado2(num1, num2 - 1);
        }

        return resultado;
    }
}
