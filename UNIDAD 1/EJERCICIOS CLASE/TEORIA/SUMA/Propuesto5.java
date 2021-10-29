package com.company;
import java.util.Scanner;

//Crea un programa que calcule y muestre el resto de la división de dos números enteros que introduzca el usuario.

public class Propuesto5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2;

        System.out.println("INTRODUZCA EL PRIMER NUMERO");
        num1 = teclado.nextInt();
        System.out.println("INTRODUZCA EL SEGUNDO NUMERO");
        num2 = teclado.nextInt();
        System.out.println("EL RESTO ES: " + (num1 % num2));
    }
}
