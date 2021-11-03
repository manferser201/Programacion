package com.company;
import java.util.Scanner;

public class Propuesto4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;

        System.out.println("INTRODUZCA UN NÚMERO");
        num = teclado.nextInt();

        while (num != 0){
            System.out.println(num * num);

            System.out.println("INTRODUZCA UN NÚMERO");
            num = teclado.nextInt();
        }
    }
}
