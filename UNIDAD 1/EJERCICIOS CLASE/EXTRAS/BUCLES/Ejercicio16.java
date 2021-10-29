package com.company;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int combinacion, num, i;

        combinacion = (int)(Math.random() * 1001);
        System.out.println(combinacion);

        for (i = 0; i < 4; i++){
            System.out.println("INTRODUCE LAS 4 CIFRAS DE LA COMBINACIÓN");
            num = teclado.nextInt();

            if (num == combinacion){
                System.out.println("LA CAJA FUERTE SE HA ABIERTO SATISFACTORIAMENTE");
            } else {
                System.out.println("LO SIENTO, ESA NO ES LA COMBINACIÓN");
                System.out.println("LE QUEDAN " + (3 - i) + " INTENTOS");
            }
        }

        System.out.println("LO SIENTO, SE HA QUEDADO SIN INTENTOS");

    }
}
