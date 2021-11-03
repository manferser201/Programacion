package com.company;
import java.util.Scanner;

//Crea un programa que calcule y muestre el producto de dos números enteros que introduzca el usuario.

public class Propuesto3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2;

        System.out.println("INTRODUCA EL PRIMER NUMERO");
        num1 = teclado.nextInt();
        System.out.println("INTRODUCA EL SEGUNDO NUMERO");
        num2 = teclado.nextInt();
        System.out.println("LA SUMA DE LOS NUMEROS INTRODUCIDOS ES: " + (num1 + num2));

    }
}
