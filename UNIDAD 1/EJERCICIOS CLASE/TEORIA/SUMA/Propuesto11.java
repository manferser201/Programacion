package com.company;
import java.util.Scanner;

//Crea un programa que calcule y muestre la división de dos números reales de doble precisión introducidos por el usuario.

public class Propuesto11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double num1, num2;

        System.out.println("INTRODUCE EL PRIMER NUMERO");
        num1 = teclado.nextDouble();
        System.out.println("INTRODUCE EL SEGUNDO NUMERO");
        num2 = teclado.nextDouble();

        System.out.println("EL RESULTADO DE LA DIVISION ES: " + (num1 / num2));
    }
}
