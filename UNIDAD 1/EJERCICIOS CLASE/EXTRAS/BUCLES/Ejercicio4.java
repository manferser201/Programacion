package com.company;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, i;

        System.out.println("INTRODUCE UN NÚMERO");
        num = teclado.nextInt();

        for (i = 1; i <= num; i++){
            System.out.println(i);
        }

    }
}
