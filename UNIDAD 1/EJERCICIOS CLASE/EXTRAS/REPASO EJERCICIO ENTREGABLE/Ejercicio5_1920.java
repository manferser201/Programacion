package com.company;
import java.util.Scanner;

public class Ejercicio5_1920 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Integer altura, i, j, espacios_blancos, num_relleno = 1, posicion_cadena = 0;
        String cadena;

        System.out.println("INTRODUCE LA CADENA PARA EL ROMBO");
        cadena = teclado.nextLine();

        altura = cadena.length();
        espacios_blancos = (altura - 1);

        for (i = 0; i < altura * 2 - 1; i++) {
            for (j = 0; j < espacios_blancos; j++) {
                System.out.print("-");
            }

            for (j = 0; j < num_relleno; j++){
                posicion_cadena = 0;
                System.out.print(cadena.charAt(posicion_cadena));
                if (j <= (num_relleno - 1) / 2) {
                    posicion_cadena++;
                } else {
                    posicion_cadena--;
                }

            }

            for (j = 0; j < espacios_blancos; j++){
                System.out.print("-");
            }

            System.out.println();

            if (i >= altura - 1){
                espacios_blancos ++;
                num_relleno -= 2;
            } else {
                espacios_blancos --;
                num_relleno += 2;
            }
        }

    }
}
