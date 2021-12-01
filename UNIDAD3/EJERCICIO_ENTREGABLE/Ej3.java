package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int longitud, max = 17, min = 66, suma = 0, puntero = 0;

        System.out.println("INTRODUCE EL TAMAÑO DEL ARRAY");
        longitud = teclado.nextInt();

        int[][] vector = new int[longitud][longitud];
        int[] diagonal = new int[longitud];

        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[i].length; j++) {
                vector[i][j] = (int)(Math.random() * (65-18) + 18);

                if (i == j){

                    diagonal[i] = vector[i][j];

                    if (vector[i][j] < min){
                        min = vector[i][j];
                    }

                    if (vector[i][j] > max){
                        max = vector[i][j];
                    }

                    suma += vector[i][j];
                    puntero++;
                }
            }
            System.out.println(Arrays.toString(vector[i]));
        }

        double media = suma / puntero;

        System.out.println("LOS VALORES DE LA DIAGONAL DEL VECTOR SON: ");
        System.out.println(Arrays.toString(diagonal));
        System.out.println();
        System.out.println("EL VALOR MÍNIMO DE LA DIAGONAL ES: " + min);
        System.out.println("EL VALOR MÁXIMO DE LA DIAGONAL ES: " + max);
        System.out.println("EL VALOR MEDIO DE LA DIAGONAL ES: " + media);
    }
}
