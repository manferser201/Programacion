package com.company;

import java.util.Scanner;

public class Propuesto23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        long num1, num2, x;

        System.out.println("INTRODUCE DOS NÚMEROS");
        num1 = teclado.nextLong();
        num2 = teclado.nextLong();

        for (x = 1; x >= num1 && x <= num2; x++){
            if (x % 2 == 0){

            } else {
                System.out.println(x);
            }
        }
    }
}
