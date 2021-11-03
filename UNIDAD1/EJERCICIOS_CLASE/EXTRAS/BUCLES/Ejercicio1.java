package com.company;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;

        do {
            System.out.println("INTRODUCE UN NÚMERO ENTERO");
            num = teclado.nextInt();

            if (num == 0){
                break;
            } else {
                if (num % 2 == 0) {
                    System.out.println(num + " ES PAR");
                } else {
                    System.out.println(num + " NO ES PAR");
                }

                if (num > 0) {
                    System.out.println(num + " ES POSITIVO");
                } else {
                    System.out.println(num + " ES NEGATIVO");
                }

                System.out.println("EL CUADRADO DE " + num + " ES: " + num * num);
            }

        } while (num != 0);
    }
}
