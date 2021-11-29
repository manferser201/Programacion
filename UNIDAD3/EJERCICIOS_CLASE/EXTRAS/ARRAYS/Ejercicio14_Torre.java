package com.company;
import java.util.Arrays;
import java.util.Scanner;

// Torre

public class Ejercicio14_Torre {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Character[] letras = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        String[][] tablero = new String[8][8];
        String posicion;

        // RELLENA EL VECTOR DE GUIONES
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = "-";
            }
        }


        // PIDE LA POSICIÓN DE LA TORRE AL USUARIO
        System.out.println("INTRODUCE LA POSICIÓN DE LA TORRE");
        posicion = teclado.nextLine();


        // ESTABLEZCO LAS VARIABLES
        int fila = 8 - Integer.parseInt("" + posicion.charAt(1));
        int columna = obtenerColumnas(letras, posicion.charAt(0));


        // INTRODUCIMOS UNA A EN REPRESENTACIÓN DE DONDE ESTARÍA LA FIGURA
        tablero[fila][columna] = "T";


        // VERTICAL
        for (int i = 0; i < tablero.length; i++) {
            if (tablero[i][columna] != tablero[fila][columna]){
                tablero[i][columna] = "x";
                System.out.print(letras[columna] + "" + (8 - i) + " ");
            }
        }


        // HORIZONTAL
        for (int j = 0; j < tablero.length; j++) {
            if (tablero[fila][j] != tablero[fila][columna]){
                tablero[fila][j] = "x";
                System.out.print(letras[j] + "" + (8 - fila) + " ");
            }
        }

        System.out.println();


        // RECORREMOS Y MOSTRAMOS POR PANTALLA
        for (String[] row : tablero) {
            System.out.println(Arrays.toString(row));
        }

    }


    // FUNCIÓN QUE DEVUELVE EL VALOR NUMÉRICO DE LA LETRA DE LA POSICIÓN DE LA FIGURA (A = 0, B = 1, ...)
    public static int obtenerColumnas (Character[] letras, Character posicion){

        for (int i = 0; i < letras.length; i++) {
            if (letras[i] == posicion){
                return i;
            }
        }
        return -1;
    }
}
