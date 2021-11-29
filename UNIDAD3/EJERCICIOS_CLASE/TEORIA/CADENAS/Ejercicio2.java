package com.company;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String palabra, oracion = "";

        do {
            System.out.println("INTRODUZCA UNA PALABRA PARA LA FRASE");
            palabra = teclado.nextLine();

            if (!palabra.equalsIgnoreCase("fin")){
                oracion = oracion + " " + palabra;
            }

        } while (!palabra.equalsIgnoreCase("fin"));

        System.out.println(oracion);
    }
}
