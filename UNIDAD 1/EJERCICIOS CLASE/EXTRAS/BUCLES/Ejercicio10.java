package com.company;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        byte num, tabla;

        do{
            System.out.println("INTRODUCE UN NÚMERO DEL 1 AL 10");
            num = teclado.nextByte();

            if (num < 1 || num > 10){
                System.out.println("INTRODUCE DE NUEVO UN NÚMERO, PERO QUE ESTÉ ENTRE EL 1 Y EL 10");
                num = teclado.nextByte();
            } else {
                for (tabla = 0; tabla <= 10; tabla++){
                    System.out.println(num * tabla);
                }
            }



        } while (num <= 10);
    }
}
