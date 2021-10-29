package com.company;
import java.util.Scanner;

//Diseñar una  función a la que se le pasen dos enteros y muestre todos los números comprendidos entre ellos.

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a, b;

        System.out.println("INTRODUCE DOS NÚMEROS");
        a = teclado.nextInt();
        b = teclado.nextInt();

        relleno(a,b);
    }

    public static void relleno(int a, int b){
        int aux;

        if (a > b){
            aux = a;
            a = b;
            b = aux;
        }

        for (int i = a + 1; i < b; i++) {
            System.out.println(i);
        }
    }
}
