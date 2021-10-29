package com.company;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double num;

        System.out.println("INTRODUZCA UN NÚMERO");
        num = teclado.nextDouble();

        if (num % 2 == 0 && num % 5 == 0){
            System.out.println("EL NÚMERO INTRODUCIDO ES PAR Y DIVISIBLE ENTRE 5");
        } else if (num % 2 == 0 && num % 5 != 0){
            System.out.println("EL NUMERO INTRODUCIDO ES PAR PERO NO DIVISIBLE ENTRE 5");
        } else if (num % 5 == 0 && num % 2 != 0){
            System.out.println("EL NÚMERO INTRODUCIDO ES DIVISIBLE ENTRE 5 PERO NO ES PAR");
        } else{
            System.out.println("EL NÚMERO NO ES DIVISIBLE NI POR 2 NI POR 5");
        }
    }
}
