package com.company;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char simbolo;
        int altura, huecos, num_simbolos, i, j, x;

        System.out.println("INTRODUCE LA ALTURA DE LA PIRÁMIDE");
        altura = teclado.nextInt();
        teclado.nextLine();

        System.out.println("INTRODUCE EL SÍMBOLO PARA DIBUJAR LA PIRÁMIDE");
        simbolo = teclado.next().charAt(0);

        huecos = altura - 1;
        num_simbolos = 1;

        for (i = 0; i < altura; i++){
            for (j = 0; j < huecos; j++){
                System.out.print("-");
            }

            for (x = 0; x < num_simbolos; x++){
                System.out.print(simbolo);
            }

            System.out.println();

            huecos--;
            num_simbolos += 2;
        }
    }
}
