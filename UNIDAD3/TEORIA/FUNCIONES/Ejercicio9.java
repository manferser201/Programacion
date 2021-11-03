package com.company;
import java.util.Scanner;

/* Implementar la función divisoresPrimos() que muestra, por consola,
todos los divisores primos del número que se le pasa como parámetro
 */

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;

        System.out.println("INTRODUCE UN NÚMERO");
        num = teclado.nextInt();

        divisoresPrimos(num);
    }

    public static boolean primo (int num){
        boolean primo = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0){
                primo = false;
                break;
            }
        }
        return primo;
    }

    public static void divisoresPrimos (int num){

        for (int i = 1; i < num; i++) {
            if (num % i == 0 && primo(i)){
                System.out.println(i + " ES DIVISOR PRIMO DE " + num);
            }
        }
    }
}
