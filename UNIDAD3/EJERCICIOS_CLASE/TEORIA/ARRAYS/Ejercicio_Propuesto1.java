package com.company;
import java.util.Scanner;

/*
Crea un programa que pida al usuario 5 números reales, que guardará en un array. Luego calculará y mostrará
su media (la suma de todos los datos, dividida entre la cantidad de datos) y los valores que están
por encima de la media.
 */

public class Ejercicio_Propuesto1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double[] a = new double[5];
        int num_introducidos = 0, suma = 0;
        double media;
        String mayorMedia = "";

        for (int i = 1; i <= a.length; i++) {
            System.out.println("INTRODUCE EL DATO " + i + " DEL ARRAY");
            a[i-1] = teclado.nextDouble();

            suma += a[i-1];
        }

        media = (double) suma / a.length;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > media){
                mayorMedia = mayorMedia + " - " + a[i];
            }
        }

        System.out.println("LA MEDIA DE LOS NÚMEROS INTRODUCIDOS ES: " + media);
        System.out.println("LA NÚMEROS SUPERIORES A LA MEDIA SON: " + mayorMedia);

    }
}
