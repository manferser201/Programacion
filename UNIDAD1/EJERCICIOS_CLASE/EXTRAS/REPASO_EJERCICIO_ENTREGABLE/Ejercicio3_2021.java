package com.company;

import java.util.Scanner;

public class Ejercicio3_2021 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Integer num1, num2, num3, num_loteria, num_suerte = 0, num_desgracia = 0;

        System.out.println("INTRODUCE TUS TRES NÚMEROS DE LA SUERTE");
        num1 = teclado.nextInt();
        num2 = teclado.nextInt();
        num3 = teclado.nextInt();

        System.out.println("INTRODUCE EL NÚMERO DE LA LOTERÍA");
        num_loteria = teclado.nextInt();

        while (num_loteria > 0){
            if (num_loteria % 10 == num1 || num_loteria % 10 == num2 || num_loteria % 10 == num3){
                num_suerte++;
            } else {
                num_desgracia++;
            }
            num_loteria /= 10;
        }

        if (num_suerte > num_desgracia){
            System.out.println();
            System.out.println("ESE NÚMERO LE VA A DAR SUERTE");
        } else {
            System.out.println();
            System.out.println("ESE NÚMERO NO LE VA A DAR SUERTE");
        }
    }
}
