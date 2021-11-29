package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio14_Dama {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[][] tablero = new String[8][8];
        Character[] letras = {'a', 'b', 'c','d','e','f','g','h'};
        String posicion;

        // RELLENO EL VECTOR DE GUIONES
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = "-";
            }
        }

        // PIDO LA POSICIÓN DEL ALFIL AL USUARIO
        System.out.println("INTRODUCE LA POSICIÓN DEL ALFIL");
        posicion = teclado.nextLine();

        // ESTABLEZCO LAS VARIABLES EN RELACIÓN A LA POSICIÓN INTRODUCIDA POR EL USUARIO
        int columnas = obtenerColumnas(posicion.charAt(0), letras);
        int filas = 8 - Integer.parseInt("" + posicion.charAt(1));

        // INTRODUCIMOS UNA D EN REPRESENTACIÓN DE DONDE ESTARÍA LA FIGURA
        tablero[filas][columnas] = "D";

        // DIAGONAL SUPERIOR DERECHA
        int i = filas - 1;
        int j = columnas + 1;
        while (estaDentro(i,j)){
            tablero[i][j] = "x";
            System.out.print(letras[j] + "" + (8-i) + " ");
            i--;
            j++;
        }

        // DIAGONAL SUPERIOR IZQUIERDA
        i = filas - 1;
        j = columnas - 1;
        while (estaDentro(i,j)){
            tablero[i][j] = "x";
            System.out.print(letras[j] + "" + (8-i) + " ");
            i--;
            j--;
        }

        // DIAGONAL INFERIOR DERECHA
        i = filas + 1 ;
        j = columnas + 1;
        while (estaDentro(i,j)){
            tablero[i][j] = "x";
            System.out.print(letras[j] + "" + (8-i) + " ");
            i++;
            j++;
        }

        // DIAGONAL INFERIOR IZQUIERDA
        i = filas + 1;
        j = columnas - 1;
        while (estaDentro(i,j)){
            tablero[i][j] = "x";
            System.out.print(letras[j] + "" + (8-i) + " ");
            i++;
            j--;
        }

        for (i = 0; i < tablero.length; i++) {
            if (tablero[i][columnas] != tablero[filas][columnas]){
                tablero[i][columnas] = "x";
                System.out.print(letras[columnas] + "" + (8 - i) + " ");
            }
        }


        // HORIZONTAL
        for (j = 0; j < tablero.length; j++) {
            if (tablero[filas][j] != tablero[filas][columnas]){
                tablero[filas][j] = "x";
                System.out.print(letras[j] + "" + (8 - filas) + " ");
            }
        }

        System.out.println();

        // RECORRE EL VECTOR Y LO MUESTRA POR PANTALLA
        for (String[] row: tablero) {
            System.out.println(Arrays.toString(row));
        }

    }


    // FUNCIÓN QUE DEVUELVE EL VALOR NUMÉRICO DE LA LETRA DE LA POSICIÓN DE LA FIGURA (A = 0, B = 1, ...)
    public static int obtenerColumnas (Character c, Character[] letras){

        for (int i = 0; i < letras.length; i++) {
            if (letras[i] == c){
                return i;
            }
        }
        return -1;
    }


    //FUNCIÓN QUE NOS INDICA SI ESTÁ DENTRO DE LOS LÍMITES DEL VECTOR O NO
    public static boolean estaDentro (int i, int j){

        return (i >= 0 && i <= 7 && j >= 0 && j <= 7);
    }
}
