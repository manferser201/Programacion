package com.company;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float a,b;

        System.out.println("ESTE PROGRAMA REALIZA UNA ECUACIÓN DEL TIPO ax + b = 0");
        System.out.println("INTRODUZCA EL VALOR DE a");
        a = teclado.nextInt();
        System.out.println("INTRODUZCA EL VALOR DE b");
        b = teclado.nextInt();

        if (a == 0){
            System.out.println("LA ECUACIÓN NO TIENE SOLUCIÓN REAL");
        } else {
            System.out.println("EL RESULTADO DE LA ECUACIÓN ES -> X = " + (-b / a));
        }

    }
}
