package com.company;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner tecldo = new Scanner(System.in);
        byte num;
        int i;

        System.out.println("INTRODUCE UN NÚMERO");
        num = tecldo.nextByte();

        System.out.println("NUMERO   CUADRADO   CUBO");

        for (i = num; i <= (num + 4); i++){
            System.out.print("   " + i + "       " + i * i + "        " + i * i * i);
            System.out.println();
        }




    }
}
