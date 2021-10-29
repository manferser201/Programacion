package com.company;
import java.util.Scanner;

public class Ejercicio4_2021 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Integer horas, minutos, segundos, incremento;

        System.out.print("INTRODUZCA LAS HORAS: ");
        horas = teclado.nextInt();

        System.out.print("INTRODUZCA LOS MINUTOS: ");
        minutos = teclado.nextInt();

        System.out.print("INTRODUZCA LOS SEGUNDOS: ");
        segundos = teclado.nextInt();

        System.out.print("INTRODUZCA LOS SEGUNDOS A INCREMENTAR: ");
        incremento = teclado.nextInt();

        for (int i = 1; i < incremento; i++) {
            segundos++;
            if (segundos > 59){
                segundos = 0;
                minutos++;
            }
            if (minutos > 59){
                minutos = 0;
                horas++;
            }
            if (horas > 23){
                horas = 0;
            }

            System.out.println(horas + ":" + minutos + ":" + segundos);
        }
    }
}
