package com.company;
import java.util.Scanner;

public class Ejercicio4_1920 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Integer altura, i, j, espacios_blanco;

        do {
            System.out.println("INTRODUCE LA ALTURA DE LA FLECHA DOBLE");
            altura = teclado.nextInt();

        } while (altura % 2 == 0 || altura < 3);

        espacios_blanco = (altura - 1) / 2;

        for (i = 0; i < altura; i++) {
            for (j = 0; j < espacios_blanco; j++){
                System.out.print("- ");
            }

            System.out.println("*           *");

            if (i >= (altura - 1) / 2){
                espacios_blanco ++;
            } else {
                espacios_blanco --;
            }

        }
    }
}
