package com.company;
import java.util.Arrays;
import java.util.Scanner;

/*
Crea un programa que cree un array de 5x5 caracteres, lo rellene con puntos en todas las posiciones excepto
aquellas en las que el número de fila es igual al número de columna, en las que pondrá un X.
 */

public class Ejercicio_Propuesto11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[][] figura = new String[5][5];

        for (int i = 0; i < figura.length; i++) {
            for (int j = 0; j < figura[i].length; j++) {
                if (i == j){
                    figura[1][j] = "X";
                    System.out.print("X");
                } else {
                    figura[i][j] = ".";
                    System.out.print(".");
                }
            }

            System.out.println();
        }
    }
}
