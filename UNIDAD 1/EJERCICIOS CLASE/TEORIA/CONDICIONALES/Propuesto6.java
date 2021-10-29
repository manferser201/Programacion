package com.company;
import java.util.Scanner;

//Crea un programa que diga si el número introducido por el usuario es impar o no lo es.

public class Propuesto6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;

        System.out.println("INTRODUCE UN NUMERO");
        num = teclado.nextInt();

        if (num % 2 == 0){
            System.out.println("EL NUMERO INTRODUCIDO ES PAR");
        } else {
            System.out.println("EL NUMERO INTRODUCIDO ES IMPAR");
        }
    }
}
