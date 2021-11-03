package com.company;
import java.util.Scanner;

/* Crea un programa que pida al usuario y diga si ese número es múltiplo de 3
(pista: puedes utilizar la operación "módulo", el "resto de la división": %) */

public class Propuesto5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;

        System.out.println("INTRODUZCA UN NUMERO");
        num = teclado.nextInt();

        if (num % 3 == 0){
            System.out.println(num + " ES MULTIPLO DE 3");
        } else {
            System.out.println(num + " NO ES MULTIPLO DE 3");
        }
    }
}
