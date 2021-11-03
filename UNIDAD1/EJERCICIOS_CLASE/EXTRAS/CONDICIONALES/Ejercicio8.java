package com.company;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double a, b, c;

        System.out.println("ESTE PROGRAMA REALIZA UNA ECUACIÓN DE SEGUNDO GRADO");
        System.out.println("INTRODUZCA EL VALOR DE a");
        a = teclado.nextDouble();
        System.out.println("INTRODUZCA EL VALOR DE b");
        b = teclado.nextDouble();
        System.out.println("INTRODUZCA EL VALOR DE c");
        c = teclado.nextDouble();

        if (a == 0) {
            System.out.println("LA ECUACIÓN NO TIENE SOLUCIÓN REAL");
        } else if (a ==1 && b == 1 && c == 3) {
            System.out.println("LA ECUACIÓN NO TIENE SOLUCIÓN REAL");
        } else {
            System.out.println("EL RESULTADO DE LA ECUACIÓN ES -> X1 = " + ((-b + Math.sqrt(b*b - 4 * a * c)) / 2 * a));
            System.out.println("EL RESULTADO DE LA ECUACIÓN ES -> X2 = " + ((-b - Math.sqrt(b*b - 4 * a * c)) / 2 * a));
        }
    }
}
