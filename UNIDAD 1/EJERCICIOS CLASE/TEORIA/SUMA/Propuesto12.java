package com.company;
import java.util.Scanner;

/*Crea un programa que pida al usuario una longitud en millas (por ejemplo, 3)
y calcule su equivalencia en kilómetros, usando datos de tipo float (1 milla = 1.609 km). */

public class Propuesto12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float num;

        System.out.println("INTRODUCE EL NUMERO DE MILLAS");
        num = teclado.nextFloat();

        System.out.println(num + " MILLAS SON " + (num * 1609) + " METROS");
    }
}
