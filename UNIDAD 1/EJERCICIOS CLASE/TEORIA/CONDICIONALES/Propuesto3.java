package com.company;
import java.util.Scanner;

/* Crea un programa que pida un número entero al usuario y diga si es positivo (mayor que cero), si es negativo (menor que cero)
o si, por el contrario, es exactamente 0 (necesitarás enlazar 2 "if" uno tras otro). */

public class Propuesto3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        float num;

        System.out.println("INTRODUZCA UN NUMERO");
        num = teclado.nextFloat();

        if (num >0){
            System.out.println("EL NUMERO ES POSITIVO");
        } if (num < 0) {
            System.out.println("EL NUMERO ES MENOR DE CERO");
        } else {
            System.out.println("EL NUMERO ES CERO");
        }
    }
}
