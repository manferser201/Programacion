package com.company;
import java.util.Scanner;

public class Ejercicio2_2021 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Integer num, num_nuevo = 0, eliminados = 0;

        System.out.println("INTRODUCE UN NÚMERO ENTERO POSITIVO");
        num = teclado.nextInt();

        while (num > 0){
            if (num % 10 == 0 || num % 10 == 8){
                eliminados++;
            } else {
                num_nuevo = (num_nuevo * 10) + (num % 10);

            }
            num /= 10;
        }

        num = num_nuevo;
        num_nuevo = 0;

        while (num > 0){
            num_nuevo = (num_nuevo * 10) + (num % 10);
            num /= 10;
        }

        System.out.println("NÚMERO RESULTADO: " + num_nuevo);
        System.out.println("DÍGITOS ELIMINADOS: " + eliminados);
    }
}
