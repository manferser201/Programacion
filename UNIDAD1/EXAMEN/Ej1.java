package com.company;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int altura, numRelleno = 1, numEspacios;

        do {
            System.out.println("INTRODUZCA LA ALTURA DEL ÁRBOL");
            altura = teclado.nextInt();
        } while (altura < 4);

        numEspacios = altura-3;

        for (int i = 0; i < altura; i++) {

            if (i == 0){
                for (int j = numEspacios; j > 0; j--) {
                    System.out.print(" ");
                }

                System.out.print("*");

            } else if (i == altura - 1){

                numEspacios = altura-3;

                for (int j = numEspacios; j > 0; j--) {
                    System.out.print(" ");
                }

                System.out.println("Y");

            } else {
                for (int j = numEspacios; j > 0; j--) {
                    System.out.print(" ");
                }

                for (int j = 0; j < numRelleno; j++) {
                    if (j == 0 || j == numRelleno - 1 || i == altura - 2) {
                        System.out.print("^");
                    } else {
                        System.out.print(" ");
                    }
                }
                numEspacios--;
                numRelleno += 2;
            }

            System.out.println();
        }


    }
}
