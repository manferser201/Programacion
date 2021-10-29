package com.company;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        byte edad;
        int suma, num_edades, total_mayor_edad;
        double media;
        suma = 0;
        num_edades = 0;
        total_mayor_edad = 0;


        do {
            System.out.println("INTRODUCE UNA EDAD");
            edad = teclado.nextByte();

            if(edad < 0){
                break;
            } else {
                suma += edad;
                num_edades++;

                if (edad >= 18){
                    total_mayor_edad++;
                }
            }

        } while(edad >= 0);

        media = (double) suma / (double) num_edades;

        System.out.println("LA SUMA TOTAL DE LAS EDADES ES: " + suma);
        System.out.println("LA MEDIA DE LAS EDADES ES: " + media);
        System.out.println("HEMOS INTRODUCIDO " + num_edades + " EDADES");
        System.out.println("HAY " + total_mayor_edad + " ALUMNOS MAYORES DE EDAD");
    }
}
