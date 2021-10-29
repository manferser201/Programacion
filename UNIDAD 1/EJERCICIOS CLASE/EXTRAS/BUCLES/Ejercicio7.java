package com.company;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i, impar, num;
        num = 0;
        impar = 1;

        for (i = 1; i < 100; i++){
            if(i % 2 != 0){
                impar = impar * i;

                num++;
            }
             if (num ==10){
                 break;
             }
        }

        System.out.println("EL PRODUCTO DE LOS PRIMEROS " + num + " NUMEROS IMPARES ES " + impar);


    }
}