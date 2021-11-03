package com.company;

import java.util.Scanner;

public class Examen_mañana_azul__Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Integer altura, espacios_blancos, num_asteriscos;

        System.out.println("INTRODUZCA LA ALTURA DE LA FLECHA");
        altura = teclado.nextInt();

        espacios_blancos = (altura - 1) / 2;
        num_asteriscos = 1;

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < espacios_blancos; j++) {
                System.out.println("- ");
            }

            for (int j = 0; j < num_asteriscos; j++) {
                System.out.println("* ");
            }

            if (i >= (altura - 1) / 2){
                num_asteriscos--;
                espacios_blancos++;
                System.out.println("* * * * *");
            } else {
                num_asteriscos++;
                espacios_blancos--;
            }
        }
    }
}
