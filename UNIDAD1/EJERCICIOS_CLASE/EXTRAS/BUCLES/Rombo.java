package com.company;

import java.util.Scanner;

public class Rombo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Integer i, j, k, l, altura, espacios_blancos, num_asteriscos;

        System.out.println("INTRODUCE LA ALTURA DEL ROMBO");
        altura = teclado.nextInt();

        num_asteriscos = 1;
        espacios_blancos = altura - 1;

        for (i = 0; i < altura; i++) {
            if (i == altura - 1) {
                for (l = altura - 1; l < 1; l++) {
                    for (i = altura - 1; i < 1; i++) {
                        for (k = espacios_blancos; k < 1; k--) {
                            System.out.print("- ");
                        }
                        for (k = num_asteriscos; k < 1; k--) {
                            System.out.print("* ");
                        }
                        System.out.println();
                        num_asteriscos -= 2;
                        espacios_blancos++;
                    }
                }
            } else {
                for (k = 0; k < espacios_blancos; k++) {
                    System.out.print("- ");
                }

                for (j = 0; j < num_asteriscos; j++) {

                    System.out.print("* ");
                }
            }
            System.out.println();
            num_asteriscos += 2;
            espacios_blancos --;
        }
    }
}
