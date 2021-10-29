package com.company;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int secreto = (int)(Math.random() * 100 + 1);
        int respuesta;

        do {
            System.out.println("INTRODUCE EL NÚMERO");
            respuesta = teclado.nextInt();

            System.out.println();
            if (secreto > respuesta){
                System.out.println("ES NÚMERO A DESCUBRIR ES MAYOR");
            } else if (secreto < respuesta){
                System.out.println("EL NÚMERO A DESCUBRIR ES MENOR");
            } else{
                System.out.println("LO HAS ADIVINADO");
                break;
            }
        } while (true);

    }
}
