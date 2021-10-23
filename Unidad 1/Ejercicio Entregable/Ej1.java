package com.company;

import java.util.Scanner;

public class Ej1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int altura, i, j;

        do {
            System.out.println("INTRODUZCA LA ALTURA DE LA Z");
            altura = teclado.nextInt();

        } while (altura % 2 == 0 || altura <3 );

        for (i = 0; i < altura; i++) {
            if (i == 0 || i == altura - 1){
                for (j = 0; j < altura; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("-");
            }

            for (j = 0; j < altura - 1; j++) {
                if (i + j == altura - 2){
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }



            System.out.println();

        }
    }
}
