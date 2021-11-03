package com.company;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;

        System.out.println("INTRODUZCA UN NUMERO ENTERO");
        num = teclado.nextInt();

        System.out.println("LA ÚLTIMA CIFRA DE " + num + " ES " + num%10);

    }
}
