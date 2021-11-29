package com.company;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String oracion;

        System.out.println("INTRODUZCA UNA ORACION");
        oracion = teclado.nextLine();

        if (oracion.charAt(oracion.length()/2 - 1) == ' '){
            System.out.println("ES CARACTER DE LA MITAD ES UN ESPACIO");
        } else {
            System.out.println("ES CARACTER DE LA MITAD NO ES UN ESPACIO");
        }
    }
}
