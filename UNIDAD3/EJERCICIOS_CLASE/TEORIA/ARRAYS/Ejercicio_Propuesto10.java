package com.company;
import java.util.Arrays;
import java.util.Scanner;

/*
Crea un programa que cree un array de 5x5 caracteres, lo rellene con puntos, excepto la segunda fila, que
estará rellena de letras "A" y luego muestra el contenido del array en pantalla.
 */

public class Ejercicio_Propuesto10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[][] figura = new String[5][5];

        for (int i = 0; i < figura.length; i++) {
            for (int j = 0; j < figura[i].length; j++) {
                if (i == 1){
                    figura[1][j] = "A";
                    System.out.print("A");
                } else {
                    figura[i][j] = ".";
                    System.out.print(".");
                }
            }

            System.out.println();
        }
    }
}
