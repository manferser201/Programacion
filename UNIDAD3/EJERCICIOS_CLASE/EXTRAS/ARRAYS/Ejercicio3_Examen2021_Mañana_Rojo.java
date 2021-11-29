package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3_Examen2021_Mañana_Rojo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] pais = {"España", "Rusia", "Japón", "Australia"};
        int[][] estatura = new int[4][10];
        int[] aux = new int[0];
        int media, maximo = 139, minimo = 211, suma = 0;

        for (int i = 0; i < estatura.length; i++) {
            for (int j = 0; j < estatura[i].length; j++) {
                estatura[i][j] = (int)(Math.random() * 71 + 140);
            }
        }

        for (int i = 0; i < estatura.length; i++) {
            System.out.print(pais[i] + ": ");

            for (int j = 0; j < estatura[i].length; j++) {
                System.out.print(estatura[i][j] + " ");
                suma += estatura[i][j];
                aux = Arrays.copyOf(aux, aux.length + 1);
                aux[aux.length - 1] = estatura[i][j];
            }

            System.out.print("| " + (suma / estatura[i].length));
            System.out.print("| " + mayor(aux, maximo));
            System.out.print("| " + menor(aux, minimo));
            System.out.println();

            suma = 0;
            aux = new int[0];

        }
    }

    public static int mayor (int[] estatura, int num){

        int max = num;

        for (int i = 0; i < estatura.length; i++) {
            if (estatura[i] > max){
                max = estatura[i];
            }
        }

        return max;
    }

    public static int menor (int[] estatura, int num){
        int min = num;

        for (int i = 0; i < estatura.length; i++) {
            if (estatura[i] < min){
                min = estatura[i];
            }
        }

        return min;
    }
}
