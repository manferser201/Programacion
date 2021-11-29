package com.company;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] vector = new int[100];
        byte destacado;
        int menor = 500, mayor = 0;

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random() * 501);
            System.out.print(vector[i] + " ");
        }

        System.out.println();
        System.out.println("¿QUÉ QUIERE DESTACAR? (1 - MÍNIMO / 2- MÁXIMO)");
        destacado = teclado.nextByte();

        if (destacado == 1){
            for (int i = 0; i < vector.length; i++) {
                if (vector[i] < menor){
                    menor = vector[i];
                }
            }

            for (int i = 0; i < vector.length; i++) {
                if (vector[i] == menor){
                    System.out.print(" **" + vector[i] + "** ");;
                } else {
                    System.out.print(vector[i] + " ");
                }
            }

        } else if (destacado == 2){
            for (int i = 0; i < vector.length; i++) {
                if (vector[i] > mayor){
                    mayor = vector[i];
                }
            }

            for (int i = 0; i < vector.length; i++) {
                if (vector[i] == mayor){
                    System.out.print(" **" + vector[i] + "** ");;
                } else {
                    System.out.print(vector[i] + " ");
                }
            }
        } else {
            System.out.println("NO SE HA INTRODUCIDO UN VALOR CORRECTO POT LO QUE NO SE HA DESTACADO NADA");
        }
    }
}
