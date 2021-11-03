package com.company;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int altura, ancho, i, j, x;

        System.out.println("INTRODUCE LA ALTURA DE LA L");
        altura = teclado.nextInt();
        ancho = altura / 2 + 1;

        for (i = 1; i <= altura; i++){
            for (j = 1; j < i; j++){
                if (j == 1){
                    System.out.println("*");
                }
                if (j == altura - 1){
                    for (x = 0; x < ancho; x++){
                        System.out.print("* ");
                    }
                }

            }

        }

    }

}

