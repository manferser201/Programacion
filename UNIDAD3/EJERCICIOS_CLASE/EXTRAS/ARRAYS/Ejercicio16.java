package com.company;
import java.util.Arrays;

public class Ejercicio16 {
    public static void main(String[] args) {
        int[][] vector = new int[6][10];
        int posXMayor = 0, posYMayor = 0, posXMenor = 0, posYMenor = 0, menor = 1000, mayor = 0;

        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[i].length; j++) {
                vector[i][j] = (int)(Math.random() * 1001);

                if (vector[i][j] > mayor){
                    mayor = vector[i][j];
                    posXMayor = i;
                    posYMayor = j;
                } else if (vector[i][j] < menor){
                    menor = vector[i][j];
                    posXMenor = i;
                    posYMenor = j;
                }
            }

            System.out.println(Arrays.toString(vector[i]));

        }

        System.out.println("EL NÚMERO MAYOR SE ENCUENTRA EN LA FILA " + posXMayor + ", EN LA COLUMNA " + posYMayor + " Y ES EL NÚMERO: " + mayor);
        System.out.println("EL NÚMERO MENOR SE ENCUENTRA EN LA FILA " + posXMenor + ", EN LA COLUMNA " + posYMenor + " Y ES EL NÚMERO: " + menor);


    }
}
