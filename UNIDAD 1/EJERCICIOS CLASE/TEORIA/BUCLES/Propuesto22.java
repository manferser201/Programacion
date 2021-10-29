package com.company;

import java.util.Scanner;

public class Propuesto22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        long num, x;

        System.out.println("INTRODUZCA UN NÚMERO");
        num = teclado.nextLong();

        for (x = 2; x < num; x++){
            if (num % x == 0){
            } else {
                System.out.println("EL NÚMERO ES PRIMO");
            }
        }
    }
}
