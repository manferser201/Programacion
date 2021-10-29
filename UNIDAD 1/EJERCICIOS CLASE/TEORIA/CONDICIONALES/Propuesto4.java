package com.company;
import java.util.Scanner;

//Crea un programa que pida dos números reales al usuario y diga cuál es el mayor de ellos.

public class Propuesto4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float num1, num2;

        System.out.println("INTRODUCE UN NUMERO");
        num1 = teclado.nextFloat();
        System.out.println("INTRODUCE EL SEGUNDO NUMERO");
        num2 = teclado.nextFloat();

        if (num1 < num2){
            System.out.println(num2 + " ES MAYOR QUE " + num1);
        } else {
            System.out.println(num1 + " ES MAYOR QUE " + num2);
        }
    }
}
