package com.company;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("ESTE ES UN PROGRAMA QUE ORDENA DE MAYOR A MENOR TRES NÚMEROS");
        System.out.println("INTRODUCE TRES NÚMEROS ENTEROS");
        num1 = teclado.nextInt();
        num2 = teclado.nextInt();
        num3 = teclado.nextInt();

        if (num1 == num2 && num1 == num3) {
            System.out.println("LOS TRES NÚMEROS SON IGUALES");
        } else if (num1 == num2 || num2 == num3 || num1 == num3){
            System.out.println("HAY DOS NÚMEROS IGUALES");
        } else if (num1 > num2 && num1 > num3 && num2 > num3){
            System.out.println("LA SECUENCIA DE MAYOR A MENOR SERÍA: " + num1 + ", " + num2 + ", " + num3);
        } else if (num1 > num2 && num1 > num3 && num3 > num2){
            System.out.println("LA SECUENCIA DE MAYOR A MENOR SERÍA: " + num1 + ", " + num3 + ", " + num2);
        } else if (num2 > num1 && num2 > num3 && num1 > num3){
            System.out.println("LA SECUENCIA DE MAYOR A MENOR SERÍA: " + num2 + ", " + num1 + ", " + num3);
        } else if (num2 > num1 && num2 > num3 && num3 > num1){
            System.out.println("LA SECUENCIA DE MAYOR A MENOR SERÍA: " + num2 + ", " + num3 + ", " + num1);
        } else if (num3 > num1 && num3 > num2 && num1 > num2){
            System.out.println("LA SECUENCIA DE MAYOR A MENOR SERÍA: " + num3 + ", " + num1 + ", " + num2);
        } else {
            System.out.println("LA SECUANDIA DE MAYOR A MENOR SERÍA: " + num3 + ", " + num2 + ", " + num1);
        }
    }
}
