package com.company;

import java.util.Scanner;

public class Propuesto7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, num_asteriscos;

        num_asteriscos = 0;

        System.out.println("INTRODUZCA EL NÚMERO DE ASTERISCOS QUE QUIERE MOSTRAR");
        num = teclado.nextInt();

        while (num_asteriscos < num){
            System.out.print("*");

            num_asteriscos++;
        }
    }
}
