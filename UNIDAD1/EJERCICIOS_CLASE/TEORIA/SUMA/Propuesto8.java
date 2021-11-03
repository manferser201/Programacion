package com.company;
import java.util.Scanner;

//Crea un programa que pregunte al usuario la base y la altura de un triángulo y muestre su superficie (S = B*A/2).

public class Propuesto8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int base, altura;

        System.out.println("INTRODUCE LA BASE");
        base = teclado.nextInt();
        System.out.println("INTRODUCE LA ALTURA");
        altura = teclado.nextInt();
        System.out.println("LA SUPERFICIE DEL TRIANGULO ES: " + ((base * altura) / 2));
    }
}
