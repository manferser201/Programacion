package com.company;
import java.util.Scanner;

// Calcular el factorial de n recursivamente. Recordar que por definición, el factorial de 0 es 1.

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;

        System.out.println("INTRODUCE UN NÚMERO");
        num = teclado.nextInt();

        System.out.println("EL FACTORIAL DE " + num + " ES: " + factorial(num));

    }

    public static int factorial (int a){
        int resultado = 1;

        if (a > 0) {
            resultado = a * factorial(a - 1);
        }

        return resultado;
    }
}
