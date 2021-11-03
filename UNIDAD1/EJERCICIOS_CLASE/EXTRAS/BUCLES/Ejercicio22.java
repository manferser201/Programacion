package com.company;

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, ultimo_numero, numero_nuevo, numero_reves,x;

        numero_nuevo = 0;

        System.out.println("INTRODUCE UN NÚMERO");
        num = teclado.nextInt();

        while (num % 10 != 0){
            ultimo_numero = num % 10;
            num = num / 10;
            numero_nuevo = (numero_nuevo * 10) + ultimo_numero;

        }

        System.out.println(numero_nuevo);

    }
}
