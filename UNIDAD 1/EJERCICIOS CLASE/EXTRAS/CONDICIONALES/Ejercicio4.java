package com.company;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        byte horas;

        System.out.println("INTRODUZCA EL NÚMERO DE HORAS TRABAJADAS EN UNA SEMANA");
        horas = teclado.nextByte();



        if (horas <= 40){
            System.out.println("SU SALARIO SEMANAL ES DE: " + horas * 12);
        } else {
            System.out.println("SU SALARIO SEMANAL ES DE: " + (40 * 12 + (horas - 40) * 16));
        }
    }
}
