package com.company;
import java.util.Scanner;

/* Crea un programa que pida un número entero al usuario y dé a una variable par el valor 1 si ese número
es par o el valor 0 si no es par.*/

public class PropuestoOperadorCondicional1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, par;

        System.out.println("INTRODUZCA UN NÚMERO");
        num = teclado.nextInt();

        par = num % 2 == 0 ? 1 : 0;

        System.out.println("VALE... " + par);
    }
}
