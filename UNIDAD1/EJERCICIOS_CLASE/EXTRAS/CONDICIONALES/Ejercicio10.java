package com.company;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int hora, minutos;

        System.out.println("INTRODUZCAS LA HORA QUE ES");
        hora = teclado.nextInt();
        System.out.println("INTRODUZCAS LOS MINUTOS QUE SON");
        minutos = teclado.nextInt();

        if (hora > 0 && minutos > 0){
            System.out.println("FALTA PARA MEDIANOCHE " + ((60 - minutos * 60) + ((23 - hora) * 60 * 60)) + " SEGUNDOS");
        } else if ((hora < 0 || hora > 23) || (minutos < 0 || minutos > 60)){
            System.out.println("DAROS ERRÓNEOS");
        }
    }
}
