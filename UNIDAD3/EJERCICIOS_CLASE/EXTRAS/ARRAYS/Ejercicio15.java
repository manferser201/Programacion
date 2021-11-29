package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[][] vector = new int[10][10];
        int mayor = 0, menor = 301, suma = 0;

        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[i].length; j++) {
                vector[i][j] = (int)(Math.random() * 101 + 200);

                if (i == j){
                    if (vector[i][j] > mayor){
                        mayor = vector[i][j];
                    } else if (vector[i][j] < menor){
                        menor = vector[i][j];
                    }
                    suma += vector[i][j];
                }
            }

            System.out.println(Arrays.toString(vector[i]));

        }

        System.out.println("EL NÚMERO MAYOR DE LA DIAGONAL ES: " + mayor);
        System.out.println("EL NÚMERO MENOR DE LA DIAGONAL ES: " + menor);
        System.out.println("LA MEDIA DE LA SUMA DE LOS NÚMEROS DE LA DIAGONAL ES: " + (double)(suma / vector.length));

    }
}
