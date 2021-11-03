package com.company;
import java.util.Scanner;

// Crea un programa que pida tres números enteros largos al usuario y diga cuál es el mayor de los tres.

public class Propuesto8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        long num1, num2, num3;

        System.out.println("INTRODUZCA TRES NUMEROS");
        num1 = teclado.nextLong();
        num2 = teclado.nextLong();
        num3 = teclado.nextLong();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " ES EL MÁS GRANDE DE LOS TRES");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " ES EL MÁS GRANDE DE LOS TRES");
        } else if (num1 == num2 && num1 > num3) {
            System.out.println(num1 + " ES EL MÁS GRANDE DE LOS TRES");
        } else if (num2 == num3 && num2 > num1) {
            System.out.println(num2 + " ES EL MÁS GRANDE DE LOS TRES");
        } else {
            System.out.println(num3 + " ES EL MÁS GRANDE DE LOS TRES");
        }
    }
}
