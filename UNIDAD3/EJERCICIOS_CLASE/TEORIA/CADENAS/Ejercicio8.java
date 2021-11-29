package com.company;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String oracion, oracionTraducida = "";

        System.out.println("INTRODUZCA UNA ORACION");
        oracion = teclado.nextLine();

        if (oracion.substring(0, 16).equals("Javalín, javalón")){

            for (int i = 16; i < oracion.length(); i++) {
                oracionTraducida = oracionTraducida + oracion.charAt(i);
            }

            System.out.println(oracionTraducida.trim());

        } else if (oracion.substring(oracion.length() - 17, oracion.length()).equals("javalén, len, len")){
            for (int i = 0; i < oracion.length() - 17; i++) {
                oracionTraducida = oracionTraducida + oracion.charAt(i);
            }

            System.out.println(oracionTraducida.trim());

        } else {
            System.out.println("NO ESTÁ EN JAVALINÉS");
        }
    }
}
