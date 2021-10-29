package com.company;

import java.util.Scanner;

public class Propuesto19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        byte alto, ancho, x, columna, y;

        System.out.println("INTRODUZCA EL ALTO DEL CUADRADO");
        alto = teclado.nextByte();

        System.out.println("INTRODUZCA EL ANCHO DEL CUADRADO");
        ancho = teclado.nextByte();

        for (x=0; x < alto; x++){
            for (y=0; y < ancho; y++){
                System.out.print("* ");

            }
            System.out.println();


        }

    }
}
