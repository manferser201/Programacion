package com.company;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, i, fiboncci, anterioraA, anteriorB;

        anterioraA = 1;
        anteriorB = 0;

        System.out.println("INTRODUZCA UN NÚMERO");
        num = teclado.nextInt();

        for (i = 1; i <= num; i++){
            if (i == 0){
                System.out.print(i + ", ");
            } else if (i == 1) {
                System.out.print(i + ", ");
            } else{
                fiboncci = anterioraA + anteriorB;
                System.out.print(fiboncci + ", ");

                anteriorB = anterioraA;
                anterioraA = fiboncci;
            }
        }

    }
}
