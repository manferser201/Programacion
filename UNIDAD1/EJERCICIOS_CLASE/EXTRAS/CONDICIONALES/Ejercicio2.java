package com.company;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        byte hora;

        System.out.println("INTRODUZCA UN HORA");
        hora = teclado.nextByte();

        if (hora >= 6 && hora <= 12){
            System.out.println("BUENOS DÍAS");
        } else if (hora >= 13 && hora <= 20){
            System.out.println("BUENAS TARDES");
        } else if ((hora >= 21 && hora <= 24) || (hora < 0 && hora <= 5)){
            System.out.println("BUENAS NOCHES");
        } else {
            System.out.println("LA HORA ES INCORRECTA");
        }
    }
}
