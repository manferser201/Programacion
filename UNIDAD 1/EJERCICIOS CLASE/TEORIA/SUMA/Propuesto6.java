package com.company;
import java.util.Scanner;

/*Crea un programa que pida al usuario una longitud en millas (por ejemplo, 3)
  y calcule su equivalencia en metros (1 milla = 1609 m).  */

public class Propuesto6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;

        System.out.println("INTRODUCE LAS MILLAS QUE QUIERAS TRANSFORMAR A METROS");
        num1 = teclado.nextInt();

        System.out.println(num1 + " MILLAS SON " + (num1 * 1609) + "METROS");
    }
}
