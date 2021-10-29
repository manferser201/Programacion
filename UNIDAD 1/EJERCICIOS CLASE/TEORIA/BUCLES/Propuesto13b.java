package com.company;
import java.util.Scanner;

public class Propuesto13b {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        byte altura, fila, anchura, columna;

        System.out.println("INTRODUCE LA ALTURA QUE QUIERAS");
        altura = teclado.nextByte();

        anchura = 1;
        fila = 0;
        columna = 0;

        do {
            columna = 0;
            do {
                System.out.print("*");
                columna++;

            } while(columna < anchura);
            System.out.println();
            anchura++;

            fila++;

        } while (anchura < altura);

    }
}
