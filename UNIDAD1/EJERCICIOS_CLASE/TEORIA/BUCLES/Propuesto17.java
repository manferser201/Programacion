package com.company;

import java.util.Scanner;

public class Propuesto17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num_max, x;

        System.out.println("INTRODUCE LA CIFRA MÁXIMA");
        num_max = teclado.nextInt();

        for(x=1; x <= num_max; x++){
            if (x % 6 == 0)
            System.out.println(x + " ES MÚLTIPLO DE 6");
        }
    }
}
