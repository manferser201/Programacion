package com.company;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cantidadDatos;
        boolean igual = true;

        System.out.println("¿CUÁNTOS DATOS QUIERE INTRODUCIR?");
        cantidadDatos = teclado.nextInt();

        int[] secreto = new int[cantidadDatos];
        int[] intento = new int[cantidadDatos];

        for (int i = 0; i < secreto.length; i++) {
            secreto[i] = (int) (Math.random() * 5 + 1);
        }

        System.out.println("EL SECRETO TIENE UNA LONGITUD DE " + cantidadDatos + " CARACTERES");

        do {
                igual = true;

                for (int i = 1; i <= secreto.length; i++) {
                    System.out.println("introduce la cifra " + i + " de tu intento");
                    intento[i-1] = teclado.nextInt();
                }

                for (int i = 0; i < secreto.length; i++) {
                    if (intento[i] > secreto[i]){
                        System.out.println(intento[i] + " es más grande");
                        igual = false;
                    } else if (intento[i] < secreto[i]){
                        System.out.println(intento[i] + " es más pequeño");
                        igual = false;
                    } else {
                        System.out.println(intento[i] + " es igual");
                    }
                }

        } while (!igual);

        System.out.println("¡ENHORABUENA, HAS ACERTADO!");

    }
}
