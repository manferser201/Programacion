package com.company;

import java.util.Scanner;

public class Propuesto18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, x;

        System.out.println("INTRODUZCA UNA CIFRA TOPE");
        num = teclado.nextInt();

        for (x=0; x <= num; x++){
            if (x % 3 == 0 && x % 7 == 0){
                System.out.println(x + " ES MÚLTIPLOS DE 3 Y 7");
            }
        }

    }
}
