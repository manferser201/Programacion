package com.company;
import java.util.Scanner;

/* Crea un programa que pida dos números de tipo byte al usuario y cree a una variable "menor",
que tenga el valor del menor de esos dos números.*/

public class PropuestoOperadorCondicional2 {
        public static void main( String args[] ) {
            Scanner teclado = new Scanner(System.in);
            byte num1, num2, menor;

            System.out.println("INTRODUZCA DOS NÚMEROS");
            num1 = teclado.nextByte();
            num2 = teclado.nextByte();

            menor = num1 > num2 ? num2 : num1;

            System.out.println("EL MENOR ES " + menor);
        }
}
