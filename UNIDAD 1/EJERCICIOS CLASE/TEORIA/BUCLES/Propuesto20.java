package com.company;

import java.util.Scanner;

public class Propuesto20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        byte x, y, fila, columna, num;

        System.out.println("INTRODUZCA EL NÚMERO DE LA DIMENSION");
        num = teclado.nextByte();

        fila = 0;
        columna = 0;

        for (x = 0; x < num; x++){
            if (x == 0 || x == num - 1){
                for (y = 0; y < num; y++){
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for (y = 0; y < num - 2; y++){
                    System.out.print(" ");
                }
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
