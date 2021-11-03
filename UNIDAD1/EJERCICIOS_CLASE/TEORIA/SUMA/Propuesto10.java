package com.company;
import java.util.Scanner;

/*Crea un programa que pida al usuario su año de nacimiento y el año actual
(suando datos de tipo short) y halle la diferencia de ambos para obtener su edad. */

public class Propuesto10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        short nacimiento, actual;

        System.out.println("INTRODUCE TU AÑO DE NACIMIENTO");
        nacimiento = teclado.nextShort();
        System.out.println("INTRODUCE EL AÑO ACTUAL");
        actual = teclado.nextShort();

        System.out.println("TU EDAD ES: " + (actual - nacimiento));
    }
}
