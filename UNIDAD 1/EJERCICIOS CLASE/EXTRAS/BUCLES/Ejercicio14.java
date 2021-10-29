package com.company;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        byte altura, anchura, i, j;

        System.out.println("INTRODUCE EL NÚMERO DE FILAS DE LA PIRÁMIDE");
        altura = teclado.nextByte();

        anchura = altura;

        for (i = 0; i < altura; i++){
            for (j = 0; j < anchura ; j++) {
                System.out.print("*");
            }
            System.out.println();
            anchura--;
        }

    }
}
