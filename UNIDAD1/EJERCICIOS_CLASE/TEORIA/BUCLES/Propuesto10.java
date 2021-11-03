package com.company;
import java.util.Scanner;

public class Propuesto10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        byte num;
        int num_tabla;

        System.out.println("INTRODUCE EL NÚMERO AL QUE LE QUIERA HACER LA TABLA DE MULTIPLICAR");
        num_tabla = teclado.nextInt();

        num = 0;
        do {
            System.out.println(num_tabla * num);
            num++;

        } while (num <= 10);


    }
}
