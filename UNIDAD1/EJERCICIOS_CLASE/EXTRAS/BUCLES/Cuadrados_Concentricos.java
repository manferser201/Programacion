package com.company;
import java.util.Scanner;

public class Cuadrados_Concentricos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int filas, i, j, x;

        do {
            System.out.println("INTRODUCE LA ALTURA DE LA X");
            filas = teclado.nextInt();

        } while (filas % 2 == 0 || filas < 3);

        //EL BUCLE DE FUERA RECORRE LAS FILAS
        for (i = 0; i < filas; i++){

            //EL BUCLE DE DENTRO RECORRE LAS COLUMNAS
            for (j = 0; j < filas; j++){

                //EN LA PRIMERA CONDICIÓN MOSTRAMOS LA DIAGONAL 1 PINTANDO SOLO LOS PARES
                if ((i == j && j % 2 == 0)

                        //EN LA SEGUNDA CONDICIÓN MOSTRAMOS LA DIAGONAL 2 PINTANDO SOLO LOS PARES
                        || (i + j == filas - 1 && i % 2 == 0)

                        //EN LA TERCERA CONDICIÓN PINTAMOS EL LADO SUPERIOR E INFERIOR DEL PRIMIER CUADRADO
                        || (i == 0 || i == filas - 1)

                        //EN LA CUARTA CONDICIÓN PINTAMOS EL LADO IZQUIERDO Y DERECHO DEL PRIMIER CUADRADO
                        || (j == 0 || j == filas - 1)

                        //EN LA QUINTA CONDICIÓN TERMINAMOS DE PINTAR EL CUADRADO PEQUEÑO
                        || (((i == (filas - 1) / 2 - 1) || (i == (filas - 1) / 2 && i != j)
                        || (i == (filas - 1) / 2 + 1)) && ((j == (filas - 1) / 2 - 1) || (j == (filas - 1) / 2)
                        || (j == (filas - 1) / 2 + 1)))

                        //EN LA SEXTA CONDICIC
                        ){

                    System.out.print("* ");
                } else {
                    System.out.print("- ");
                }

            }
            System.out.println();

        }
    }
}
