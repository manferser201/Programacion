package com.company;
import java.util.Scanner;

/* Escribir una función que decida si dos números enteros positivos son amigos.
Dos números son amigos si la suma de los divisores propios (distinto de él mismo) del primer número
es igual al segundo número, y viceversa. Ejemplos: (220 - 284), (1184 - 1210)
 */

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2;

        System.out.println("INTRODUCE DOS NÚMEROS");
        num1 = teclado.nextInt();
        num2 = teclado.nextInt();

        if (numerosAmigos(num1, num2)){
            System.out.println(num1 + " Y " + num2 + " SON AMIGOS");
        } else {
            System.out.println(num1 + " Y " + num2 + " NO SON AMIGOS");
        }


    }

    public static boolean numerosAmigos (int a, int b){
        boolean sonAmigos = false;
        int sumaDivisoresA = 0;
        int sumaDivisoresB = 0;

        for (int i = 1; i < a; i++) {
            if (a % i == 0){
                sumaDivisoresA = sumaDivisoresA + i;
            }
        }

        for (int i = 1; i < b; i++) {
            if (b % i == 0){
                sumaDivisoresB = sumaDivisoresB + i;
            }
        }

        if (sumaDivisoresA == b && sumaDivisoresB == a){
            sonAmigos = true;
        }

        return sonAmigos;
    }

}
