package com.company;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String num1;
        int num, resultado;
        boolean primo = true;

        do {
            System.out.println("INTRODUCE UN NÚMERO");
            num1 = teclado.nextLine();

        } while (num1.length() % 2 != 0);

        num = new Integer(num1);

        while (num > 0){
            resultado = num % 100;

            for (int i = 2; i < resultado; i++) {
                if (resultado % i == 0){
                    primo = false;
                    break;
                }
            }
            num /= 100;

            if (primo){
                System.out.println(resultado + " ES PRIMO");
            } else {
                System.out.println(resultado + " NO ES PRIMO");
            }
        }


    }
}
