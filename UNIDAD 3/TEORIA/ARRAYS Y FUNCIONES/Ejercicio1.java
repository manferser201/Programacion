package com.company;
import java.util.Scanner;


// Diseñar una función eco() a la que se le pasa como parámetro un número n, y
// muestra por pantalla n veces el mensaje "Eco..."


public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;

        do {
            System.out.println("INTRODUCE UN NUMERO MAYOR QUE 0");
            n = teclado.nextInt();

        } while (n <= 0);

        eco(n);
    }

    public static void eco (int n){

        for (int i = 0; i < n; i++) {
            System.out.println("eco");
        }
    }
}
