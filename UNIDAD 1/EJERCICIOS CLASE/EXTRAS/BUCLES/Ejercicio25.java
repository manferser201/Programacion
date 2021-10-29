package com.company;
import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        byte filas, columnas;
        int i, j;

        System.out.println("INTRODUCE UNA ALTURA PARA LA U");
        filas = teclado.nextByte();
        columnas = 5;

        for (i = 1; i <= filas; i++){
            if (i == filas){
                System.out.println("-***-");
            } else{
                for (j = 1; j <= columnas; j++){
                    if (j == 1 || j == 5){
                        System.out.print("*");
                    } else {
                        System.out.print("-");
                    }
                }
                System.out.println();
            }

        }
    }
}
