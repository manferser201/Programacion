package com.company;
import java.util.Scanner;

public class Propuesto21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        long num;
        int x;

        System.out.println("INTRODUCE UN NÚMERO");
        num = teclado.nextLong();

        for (x=1; x <= num; x++){
            if (num % x == 0){
                System.out.println(x + " es divisor de " + num);
            }
        }

    }
}
