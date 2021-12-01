package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int longitudVector1, longitudVector2;

        System.out.println("INTRODUCE LA LONGITUD DEL PRIMER VECTOR");
        longitudVector1 = teclado.nextInt();

        System.out.println("INTRODUCE LA LONGITUD DEL SEGUNDO VECTOR");
        longitudVector2 = teclado.nextInt();

        int[] vector1 = new int[longitudVector1];
        int[] vector2 = new int[longitudVector2];

        for (int i = 0; i < vector1.length; i++) {
            System.out.println("INTRODUCE LOS VALORES DEL PRIMER VECTOR");
            vector1[i] = teclado.nextInt();
        }

        for (int i = 0; i < vector2.length; i++) {
            System.out.println("INTRODUCE LOS VALORES DEL SEGUNDO VECTOR");
            vector2[i] = teclado.nextInt();
        }

        System.out.println("LOS VALORES QUE SE REPITEN EN AMBOS VECTORES SON: " + Arrays.toString(interseccionVectores(vector1, vector2)));

    }

    public static int[] interseccionVectores (int[] vector1, int[] vector2){

        int[] solucion = new int[0];
        int min = 0, puntero = 0;

        for (int i = 0; i < vector1.length; i++) {
            for (int j = 0; j < vector2.length; j++) {
                if (vector1[i] == vector2[j]){
                    solucion = Arrays.copyOf(solucion, solucion.length + 1);
                    solucion[solucion.length - 1] = vector1[i];
                }
            }
        }

        Arrays.sort(solucion);

        return solucion;
    }

}
