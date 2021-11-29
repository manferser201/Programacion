package com.company;
import java.util.Scanner;

//Diseñar una función que reciba como parámetros dos números enteros y que devuelva el mayor de los dos.

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2;

        System.out.println("INTRODUCE DOS NÚMEROS");
        num1 = teclado.nextInt();
        num2 = teclado.nextInt();

        System.out.println("EL NÚMERO MAYOR ES " + mayor(num1, num2));
    }

    public static int mayor (int a, int b){
        if (a > b){
            return a;
        }
        return b;
    }
}
