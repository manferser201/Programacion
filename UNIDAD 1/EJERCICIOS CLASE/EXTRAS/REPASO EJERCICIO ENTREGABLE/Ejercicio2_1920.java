package com.company;

import java.util.Scanner;

public class Ejercicio2_1920 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, num_capicua = 0;

        System.out.println("INTRODUCE UN NÚMERO");
        num = teclado.nextInt();

        int resultado = num;
        while (resultado > 0){
            num_capicua = (num_capicua * 10) + (resultado % 10);
            resultado = resultado / 10;
        }

        if (num_capicua == num){
            System.out.println(num + " ES CAPICUA");
        } else {
            System.out.println(num + " NO ES CAPICUA");
        }
    }
}
