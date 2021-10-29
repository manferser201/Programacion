package com.company;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String dia;
        int horas, minutos;

        System.out.println("INTRODUZCA UN DÍA DE LA SEMANA (Lunes, Martes, ..., Viernes)");
        dia = teclado.nextLine();

        System.out.println("INTRODUZCA UNA HORA (SOLO LA HORA)");
        horas = teclado.nextInt();

        System.out.println("INTRODUZCA LOS MINUTOS");
        minutos = teclado.nextInt();


        if (dia.equals("Viernes")){
            System.out.println("QUEDAN PARA EL FIN DE SEMANA " + ((900) - (horas * 60 + minutos)) + " MINUTOS");

        } else if (dia.equals("Jueves")){
            System.out.println("QUEDAN PARA EL FIN DE SEMANA " + ((5 - 4 - 1) * 1440 + (1440 - horas * 60) + ((15 * 60) - minutos)) + " MINUTOS");

        } else if(dia.equals("Miercoles")){
            System.out.println("QUEDAN PARA EL FIN DE SEMANA " + ((5 - 3 - 1) * 1440 + (1440 - horas * 60) + ((15 * 60) - minutos)) + " MINUTOS");

        } else if (dia.equals("Martes")){
            System.out.println("QUEDAN PARA EL FIN DE SEMANA " + (((5 - 2 - 1) * 1440) + (1440 - horas * 60) + ((15 * 60) - minutos)) + " MINUTOS");

        } else if (dia.equals("Lunes")){
            System.out.println("QUEDAN PARA EL FIN DE SEMANA " + (((5 - 1 - 1) * 1440) + (1440 - horas * 60) + ((15 * 60) - minutos)) + " MINUTOS");

        } else {
            System.out.println("YA ESTÁS EN FIN DE SEMANA");
        }


    }
}
