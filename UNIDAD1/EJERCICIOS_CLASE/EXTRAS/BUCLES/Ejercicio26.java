package com.company;

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int filas, columnas, i, j, x;

        do {
            System.out.println("INTRODUCE LA ALTURA DE LA X");
            filas = teclado.nextInt();

        } while (filas % 2 == 0 || filas < 3);

        columnas = filas;

        for (i = 0; i < filas; i++){
          for (j = 0; j < filas; j++){
              if (i == j || i + j == filas - 1){
                  System.out.print("*");
              } else {
                  System.out.print("-");
              }

          }
          System.out.println();

        }
    }
}
