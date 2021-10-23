package com.company;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2, veces_repetidas = 0, num;
        String posicion = "";


        System.out.println("INTRODUZCA UN NÚMERO");
        num1 = teclado.nextInt();


        System.out.println("INTRODUZCA UNA CIFRA");
        num2 = teclado.nextInt();

        for (int i = 0; i < num1 ; i++) {
            while (num1 > 0){
                if (num1 % 10 == num2){
                    veces_repetidas++;
                    posicion = i + " " + posicion;
                }

                num1 /= 10;
            }
        }


        if (veces_repetidas != 0){
            System.out.println("RESULTADO:");
            System.out.println(veces_repetidas + " OCURRENCIAS");
            System.out.println("POSICIONES: " + posicion);

        } else {
            System.out.println("RESULTADO:");
            System.out.println(veces_repetidas + " OCURRENCIAS");
            System.out.println("POSICIONES: NINGUNA");
        }
    }
}
