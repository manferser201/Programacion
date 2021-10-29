package com.company;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int altura1, altura_maxima, etiqueta, etiqueta_altura_maxima;
        altura_maxima = 0;
        etiqueta = 0;
        etiqueta_altura_maxima = 0;

        do {
            System.out.println("INTRODUCE LA ALTURA EN CENTÍMETROS DE LOS ÁRBOLES");
            altura1 = teclado.nextInt();

            if (altura1 < -1) {
                System.out.println("POR FAVOR INTRODUCE UNA ALTURA REAL");
            } else if (altura1 > altura_maxima){
                altura_maxima = altura1;
                etiqueta_altura_maxima = etiqueta;
            }

            etiqueta++;
        } while (altura1 != -1);

        System.out.println("EL ÁRBOL MÁS ALTO ES EL " + etiqueta_altura_maxima + " Y MIDE " + altura_maxima + " CENTÍMETROS");
    }
}
