package com.company;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i;

        for (i = 1; i < 100; i++){
            if(i % 7 == 0 ){
                System.out.println(i);
            }
        }


    }
}
