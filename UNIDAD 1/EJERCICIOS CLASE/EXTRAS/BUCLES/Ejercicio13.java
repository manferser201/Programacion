package com.company;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        byte i, total_suspensos, total_condicionados, total_aprobados;
        double nota;

        total_suspensos = 0;
        total_condicionados = 0;
        total_aprobados = 0;

        for (i = 1; i <= 5; i++){
            System.out.println("INTRODUCE UNA NOTA");
            nota = teclado.nextByte();

            if (nota < 5 && nota !=4){
                total_suspensos++;
            } else if (nota == 4){
                total_condicionados++;
            } else {
                total_aprobados++;
            }
        }

        System.out.println("EN LAS 6 NOTAS INTRODUCIDAS HAY " + total_aprobados + " APROBADOS, "
                + total_suspensos + " SUSPENSOS Y " + total_condicionados + " CONDICIONADOS");


    }
}
