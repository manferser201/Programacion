package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4_Examen2021_Mañana_Azul {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int filas, columnas;
        int posicion;

        System.out.println("INTRODUCE EL NÚMERO DE COLUMNAS DEL ARRAY");
        columnas = teclado.nextInt();

        System.out.println("INTRODUCE EL NÚMERO DE FILAS DEL ARRAY");
        filas = teclado.nextInt();

        int[][] numeros = new int[filas][columnas];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = (int)(Math.random() * 101 + 10);
            }
        }

        for (int[] row:numeros) {
            System.out.println(Arrays.toString(row));
        }

        do {
            System.out.println("INTRODUCE LA POSICIÓN QUE QUIERA BUSCAR. (PARA SALIR PONGA -1)");
            teclado.nextLine();
            posicion = teclado.nextInt();

            if (posicion != -1){
                System.out.println(nEsimo(numeros, posicion));
            }

        } while(posicion != -1);

    }

    public static int nEsimo(int[][] n, int posicion){

        int puntero = 0, puntero2 = -1;


        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                puntero2++;
            }
        }


        if (posicion <= puntero2){
            while (puntero <= posicion){
                for (int i = 0; i < n.length; i++) {
                    for (int j = 0; j < n[i].length; j++) {
                        if (puntero == posicion){
                            return n[i][j];
                        }
                        puntero++;
                    }
                }
            }
        }

        return -1;
    }
}
