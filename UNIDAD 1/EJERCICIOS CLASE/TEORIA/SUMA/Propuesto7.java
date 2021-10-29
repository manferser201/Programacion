package com.company;
import java.util.Scanner;

/*Crea un programa que pida al usuario una temperatura en grados centígrados y calcule (y muestre)
 a cuántos grados Fahrenheit equivalen (F = 9*C/5 + 32). */

public class Propuesto7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int grados;

        System.out.println("INTRODUCE LOS GRADOS QUE QUIERAS PASAR A FAHRENHEIT");
        grados = teclado.nextInt();

        System.out.println(grados + " GRADOS SON " + ((9*grados/5)+32) + " FAHRENHEIT");
    }
}
