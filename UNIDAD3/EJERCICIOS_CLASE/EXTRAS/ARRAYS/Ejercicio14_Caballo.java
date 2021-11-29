package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio14_Caballo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Character[] letras = {'a', 'b', 'c','d','e','f','g','h'};
        String[][] tablero = new String[8][8];
        String posicion;

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = "-";
            }
        }

        System.out.println("INTRODUCE LA POSICIÓN DEL CABALLO");
        posicion = teclado.nextLine();


        int fila = 8 - Integer.parseInt("" + posicion.charAt(1));
        int columna = obtenerColumnas(letras, posicion.charAt(0));

        tablero[fila][columna] = "C";

        int i = fila + 2;
        int j = columna - 1;

        if (estaDentro(i, j)){
            tablero[i][j] = "x";
            System.out.print(letras[j] + "" + (8 - i) + " ");
        }

        i = fila + 2;
        j = columna + 1;

        if (estaDentro(i, j)){
            tablero[i][j] = "x";
            System.out.print(letras[j] + "" + (8 - i) + " ");
        }

        i = fila - 2;
        j = columna - 1;

        if (estaDentro(i, j)){
            tablero[i][j] = "x";
            System.out.print(letras[j] + "" + (8 - i) + " ");
        }

        i = fila - 2;
        j = columna + 1;

        if (estaDentro(i, j)){
            tablero[i][j] = "x";
            System.out.print(letras[j] + "" + (8 - i) + " ");
        }

        i = fila + 1;
        j = columna - 2;

        if (estaDentro(i, j)){
            tablero[i][j] = "x";
            System.out.print(letras[j] + "" + (8 - i) + " ");
        }

        i = fila - 1;
        j = columna - 2;

        if (estaDentro(i, j)){
            tablero[i][j] = "x";
            System.out.print(letras[j] + "" + (8 - i) + " ");
        }

        i = fila + 1;
        j = columna + 2;

        if (estaDentro(i, j)){
            tablero[i][j] = "x";
            System.out.print(letras[j] + "" + (8 - i) + " ");
        }

        i = fila - 1;
        j = columna + 2;

        if (estaDentro(i, j)){
            tablero[i][j] = "x";
            System.out.print(letras[j] + "" + (8 - i) + " ");
        }

        System.out.println();

        for (String[] row : tablero) {
            System.out.println(Arrays.toString(row));
        }

    }

    public static int obtenerColumnas (Character[] letras, Character posicion){

        for (int i = 0; i < letras.length; i++) {
            if(letras[i] == posicion){
                return i;
            }
        }
        return -1;
    }

    public static boolean estaDentro (int i, int j){

        return (i >= 0 && i <= 7 && j >= 0 && j <= 7);
    }
}
