package com.company;
import java.util.Scanner;

/*
Si has estudiado lo que es un vector, crea un dos arrays de tres elementos, cada uno de los cuales
representará un vector de tres dimensiones. Pide al usuario los datos para ambos vectores, luego muéstralos
en la forma "(5, 7, -2)", después calcula (y muestra) su producto escalar y su producto vectorial.
 */

public class Ejercicio_Propuesto8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] vector1 = new double[3];
        double[] vector2 = new double[3];
        double productoEscalar;
        String productoVectorial = "";

        for (int i = 1; i <= vector1.length; i++) {
            System.out.println("INTRODUCE EL VALOR " + i + " DEL PRIMER VECTOR");
            vector1 [i-1] = teclado.nextDouble();

            System.out.println("INTRODUCE EL VALOR " + i + " DEL SEGUNDO VECTOR");
            vector1 [i-1] = teclado.nextDouble();
        }


        System.out.println("EL VECTOR 1 TIENE COMO COORDENADAS ");
        for (int i = 0; i < vector1.length; i++) {
            if (i == 0){
                System.out.print("(" + vector1[i] + ",");
            } else if (i == vector1.length-1){
                System.out.print(vector1[i] + ")");
            } else{
                System.out.println(vector1[i] + ", ");
            }
        }

        System.out.println("EL VECTOR 2 TIENE COMO COORDENADAS ");

        for (int i = 0; i < vector1.length; i++) {
            if (i == 0){
                System.out.print("(" + vector2[i] + ",");
            } else if (i == vector1.length-1){
                System.out.print(vector2[i] + ")");
            } else{
                System.out.println(vector2[i] + ", ");
            }
        }

        productoEscalar = vector1[0] * vector2[0] + vector1[1] * vector2[1] + vector1[2] * vector2[2];

        System.out.println("EL PRODUCTO ESCALAR DE LOS DOS VECTORES ES: " + productoEscalar);
    }
}
