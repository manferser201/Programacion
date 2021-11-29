package com.company;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String palabra1, palabra2;

        System.out.println("INTRODUCE DOS PALABRAS");
        palabra1 = teclado.nextLine();
        palabra2 = teclado.nextLine();

        if (palabra1.length() > palabra2.length()){
            System.out.println("LA PALABRA MÁS LARGA ES: " + palabra1);
        } else if (palabra2.length() > palabra1.length()){
            System.out.println("LA PALABRA MÁS LARGA ES: " + palabra2);
        } else {
            System.out.println("LAS DOS PALABRAS SON IGUALES DE LARGAS");
        }

    }
}
