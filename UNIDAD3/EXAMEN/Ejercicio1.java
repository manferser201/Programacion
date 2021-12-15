package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dimension1, dimension2;

        System.out.println("INTRODUCE LA DIMENSIÓN DEL VECTOR 1");
        dimension1 = teclado.nextInt();
        System.out.println("INTRODUCE LA DIMENSIÓN DEL VECTOR 2");
        dimension2 = teclado.nextInt();

        int[] vector1 = new int[dimension1];
        int[] vector2 = new int[dimension2];

        for (int i = 0; i < vector1.length; i++) {
            vector1[i] = (int)(Math.random() * 11);
        }

        for (int i = 0; i < vector2.length; i++) {
            vector2[i] = (int)(Math.random() * 11);
        }

        System.out.println("VECTOR 1: " + Arrays.toString(vector1));
        System.out.println("VECTOR 2: " + Arrays.toString(vector2));

        System.out.println();

        System.out.println("EL VECTOR MEDIA ES: " + Arrays.toString(mediaVectores(vector1, vector2)));
    }

    public static float[] mediaVectores (int[] vector1, int[] vector2){

        float[] solucion = new float[0];

        int puntero = 0;


        switch (vectorMayor(vector1, vector2)){
            case "mayor":
                while (puntero < vector1.length){

                if (puntero < vector2.length){
                    solucion = Arrays.copyOf(solucion, solucion.length + 1);
                    solucion[solucion.length - 1] = (float)(vector1[puntero] + vector2[puntero])/2;
                } else {
                    solucion = Arrays.copyOf(solucion, solucion.length + 1);
                    solucion[solucion.length - 1] = vector1[puntero];
                }

                puntero++;
                };
                break;
            case "menor":
                while (puntero < vector2.length){

                    if (puntero < vector1.length){
                        solucion = Arrays.copyOf(solucion, solucion.length + 1);
                        solucion[solucion.length - 1] = (float)(vector1[puntero] + vector2[puntero])/2;
                    } else {
                        solucion = Arrays.copyOf(solucion, solucion.length + 1);
                        solucion[solucion.length - 1] = vector2[puntero];
                    }

                    puntero++;
                };
                break;
            default:
                while (puntero < vector2.length){

                    if (puntero < vector1.length){
                        solucion = Arrays.copyOf(solucion, solucion.length + 1);
                        solucion[solucion.length - 1] = (float)(vector1[puntero] + vector2[puntero])/2;
                    }

                    puntero++;
                };
        }

        return solucion;
    }

    public static String vectorMayor (int[] vector1, int[] vector2){

        if (vector1.length > vector2.length){
            return "mayor";
        } else if (vector1.length < vector2.length) {
            return "menor";
        }

        return "igual";
    }
}
