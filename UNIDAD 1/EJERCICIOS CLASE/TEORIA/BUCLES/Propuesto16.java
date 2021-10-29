package com.company;

import java.util.Scanner;

public class Propuesto16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, num_tabla;

        System.out.println("INTRODUCE EL NÚMERO DEL QUE QUIERA LA TABLA DE MULTIPLICAR");
        num_tabla = teclado.nextInt();

        for (num = 0; num <= 10; num++){
            System.out.println(num_tabla * num);
        }
    }
}
