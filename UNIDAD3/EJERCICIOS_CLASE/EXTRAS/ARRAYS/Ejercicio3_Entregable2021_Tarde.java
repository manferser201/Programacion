package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3_Entregable2021_Tarde {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int filas, columnas;


        // PEDIMOS LOS DATOS AL USUARIO
        System.out.println("INTRODUCE EL NÚMERO DE FILAS DEL ARRAY");
        filas = teclado.nextInt();

        System.out.println("INTRODUCE EL NÚMERO DE COLUMNAS DEL ARRAY");
        columnas = teclado.nextInt();


        // ESTABLECEMOS LOS ARRAYS
        int[][] cuadrado = new int[filas][columnas];
        int[][] cuadradoGirado = new int[columnas][filas];


        // RELLENAMOS EL ARRAY CUADRADO
        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = 0; j < cuadrado[i].length; j++) {
                int valor = (int)(Math.random() * 101 + 100);

                cuadrado[i][j] = valor;

        // RELLENAMOS EL ARRAY CUADRADOGIRADO
                cuadradoGirado[j][(cuadrado.length - 1) - i] = valor;
            }
        }


        // SACAMOS POR PANTALLA EL ARRAY CUADRADO (USANDO FOREACH)
        for (int[] row: cuadrado) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println();

        // MOSTRAMOS POR PANTALLA EL RESULTADO DEL EJERCICIO (EL ARRAY CUADRADOGIRADO)(USANDO FOREACH)
        for (int [] row: cuadradoGirado) {
            System.out.println(Arrays.toString(row));
        }

    }
}
