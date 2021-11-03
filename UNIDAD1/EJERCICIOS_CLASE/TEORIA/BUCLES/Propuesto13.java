package com.company;
import java.util.Scanner;

public class Propuesto13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        byte altura, anchura, columna, fila;

        System.out.println("INTRODUCE LA ALTURA DEL CUADRADO");
        altura = teclado.nextByte();

        System.out.println("INTRODUCE LA ANCHURA DEL CUADRADO");
        anchura = teclado.nextByte();

        fila =0;
        do {
            if (fila == 0 || fila == altura - 1) {
                columna = 0;
                do {
                    System.out.print("*");
                    columna++;

                } while (columna < anchura);
                System.out.println();

            } else {
                System.out.print("*");
                columna = 0;
                do {
                    System.out.print("-");
                    columna++;

                } while (columna < anchura - 2);
                System.out.println("*");
            }
            fila++;
        } while (fila < altura);

    }



}
