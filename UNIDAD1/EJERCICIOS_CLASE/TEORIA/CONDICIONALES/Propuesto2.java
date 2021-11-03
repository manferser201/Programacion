package com.company;
import java.util.Scanner;

//Crea un programa que pida al usuario que introduzca el número 12. Después debe decirle si lo ha hecho correctamente o no.

public class Propuesto2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;

        System.out.println("INTRODUZCA EL NUMERO DOCE");
        num = teclado.nextInt();

        if (num == 12){
            System.out.println("EL NUMERO QUE HA INTRODUCIDO ES CORRECTO");
        }else{
            System.out.println("POR FAVOR, INTRODUZCA EL NUMERO DOCE");
        }
    }
}
