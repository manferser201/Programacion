package com.company;
import java.util.Scanner;

//Crea un programa que calcule y muestre la división de dos números enteros introducidos por el usuario.

public class Propuesto4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2;

        System.out.println("INTRODUZCA EL PRIMER NUMERO");
        num1 = teclado.nextInt();
        System.out.println("INTRODUZCA EL SEGUNDO NUMERO");
        num2 = teclado.nextInt();
        System.out.println("LA DIVISION ES: " + (num1 / num2));
    }
}
