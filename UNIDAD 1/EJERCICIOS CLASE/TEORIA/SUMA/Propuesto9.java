package com.company;
import java.util.Scanner;

//Crea un programa que calcule y muestre la suma de dos números de dos cifras (de tipo byte) que introduzca el usuario.

public class Propuesto9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        byte num1, num2;

        System.out.println("INTRODUCE EL PRIMER NUMERO");
        num1 = teclado.nextByte();
        System.out.println("INTRODUCE EL SEGUNDO NUMERO");
        num2 = teclado.nextByte();
        System.out.println("LA SUMA DE LOS NUMEROS ES: " + (num1 + num2));
    }
}
