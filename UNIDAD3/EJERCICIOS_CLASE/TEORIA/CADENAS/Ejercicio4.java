package com.company;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String frase;
        int numEspacios = 0;

        System.out.println("INTRODUCE UNA FRASE");
        frase = teclado.nextLine();

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' '){
                numEspacios++;
            }
        }

        System.out.println("LA FRASE " + frase + " TIENE "+ numEspacios + " NÚMERO DE ESPACIOS");
    }
}
