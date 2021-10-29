package com.company;

import java.util.Scanner;

public class Propuesto3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        byte x;
        int num;

        System.out.println("INTRODUCE EL NÚMERO DEL QUE QUERA HACER LA Tbl DE MULTIPLICAR");
        num = teclado.nextInt();

        x = 0;

        while (x <=10){
            System.out.println(num * x);

            x++;
        }
    }
}
